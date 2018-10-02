/******************************************************************************
+   Description : Arrow Function usage - Various ways 
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

// Old JavaScript way of calling a function...
let typeOne = function(message) {
    console.log ("JavaScript way of function...normal function");
    console.log (message);
}

let messageOne = 'Test1';
typeOne(messageOne);

// Arrow function, note the syntax 
let typeTwo = (message: string) => {
    console.log("TypeScript way of function...arrow function..")
    console.log(message);
}

let messageTwo = 'Test2';
typeTwo(messageTwo);

// Arrow function with returning a primitive integer 
let typeThree = (message: string) => {
    let x: number;
    x = message.length;
    return x; 
}

let myLength: number; 
let messageThree = 'Test3';
myLength = typeThree (messageThree);
console.log (myLength);

// Arrow function - passing and returning arguments as interfaces 

// Interface to send the output / return value 
interface MyAssessments {
    overallMarks: number,
    overallBand: string,
}

// Interface for sending input arguments 
interface MyInputs {
    myAttendance: number,
    myAssignments: number,
    myProject:number,
    myTest:number, 
}

let typeFour = (studentInput: MyInputs) => {

    // Ensure you initialize interface elements, failing which you will get compilation error 
    let value: MyAssessments = { overallMarks:0, overallBand:null }   
   
    value.overallMarks = studentInput.myTest + studentInput.myAttendance + studentInput.myAssignments + studentInput.myProject;
    value.overallBand = "Green";
    
    return value; 
}

let resultValue: MyAssessments; 
let student: MyInputs = { myAttendance:0, myAssignments:0, myProject:0, myTest:0 }

student.myAttendance = 20;
student.myAssignments = 20;
student.myProject = 20;
student.myTest = 25; 

resultValue = typeFour(student);

console.log(resultValue.overallMarks);
console.log(resultValue.overallBand);

// Arrow functions for simple expressions. Return is not required.
let typeFive = (a) => (a + 1)

let fiveTest = 5;
fiveTest = typeFive(fiveTest);
console.log(fiveTest);