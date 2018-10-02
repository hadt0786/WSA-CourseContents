var typeFour = function (studentInput) {
    var value = { overallMarks: 0, overallBand: null };
    value.overallMarks = studentInput.myTest +
        studentInput.myAttendance + studentInput.myAssignments +
        studentInput.myTest;
    value.overallBand = "green";
    return value;
};
var resultvalue;
var student = { myAssignments: 0, myAttendance: 0,
    myProject: 0, myTest: 0 };
student.myAttendance = 20;
student.myAssignments = 20;
student.myProject = 20;
student.myTest = 25;
resultvalue = typeFour(student);
console.log(resultvalue.overallMarks);
console.log(resultvalue.overallBand);
