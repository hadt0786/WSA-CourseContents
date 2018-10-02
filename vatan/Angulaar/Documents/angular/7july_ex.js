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
var StudentData = /** @class */ (function () {
    function StudentData(vad1, vad2, vad3, vad4) {
        this.name = vad1;
        this.num = vad2;
        this.Eligibility = vad3;
        this.city = vad4;
    }
    StudentData.prototype.eligible = function () {
        if (this.Eligibility == true) {
            return this.Eligibility = true;
        }
    };
    StudentData.prototype.eligibleQwe = function () {
        console.log("Eligibility = " + this.Eligibility);
    };
    return StudentData;
}());
var WSAStudent = /** @class */ (function (_super) {
    __extends(WSAStudent, _super);
    function WSAStudent(val1, val2, val3, val4, var1, var2, var3, var4, var5) {
        var _this = _super.call(this, val1, val2, val3, val4) || this;
        _this.courseName = var1;
        _this.courseStatus = var2;
        _this.courseFee = var3;
        _this.balanceFee = var4;
        _this.payment = var5;
        return _this;
    }
    WSAStudent.prototype.printStudentData = function () {
        console.log("Name = " + this.name);
        console.log("Number = " + this.num);
        _super.prototype.eligibleQwe.call(this);
        console.log("City = " + this.city);
        console.log("CourseName = " + this.courseName);
        console.log("CourseStatus = " + this.courseStatus);
        console.log("CourseFee = " + this.courseFee);
        console.log("BalanceFee = " + this.balanceFee);
        console.log("Payment = " + this.payment);
    };
    WSAStudent.prototype.payFee = function () {
        if (this.balanceFee == 0) {
            console.log("No Balance Left");
        }
        else {
            console.log("you have to first pay the remaining Fee Balance.");
        }
    };
    WSAStudent.prototype.getPlacementStatus = function () {
        if (_super.prototype.eligible.call(this) && this.payment == true) {
            console.log("He is eligible for placements.");
        }
        else {
            console.log("You have to pay the remaining fee to become eligible for the placements.");
        }
    };
    return WSAStudent;
}(StudentData));
var student = new WSAStudent("vatan", 9729855849, true, "Ambala", "Full Stack Developer", "Angular", 42000, 0, true);
student.printStudentData();
student.payFee();
student.getPlacementStatus();
