/*
 * Title: Object destructuring illustration - 1
 */
const person = {
    firstName: "Mubeen",
    lastName: "Jukaku",
    phone: "1122334455"
};

// Object Destructuring
const {firstName, lastName} = person;
// firstName = person.firstName;
// lastName= person.lastName;

console.log(firstName);
console.log(lastName);

//Specify var name
const {firstName: fName, lastName: lName} = person;

console.log(fName);
console.log(lName);
