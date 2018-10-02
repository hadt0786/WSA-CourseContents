// Import Express
const express = require('express');
const routes = express.Router();

// Import joi for schema validation
routes.get('/', (req,res)=>{
    res.send("Hello world");
});

module.exports = routes;