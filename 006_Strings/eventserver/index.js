const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express()
app.use(cors());
app.use(bodyParser.json());

const events = [
      {
        id: 1,
        title: "UEFA",
        date: "30.7.2020",
        location: "England",
        price: "199"
      },
      {
        id: 2,
        title: "UEFA",
        date: "30.7.2020",
        location: "England",
        price: "199"
      },
      {
        id: 3,
        title: "UEFA",
        date: "30.7.2020",
        location: "England",
        price: "199"
      },
      {
        id: 4,
        title: "UEFA",
        date: "30.7.2020",
        location: "England",
        price: "199"
      }
]

app.get('/',(req, res) => { res.send('it is working')});

app.get('/events', (req, res) => {
    res.send(events)
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

app.listen(3005, () => {
    console.log("app is listening on port", 3005);
});
