/* JSON basics */

// Javascript object. Contains name value pairs
// Terms key-value and property-value are also used
var personObj = {
    name: "Mubeen",
    id: 10,
    height: 5.7
};

// JSON format. The name/key should be in double quotes
var personJSON = {
    "name": "Mubeen",
    "id": 10,
    "height": 5.7
};

console.log("JS", personObj);
console.log("JSON", personJSON);

// Get value for a given key
var myName1 = personObj.name;
var myName2 = personObj['name'];

console.log("Name: " + myName1);
console.log("Name: " + myName2);

personObj.id = 50;
console.log(personObj);