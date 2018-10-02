let Employee = {
    name : "",
    id:0,
    info(){
        console.log(" Name: %s, ID: %s", this.name, this.id);
    }
};

let Manager = {
    subOrdinates:[],
    subOrdinatesCounts (){
        return this.subOrdinates.length;
    },
    __proto__:Employee //Inhereit the properties of EMployee
}

Employee.name = "AKASH";
Employee.id = 1;

Manager.name = "My Manager";
Manager.id = 2;

Employee.info();
Manager.info();

console.log("Manager all props (includes inherited)");

for(var key in Manager)
{
    console.log(key);
}

console.log("\nManager props:");
for(var key in Manager)
{
    if(Manager.hasOwnProperty(key))
    console.log(key);
}

