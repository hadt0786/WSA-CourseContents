
var fruits = {
    "fruitNames": ["Apple","Mango","Banana"]
};

var emps = {
    "employees" :
    [
        {"name":"A", "age":25},
        {"name":"B", "age":26},
        {"name":"C", "age":27},
    
    ]
};

console.log(fruits.fruitNames);
console.log(emps.employees);

console.log(emps.employees[0]);
console.log(emps.employees[1]);

for(var i in emps.employees){
for(var key in emps.employees[i]){
    console.log(emps.employees[i][key]);
}
}