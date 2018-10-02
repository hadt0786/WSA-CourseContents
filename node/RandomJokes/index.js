/*
title : Application is print random jokes
Description : Print a joke for every 
*/

//Dependencies
var jokesLib = require('./lib/jokes');
var mathLib = require('./lib/math.js');

//Define an app object
var app = {};

app.confirguration = {
    'timeInterval':2000
}
//function to print a ramdom integer

app.printJoke = function (){
    //Step 1 : get all the jokes
    //new line Linux and mac os - '\n and windows: '\r\n'
    // ? --> means optional
var allJokes = jokesLib.getAllJokes().split(/\r?\n/);
//console.log(allJokes);
  
//get the length
var len = allJokes.length;
    //get a random number between 1 to max number of jokes
var randomIndex = mathLib.getRandomNumber(1,len);
    // pick a joke at random index
var randomJoke = allJokes[randomIndex - 1];
    //print the joke

    
console.log(randomJoke);
}

//function which runs indefinetily

app.indefiniteLoop = function(){
    setInterval(app.printJoke,app.confirguration.timeInterval);

}

app.indefiniteLoop();
