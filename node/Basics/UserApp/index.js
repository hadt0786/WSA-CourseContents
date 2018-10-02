/*
Title : test code to use the CRUD function
*/

//dependencies 
var fops = require('./lib/data');


var user = {
    "firstName" : "AKASH",
    "lastName" : "Chaudhary",
    "firstName" : "8265845501",
    "password" : "secret",
    "tosAssignment" : true

};

//create the user 

fops.create('user', user.phone, user, function(err){
    if(err){
        console.log("ERROR:couls not create error, ", err);;
    }
    else {
        console.log("Success : Save user to file");
    }
});