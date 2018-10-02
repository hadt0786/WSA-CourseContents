class Dosa{
    dosaName:string;

    constructor (name:string){
        console.log("Initializing...");
        this.dosaName = name;
    }

    makeDosa(){
        console.log("Its just a Dosa.");
    }

    billDosa() {
        console.log("Bill is ready");
    }
}
class DosaPrice extends Dosa{
    dosaPrice:number;

    constructor (newName:string, price:number){
        super(newName);
        this.dosaPrice = price;
    }
    makeDosa(){
        console.log("Dosa");
        //super.makeDosa();
    }

    testDosa() {
        super.billDosa();
    }
}
class AnotherDosa extends Dosa{
    dosaContent:string;
    priceDosa:number;

    constructor (onion:string,content:string,onionPrice:number){
    super(onion);
    this.dosaContent = content;
    this.priceDosa = onionPrice;    
    }

    makeDosa(){
        console.log("onion Dosa");
    }
}

let masalaDosa = new DosaPrice("MTR",100);
let onionDosa = new AnotherDosa("onion","onion and oil",120);
masalaDosa.makeDosa();
onionDosa.makeDosa();

masalaDosa.testDosa();