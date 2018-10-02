/**
 * Title : This is the INDEX.JS  . The main application
 * 
 * from frontent to backend workFlow
 * www.localhost:27017/home
 * index.js --> home.js(routes-->express module)-->home.js(model-->database-->Mongodb)
 * 
 * Now for display
 * Backend to frontend
 * 
 * Http Request--> verify the authorisation
 * 
 * home.js(home.js-->mongodb ) -->home.js(routes-->express)-->public home/.html
 * 
 * 
 * Course API implementation using express. ROutes are split in individua; files.
 * 
 * Description :
 * We are using the following built in middleware functions
 * 1.   express.json()
 *      It parses incoming requests with JSON payloads and is based on body parser
 *      This middleware is available in Express v4.16.0
 * 
 * 2.   express.urlencoded()
 *      It parses incomin requests with urlencoded payloads
 *      and is based on body-parser.
 * 
 * 3.   morgan 
 *      
 */


 //Import Express

 const express = require('express');
 const app = express();
 const morgan = require('morgan');

 const courses = require('./routes/course');
 const session = require('./routes/session');
 const home = require('./routes/home');

 // Using a Json middleware
 app.use(express.json());

 // Use the urlencoded middleware from express
 // Parses request body in this form: key1=value1&key2=value2,
 // and construct a json object

 app.use(express.urlencoded({extended:true}));

 app.use(morgan('tiny'));

 // Use the route
 app.use('/api/courses',courses);
 app.use('/api/session',session);
 app.use('/',home);
 app.use(express.static('public')); //static files in public

 // Read PORT from env if set
 const port = process.env.HTTP_PORT||5000;

 // listen on port
app.listen(port, ()=>{
    console.log(`listening on port ${port}`);
})
















