const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express()
app.use(cors());
app.use(bodyParser.json());

const events = [
      {
        id: 1,
        title: "U",
        date: "30.7.2020",
        location: "England",
        price: "199"
      },
      {
        id: 2,
        title: "E",
        date: "30.7.2020",
        location: "England",
        price: "199"
      },
      {
        id: 3,
        title: "F",
        date: "30.7.2020",
        location: "England",
        price: "199"
      },
      {
        id: 4,
        title: "A",
        date: "30.7.2020",
        location: "England",
        price: "199"
      }
]

app.get('/',(req, res) => { res.send('it is working')});

app.get('/events', (req, res) => {
    res.send(events)
})

app.get('/event/:id', (req, res) => {
    let id = req.params.id;
    for (let i = 0; i < events.length; i++){
        if (id.toString() === events[i].id.toString()){
            res.send(events[i]);
        }
    }
})

app.post('/add_event', (req, res) => {
    let newEvent = req.body;
    if (events.length > 0){
        newEvent["id"] = 1;
    }else{
        newEvent["id"] = events.length - 1
    }
    events.push({...newEvent});
})

app.put('/event/:id',(req, res) => {
    let id = req.params.id;
    let updateEvent = req.body;
    for (let key in events){
        if (events[key].id.toString() === id.toString()){
            events[key] = {...events[key],...updateEvent}
        }
    }
})

//app.delete()

app.listen(3005, () => {
    console.log("app is listening on port", 3005);
});
