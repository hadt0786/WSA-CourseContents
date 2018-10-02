var typefour = function (studentInput) {
    // Create a return type interface and initialize 
    var value = { total: 0, grade: null };
    // Calculate overall marks and grade
    value.total = studentInput.model + studentInput.attendance + studentInput.assignment + studentInput.project;
    value.grade = "Green";
    return value;
};
// Initialize interface value using constructors. Input parameter 
var marksObtain = { attendance: 0, assignment: 0, project: 0, model: 0 };
// Output parameter 
var rvalue;
// Initialize all input parameters 
marksObtain.assignment = 20;
marksObtain.attendance = 20;
marksObtain.project = 20;
marksObtain.model = 25;
// Call the functions here
rvalue = typefour(marksObtain);
// Print the output
console.log(rvalue.total);
console.log(rvalue.grade);
