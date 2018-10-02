interface MyAssessments 
{
    overallMarks :number,
    overallBand : string,

}

interface MyInputs 
{
    myAttendance : number,
    myAssignments :number,
    myProject : number,
    myTest : number,
}

let typeFour = (studentInput : MyInputs)=>
{
    let value:MyAssessments = {overallMarks:0, overallBand:null}

    value.overallMarks = studentInput.myTest + 
    studentInput.myAttendance + studentInput.myAssignments + 
    studentInput.myTest ;
    value.overallBand = "green";

    return value;
}

let resultvalue :MyAssessments;
let student: MyInputs = {myAssignments:0,myAttendance:0,
    myProject:0,myTest:0};

student.myAttendance = 20;
student.myAssignments = 20;
student.myProject = 20;
student.myTest = 25;

resultvalue = typeFour(student);

console.log(resultvalue.overallMarks);
console.log(resultvalue.overallBand);




















