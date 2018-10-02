class Example{
    private x: number;
    private y: number;
    public  z: number;

    constructor(val1: number, val2: number, val3: number) {
        this.x = val1;
        this.y = val2;
        this.z = val3; 
    }

    add(){
        console.log("Ans =" + this.x + this.y);
    }

    sub(){
        console.log("Ans =" + (this.x - this.y));
    }
}

let qwe = new Example(100,50,20);
console.log("z = " +qwe.z);
qwe.add();
qwe.sub();