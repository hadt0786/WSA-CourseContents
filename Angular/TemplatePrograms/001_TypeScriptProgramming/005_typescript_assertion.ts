/******************************************************************************
+   Description : Type Assertion
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

let myNumberOne = 10;

console.log ("Number as a string, Simple->" + myNumberOne.toString(10));

let myNumberTwo;
myNumberTwo = 1000;

// Somewhat similar to type casting 
console.log ("Number as a string, Type Assertion ->" + (<number>myNumberTwo).toString()); 
