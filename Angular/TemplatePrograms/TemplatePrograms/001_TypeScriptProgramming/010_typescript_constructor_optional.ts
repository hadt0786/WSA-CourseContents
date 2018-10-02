/******************************************************************************
+   Description : Usage of Classes - Constructor
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

// Class 
class MyInputs {
    x: number;
    y: number;

    constructor (val1?: number, val2?: number){
        this.x = val1;
        this.y = val2;
    }

    add() {
        console.log("The addition is " + (this.x + this.y));
    }

    sub() {
        console.log("The subtraction is " + (this.x - this.y));
    }

}

// Object 
let currentInput1 = new MyInputs(100,50);

// Call methods now 
currentInput1.add();
currentInput1.sub();

let currentInput2 = new MyInputs();

currentInput2.x = 400;
currentInput2.y = 100;

// Call methods now 
currentInput2.add();
currentInput2.sub();