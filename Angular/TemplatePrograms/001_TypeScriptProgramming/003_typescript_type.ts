/******************************************************************************
+   Description : Variable Annotation (Strict type checking)
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

// Note the scope differences

function scopeTesting()
{
    var testVar = 100;

    for (let testLet = 0; testLet <= 10; testLet++)
    {
        console.log ("The value of Let " + testLet);
        console.log ("The value of Var " + testVar);
    }

    console.log ("The value of Var" + testLet);
    console.log ("The value of Var" + testVar);
}


// Let usage

let myNumber: number;
let myString: string;

// The program will still compile,but it gives early indication of issues 

myNumber = 'a';
myString = 100;

console.log(myNumber);
console.log(myString);

// Let usage 

myLetTest = 100;
let myLetTest; 
