// Include the required modules
const { isValidUser } = require('../models/users');
const express = require('express');
const Joi = require('joi'); // JSON validation
const {genrateToken, verifyToken}  = require('../utils/auth');
const route = express.Router();

/****************** BEGIN: post requests *************/

// http://localhost/api/session - POST - {JSON userInfo}
// POST
// http://localhost/api/session - POST - {JSON userInfo}
// POST API to create a new session (Login)

route.post('/', (req, res) => {
    // Validate the course info
    const { error } = validateUser(req.body); //Joi
    if (error) {
        res.status(400);
        res.send(error.details[0].message); // Sending 1st error message
        console.log(error);
        return;
    }
    //Validate User credentials
    isValidUser(req.body)
    .then((result) =>{
        if(result){
            var payload = {userInfo:req.body.username};
            genrateToken(payload,function(err,token){
                    if(!err){
                        res.status(200).send(token);
                        console.log("Token", token);
                    }
                    else {
                        res.status(500).send("token is not working");
                        console.log("Error in toke");
                    }
            });
        }
        else{
            res.status(422).send(result);
        }
    })
    .catch((err) =>{
        res.status(500);
        res.send("Error: Unable to validate user\n" + err.message);
        console.log("Error: Unable to validate user\n", err);
    })
});

//Validate function
function validateUser(userInfo) {
    // Define schema
    const schema = {
        username: Joi.string().min(4).max(60).required(),
        password: Joi.string().min(4).max(60).required(),
    };

    // Validate
    const result = Joi.validate(userInfo, schema);

    return result;
}
/****************** END: post requests *************/

/****************** JSON weB TOken *****************/



module.exports = route;