/******************************************************************************
+   Description : Usage of Classes - Simple calculator
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

// Pack multiple attributes together, start with CAPITAL LETTER
class MyInputs {
    x: number;
    y: number;
    
    add() {
        console.log("The addition is " + (this.x + this.y));
    }

    sub() {
        console.log("The subtraction is " + (this.x - this.y));
    }

}

let currentInput = new MyInputs();

currentInput.x = 100;
currentInput.y = 50;

currentInput.add();
currentInput.sub();