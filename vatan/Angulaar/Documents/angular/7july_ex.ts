class StudentData {
    name:string;
    num:number;
   private Eligibility:boolean;
    city:string;
    constructor (vad1:string,vad2:number,vad3:boolean,vad4:string){
        this.name = vad1;
        this.num = vad2;
        this.Eligibility = vad3;
        this.city = vad4;
    }
    eligible(){
        if(this.Eligibility == true){
           return this.Eligibility = true;
        }
    }
    eligibleQwe(){
        console.log("Eligibility = " +this.Eligibility);
    }
    }

class WSAStudent extends StudentData{
    courseName:string;
    courseStatus:string;
    courseFee:number;
    balanceFee:number;
    private payment:boolean;

    constructor (val1:string,val2:number,val3:boolean,val4:string,var1:string,var2:string,var3:number,var4:number,var5:boolean){
        super(val1,val2,val3,val4);
        this.courseName = var1;
        this.courseStatus = var2;
        this.courseFee = var3;
        this.balanceFee = var4;
        this.payment = var5;
    }
    printStudentData(){
        console.log("Name = " +this.name);
        console.log("Number = " +this.num);
        super.eligibleQwe();
        console.log("City = " +this.city);
        console.log("CourseName = " +this.courseName);
        console.log("CourseStatus = " +this.courseStatus);
        console.log("CourseFee = " +this.courseFee);
        console.log("BalanceFee = " +this.balanceFee);
        console.log("Payment = " +this.payment);
    }
    payFee(){
        if(this.balanceFee == 0){
            console.log("No Balance Left");
        }
        else{
            console.log("He has to first pay the remaining Fee Balance.");
        }
    }
    getPlacementStatus(){
        if (super.eligible() && this.payment == true){
            console.log("He is eligible for placements.");
        }
        else{
            console.log("He has to pay the remaining fee to become eligible for the placements.");
        }
    }
}
let student = new WSAStudent("vatan",9729855849,true,"Ambala","Full Stack Developer","Angular",42000,0,true);
student.printStudentData();
student.payFee();
student.getPlacementStatus();