var personObj = {
    name : "AKASH",
    id:10,
    height : 5.7,
};

var hasName = personObj.hasOwnProperty('name');
console.log("hasName: "+hasName);

if(personObj.hasOwnProperty('age')){
    console.log("Age : "+personObj.age);
}
else {
    console.log("age proper does not exist" +hasName);
}