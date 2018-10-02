// Parent Class 
class Student{
    name:string;
    email:string;
    phone:number;

    simple()
    {
        console.log("Simple method in parent class..");
    }

    display()
    {
        console.log("Method overriding example...");
    }
}

// Child Class / Inherited class 
class RegularStudent extends Student {
    course:string;
    marks:number;
    batch:string;

    display1(){
        console.log("Marks = " +this.marks);   
        console.log("Course = " +this.course);   
        console.log("Batch = " +this.batch);   
        console.log("Name = " + this.name);
        console.log("Email = " + this.email);
        console.log("Phone = " + this.phone);
    }
}

let input = new RegularStudent;

input.name = "Vatan";
input.email = "vatan@gmail.com"
input.phone = 98451;

// Here we are able to use the attributes from the parent class 
input.course = "Full Stack Developer";
input.marks = 50;
input.batch = "Morning";


input.display();

// Here we are able to use the method from parent class 
input.simple();