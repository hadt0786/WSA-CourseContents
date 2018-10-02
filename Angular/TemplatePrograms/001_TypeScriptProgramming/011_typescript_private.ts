/******************************************************************************
+   Description : Private member access 
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

// Class 
class MyInputs {
    private x: number;
    private y: number;
    public  z: number; 

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
var currentInput1 = new MyInputs(100,50);

// Call methods now 
currentInput1.add();
currentInput1.sub();

// Set the public field from outside
currentInput1.z = 100; 
