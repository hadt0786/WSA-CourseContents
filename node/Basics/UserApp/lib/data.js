/*

Library to crud file ops
*/

//Dependencies

var fs = require('fs');

var path = require('path');

var data ={};

//function to create the user
//dir : dir path for saving the file
//phone is the filename without .json extension
//data is the userObj to be saved
// callback is a callback funtion


data.create=function(__dirname, phone, data, callback){

// construct the path
//__dirname --> current directory name double underscore
//var filePath = "../data/"+dir+"/"+phone+".json";
var absPath = __dirname+"/"+"../data/"+dir+"/"+phone+".json";
//console.log("path : ",filePath);
console.log("Absolute path : ", absPath);

fs.open(absPath, "wx". function(err,fd)){
if(!err){
    fs.write(fd, JSON.stringify(data), function(err){

    });
}
};
//data.create('users',"9955665544",userObject.function(err)());

module.exports = data;