class MyInputs {
    x:number;
    y:number;

    constructor (val1:number, val2?: number){
        this.x = val1;
        this.y = val2;
    }

    add(){
        console.log(this.x + this.y);
    }

    sub(){
        console.log(this.x - this.y);
    }
}

let currentInput = new MyInputs(100,50);

currentInput.add();
currentInput.sub();

let secondInput = new MyInputs(500); 
secondInput.x = 200;
secondInput.y = 100;

secondInput.add();
secondInput.sub(); 
