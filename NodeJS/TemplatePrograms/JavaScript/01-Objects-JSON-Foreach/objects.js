/* JSON: Objects as value */

var emp = {
    "employee" : {"name": "John", "age": 25}
};

console.log(emp.employee); //Print the value for key employee

console.log(emp.employee.name); // Returns "John"

console.log(emp.employee["age"]); // Returns 25
