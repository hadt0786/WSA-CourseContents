/* Inheritance in JS using __proto__ */

let Employee = {
    name: "",
    id: 0,
    info() {
        console.log("Name: %s, ID: %s", this.name, this.id);
    }
};

let Manager = {
    subOridinates: [],
    subOrdinateCount (){
        return this.subOridinates.length;
    },
    __proto__: Employee //Inherit the properties of Employee
}

Employee.name = "Mubeen";
Employee.id = 1;

Manager.name = "My Manager";
//Manager.id = 2;

Employee.info();
Manager.info();

console.log("Manager all props (includes inherited):");
for (var key in Manager) {
    console.log(key);
}

console.log("\nManager props:");
for (var key in Manager) {
    if (Manager.hasOwnProperty(key))
        console.log(key);
}

// console.log("Emp: ", Employee, "\n");
// console.log("Mgr: ", Manager, "\n");
// console.log(Object.getPrototypeOf(Manager));
// console.log(Manager.id);