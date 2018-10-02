class Student{
    name:string;
    email:string;
    phone:string;
}

class RegularStudent{
    course:string;
    marks:number;
    batch:string;

    display(){
        console.log("Marks = " +this.marks);   
        console.log("Course = " +this.course);   
        console.log("Batch = " +this.batch);   
    }
}

let input = new RegularStudent;
input.course = "Full Stack Developer";
input.marks = 50;
input.batch = "Morning";

input.display();
