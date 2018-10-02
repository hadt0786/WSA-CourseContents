var studentGrade;
(function (studentGrade) {
    studentGrade[studentGrade["Black"] = function print() {
        var name = 'akash';
        var val = 50;
    }] = "Black";
    studentGrade[studentGrade["Red"] = void 0] = "Red";
    studentGrade[studentGrade["Yellow"] = void 0] = "Yellow";
    studentGrade[studentGrade["Orange"] = void 0] = "Orange";
    studentGrade[studentGrade["green"] = void 0] = "green";
})(studentGrade || (studentGrade = {}));
;
var myGradeInfo = studentGrade.Orange;
myGradeInfo = studentGrade.Black.print().name;
console.log(myGradeInfo);
