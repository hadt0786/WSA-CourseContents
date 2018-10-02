// Interface for student marks. Used as input for the function 
interface StudentMarks {
    attendance:number;
    assignment:number;
    project:number;
    model:number;
}

// Interface for student result. Used as a output for the function 

interface Final{
    total:number;
    grade:string;
}


let typefour = (studentInput: StudentMarks) => {
    // Create a return type interface and initialize 
    let value:Final = {total:0,grade:null};

    // Calculate overall marks and grade
    value.total = studentInput.model + studentInput.attendance + studentInput.assignment + studentInput.project;
    value.grade = "Green";
    return value;
}


// Initialize interface value using constructors. Input parameter 
let marksObtain:StudentMarks = {attendance:0, assignment:0, project:0, model:0};

// Output parameter 
let rvalue:Final;

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

