/* Using JSON.parse and stringify */

var str = '{"name": "Mubeen", "id": 10, "height": 5.7, "join": 7-8-2018 }';

// Convert a JSON string into an JS object
var personObj = {};
try {
    personObj = JSON.parse(str);
    console.log(personObj);
    console.log(personObj.name);
}
catch (e) {
    console.log("ERROR:", e);
}

// Convert a JS object into a string
var student = {
    name: "Ajay",
    id: 12,
    age: 24,
    registered: true,
    join: new Date()
};

var studentStr = JSON.stringify(student);
console.log(studentStr);