const person = {
    firstName:"AKASH",
    lastname:"mohan",
    phone:"1122333"
};

const {firstName, lastname} = person ;

console.log(firstName);
console.log(lastname);

const {firstName:fName, lastname:lName} = person;

console.log(fName);
console.log(lName);
