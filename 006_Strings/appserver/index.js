const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express()
app.use(bodyParser.json());
app.use(cors());

app.get('/',(req, res) => { res.send('it is working')});

app.listen(3000, () => {
    console.log(`app is running on port 3000`);
});