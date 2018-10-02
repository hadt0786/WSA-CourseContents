/* JSON basics - check for property using hasOwnProperty function */

// Javascript object. Contains name value pairs

var personObj = {
    name: "Mubeen",
    id: 10,
    height: 5.7
};

// Use hasOwnProperty to check whether propery exists
var hasName = personObj.hasOwnProperty('name');
console.log("hasName: " + hasName);

if(personObj.hasOwnProperty('age')) {
    console.log("Age: " + personObj.age);
}
else {
    console.log("Age property does not exist");
    //console.log("Age: " + personObj.age);
}
