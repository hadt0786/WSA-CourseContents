/*
Title : Math related library
Description : Defines function to return math val

*/

//define the math objects

var math = {};

//function to return a random value between min and max
math.getRandomNumber = function (min,max){
    // get a random number using math.random
    var randomVal = Math.random();
    //code to normalize value betwen min and max
randomVal  = randomVal*(max-min+1)+min;
//console.log(randomVal);


    //return number

    return Math.floor(randomVal);
}

//math.getRandomNumber(1,10);

//export 
module.exports = math;