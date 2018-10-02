/*
Title : REST API for users
Description :Implements CRUD APIS for user
*/

//Include required modules

const express = require('express');
const app = express();
const Joi = require('joi');

//USE JSON and urlencoded middleware
app.use(express.json());
app.use(express.urlencoded({extended :true}));

//Validate function
function validateUser(user){
    //define schema
    const schema = { 
        firstName : Joi.string().min(3).required();
        lastName : Joi.string().min(3).required();
        phone : Joi.string().min(3).required();
        password:Joi.string().regex(//);
        tosAgreement : Joii.bool().requires();
    
    };

    //const result =Joi.validate(user,schema);
    return (Joi.validate(user, schema));
}

//Create/POST API for USERS

app.post('/api/users',function(req,res){
    //validate user object(req.body)
    const {error} = validateUser(req.body);

    //if valid return error
    if(error){
        req,status(400).send(error.details);
        console.log(error.details);
        return;
    }

    var user = req.body;
    //save the user object to file

    fops.create('users',user.phone,user,function(err){
        if(err){
            console.log("Error : could not create user",err);
            res.status(400).send("Error: could not create user\n",err.message);
            
    ")
        }
    })
});

//List API for listing all USers USERS 



//Read/GET API for Users with param as phone


//Update/PUT API for Users with param as phone


//DELETE  API for Users with param as phone

//Start the server
const port = process.env.HTTP_PORT || 5000;

app.listen(port,()=>{
    console.log('listening on server ${port}');
});