/******************************************************************************
+   Description : Usage of super in Classes 
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

class Dosa {
    dosaName: string;

    constructor(theName: string)
    { 
        console.log("Dosa initialization");
        this.dosaName = theName; 
    }

    makeDosa() {
        console.log("Whatever type...its fundamentally Dosa...")
    }
}

class MasalaDosa extends Dosa {

    dosaPrice: number; 

    constructor(dName: string, dPrice: number) 
    { 
        // Constructors in derived class should have super as their first item 
        super(dName);
        this.dosaPrice = dPrice; 
    } 

    makeDosa() {
        console.log("Masala dosa..but looks like customer wants something else...");
        super.makeDosa(); 
    } 

} 

class OnionDosa extends Dosa {

    dosaContent: string;
    dosaPrice: number; 

    constructor (dName: string, dContent: string, dPrice: number)
    {
        super(dName);
        this.dosaContent = "onion";
        this.dosaPrice = dPrice; 
    }

    makeDosa() {
        console.log("Onion dosa..the best ever...");
    }
}

let firstDosa = new MasalaDosa("MTR",100);
console.log ("Dosa name-->" + firstDosa.dosaName + "  Dosa price-->" + firstDosa.dosaPrice);
firstDosa.makeDosa();

let secondDosa = new OnionDosa("Adigas", "OnionAndOil", 120);
console.log ("Dosa name-->" + secondDosa.dosaName + "  Dosa price-->" + secondDosa.dosaPrice + "  Dosa content-->" + secondDosa.dosaContent);
secondDosa.makeDosa();
