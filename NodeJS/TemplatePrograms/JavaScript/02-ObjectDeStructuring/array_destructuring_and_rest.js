/*
 * Title: Program illustrating array destructuring, elision and rest (...) operator
 */

var fruits = ['apple', 'mango', 'orange', 'banana', 'pineapple'];

// 1. Array destructuring
var [first, second] = fruits;
console.log(first, second);

// 2. Elision (holes)
var [i1, i2, , , i5] = fruits; // Skip two values
console.log(i1, i2, i5);

// 3. Rest operator (...)
var [start, ...rest] = fruits;
console.log("Start: ", start);
console.log("Rest: ", rest); // contains all remaining values


