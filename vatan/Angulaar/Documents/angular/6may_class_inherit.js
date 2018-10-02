var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// Parent Class 
var Student = /** @class */ (function () {
    function Student() {
    }
    Student.prototype.simple = function () {
        console.log("Simple method in parent class..");
    };
    Student.prototype.display = function () {
        console.log("Method overriding example...");
    };
    return Student;
}());
// Child Class / Inherited class 
var RegularStudent = /** @class */ (function (_super) {
    __extends(RegularStudent, _super);
    function RegularStudent() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    RegularStudent.prototype.display1 = function () {
        console.log("Marks = " + this.marks);
        console.log("Course = " + this.course);
        console.log("Batch = " + this.batch);
        console.log("Name = " + this.name);
        console.log("Email = " + this.email);
        console.log("Phone = " + this.phone);
    };
    return RegularStudent;
}(Student));
var input = new RegularStudent;
input.name = "Vatan";
input.email = "vatan@gmail.com";
input.phone = 98451;
// Here we are able to use the attributes from the parent class 
input.course = "Full Stack Developer";
input.marks = 50;
input.batch = "Morning";
input.display();
// Here we are able to use the method from parent class 
input.simple();
