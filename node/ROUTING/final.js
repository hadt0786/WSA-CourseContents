/*
 * Title: Course API Implementaion using express
 * Description:
 * We are using following built-in middleware functions
 * 1. express.json() 
 *    It parses incoming requests with JSON payloads and is based on body-parser.
 *    This middleware is available in Express v4.16.0 onwards.
 * 
 * 2. express.urlencoded()
 *    It parses incoming requests with urlencoded payloads
 *    and is based on body-parser.
 */

// Import Express
const express = require('express');
const app = express();

// Import joi for schema validation
const Joi = require('joi');

const course = require('./routes/courses');

const home = require('./routes/home');



//Use json middleware
app.use(express.json());
// Use the urlencoded middleware from express
// Parses request body in this form: key1=value1&key2=value2,
// and construct a json object
app.use(express.urlencoded({extended: true}));

app.use('/api/courses', course);
app.use('/',home);

// Validate function
function validateCourse(course) {
    // Define schema
    const schema = {
        name: Joi.string().min(3).required()
    };

    // Validate
    const result = Joi.validate(course, schema);

    return result;
}

// Read PORT from env if set
const port = process.env.HTTP_PORT || 5000;
//listen on port
app.listen(port, () => {
    console.log(`Listening on port ${port}`);
});