class Dosa {
    dosaName : string;

    constructor (theName:string){
        this.dosaName = theName;
    }

    makeDosa(){
        console.log("whatever it is.. fundamentally it is a dosa");
    }
}

class MasalaDosa extends Dosa {
    dosaPrice : number;

    constructor (dPrice: number , dName : string){
        super(dName);
        this.dosaPrice = dPrice;
    }

    makeDosa(){
        console.log("MAsala Dosa.. ");
        //super.makeDosa();
    }

}

class OnionDosa extends Dosa  {
    dosaContent : string; 
    dosaPrice : number;

    constructor (dName : string, dContent : string, dPrice : number){
        super(dName);
        this.dosaContent = dContent;
        this.dosaPrice = dPrice;
    }

    //overriding always calls the child class method
    makeDosa(){
        
        console.log("Onion dosa,");
    }
}

let firstDosa = new MasalaDosa(100,"MTR");
firstDosa.makeDosa()