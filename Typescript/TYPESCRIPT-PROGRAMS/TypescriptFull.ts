//There are BAsic 3 types of TYPESCRIPT

let isDone : boolean = false;
let lines:number=42;
let name:string="AKASH";

//but you can omit the type annotattion if the variables are 
//derived from explicit literals

let isDone = false;
let lines = 42;
let name = "AKASH";

//when it's impossible to knoe, the is "ANY" type

let notSure :any = 4;
notSure = "maybe a string instead";
notSure = false;

//use const keyword for constants

const numLivesForCat = 9;
numLivesCat = 1; //Error

//FOr COllections, there are types arrays and generic arrays

let list:number[] = [1,2,3];
//Alternatively, using the genric array type
let list :Array<number>=[1,2,3];

//for enumeration

enum Color{ Red, Green, Blue};
let c:Color = Color.Green;

//LAstly, "VOID" is udes in the special case of a function returning nothing


function bigHorribleALert():void {

    alert("I am a little annoying box!");
}

//Function are first class citizens , supprt the lambda " fat Arrow" syntax and 
//use type inteference

//The following are equivalent the same signature will be inferred by the 
//compiler and same javascript will be emitted

let f1 = function (i:number):number{return i*i;}
//Return type inferred

let f2 = function (i:number){return i*i;}

//"Fat Arrow " syntax

let f3 = (i:number):number =>{return i*i;}

//"FAT ARROW " syntax with return type inferred

let f4 = (i:number)=>{return i*i;}

//"FAt ARROW " syntax with return type inferred, braceless
//means no return KEYOWD NEEDDED

let f5 = (i:number)=>i*i;


//OBJECT THAT IMPLEMENTS PERSON interface 
//can be treated as a PErson since it has the name and move properties

let p: Person = {name:"Bobby",move:()=> {}};
//Objects that have the optional property

let validPerson:Person = { name:"BObby", age:42, move:()=>{}};

//Is not a person because age is not a number

let invalidPerson : Person = { name:"bobby", age:true};

//Interfaces can also describe a function type
interface SearchFunc{
    source : string, subString : string):boolean;

}

//Only the parametes types are important , names are not important

let mySearch : SearchFunc;
mySearch = function (src:string, sub:string){
    return src.search(sub)!=-1;
}


//CLASSES - members are public by default

class Point{
    //Properties
    x:number;

    //Constructor -- the PUBLIC PRIVATE keywords in this context will genrate
    //the boiler plate code for the property and the initialisation in the 
    //contructor 
    //In this Example "y" will be defined just lije "x" is but with less code

    //Default values are also supported

    constructor(x:number, public y:number=0){
        this.x = x;
    }

    //functions
    dist(){
        return Math.sqrt(this.x*this.y+this.y);
    }


    //static members 

    static origin = new Point(0,0);
}

let p1 = new Point(10,20);
let p2 = new Point(25); //y will be 0

//Inheritance


class Point3D extends Point {
    constructor (x:number, y:number, public z:number=0){
        super(x,y);//Explicit call to the super class
        //constructor is mandatory
    }

    //Overwrite
    dist(){
        let d = super.dist();
        return Math.sqrt(d*d+this.z*this,z);
    }
}

//Modules "." can be used as separator for sub modules
module Geomertry {
    export class Square {
        constructor (public sideLength : number =0){

        }
        area(){
            return Math.pow(this.sideLength,2);

        }
    }
}


let s1= new Geomertry.Square(5);

//local alias for referencing a module
import G = Geometry;

let s2 = new G.Square(10);

//Generics 
//classes

class Tuple<T1, T2>{
    constructor(public item1:T1,public item2:T2){

    }
}

//Interfaces
interface Pair<T>{
    item1:T;
    item2:T;
}

//And FUnction

let pairToTuple = function<T>(p:Pair<T>){
    return new Tuple(p.item1, p.item2);
};

let tuple = pairToTuple({
    item1:"hello",item2:"world"
});

//Including references to a definition file:
//<reference path = "jquery.d.ts"/>

//Template strings (strings that use backticks)
//String Intepolation with template string

let name  = "AAKA";
let greeting = 'hi ${name},how are you?';
//Multiple Strings with template strings
let multiline = ' Ths is an
of a multiple string';// not working