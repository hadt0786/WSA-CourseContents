
class Student {
    public name :string;
    public phoneNumber :number;
    public city:string;

    private eligible : boolean=true;

 

    constructor (name, phoneNumber, city, eligible){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.eligible = eligible;
    }

    public getEligible(){
        console.log(this.eligible);
    }
    public setEligible(eligible){
       eligible =true;
        if(eligible===true){
            this.eligible = eligible;
            console.log(eligible);
        }

    }
}

class WSAStudent extends Student {
    courseName : string;
    courseStatus : boolean = true;
    courseFee : number ;
    balanceFee:number;

constructor (courseName, courseStatus, courseFee, balanceFee){

        this.courseName = courseName;
        this.courseStatus = courseStatus;
        this.courseFee = courseFee;
        this.balanceFee = balanceFee;
    }

}