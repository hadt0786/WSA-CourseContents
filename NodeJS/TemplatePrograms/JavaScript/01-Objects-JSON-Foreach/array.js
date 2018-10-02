/* JSON - Using array as values */

var fruits = {
    "fruitNames": ["Apple", "Mango", "Banana"]
};

// Has value as an array of objects
var emps = {
    "employees":
        [
            { "name": "John",   "age": 25 }, // [0]
            { "name": "Ravi",   "age": 30 }, // [1]
            { "name": "Sameer", "age": 40 }  // [2]
        ]
};

// console.log(fruits.fruitNames); // Value is an array of strings
// console.log(emps.employees); // Value is an array of objects

// console.log(emps.employees[0]); //Access 1st element in the value
// console.log(emps.employees[1]);

for (var i in emps.employees) { // Loop thru the array
    for (var key in emps.employees[i]) { //Access properties in an object
        console.log(emps.employees[i][key]); //Use [] notation
    }
}