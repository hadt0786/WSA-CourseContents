

var personObj = {
    name : "AKASH",
    id:10,
    height : 5.7,
};

var personJSON = {
    "name" : "AKASH",
    "id":10,
    "height" : 5.7,
};

console.log("JS",personObj);
console.log("JSON",personJSON);

var myName1 = personObj.name;
var myName2 = personObj['name'];

console.log("Name " +myNAme1 );
console.log("NAme " + myNAme2);

personObj.id  = 50;

console.log(personObj);