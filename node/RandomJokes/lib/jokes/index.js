/*
Title :  Jokes lib
Description : library to return a joke list

*/

//dependencies

var fs = require('fs');

//defins an object

var jokes = {};

jokes.getAllJokes = function (){
    //read the jokes from jokes.txt

  var jokesData =  fs.readFileSync(__dirname+'/jokes.txt','utf-8');

//    console.log(jokesData);

    //return the jokes'
	    return jokesData;
}



jokes.getAllJokes();
//export the jokes object
module.exports = jokes;

