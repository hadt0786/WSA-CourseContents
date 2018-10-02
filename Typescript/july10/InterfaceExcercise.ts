enum studentGrade { Excellent, VeryGood, Good, Average};

interface EntityAverage
{
    Entity1 : number,
    Entity2 : number,
    Entity3 : number,
    Entity4 : number,
    EntityWeight   : number,
    EntityAverage : number,
    EntityAns : number

    
}
let entityObject : EntityAverage = 
{
    Entity1 : 0,
    Entity2 : 0,
    Entity3 : 0,
    Entity4 : 0,
    EntityWeight : 0,
    EntityAverage : 0,
    EntityAns: 0
}
let result ;
// : EntityAverage =
// {
//     Entity1 : 0,
//     Entity2 : 0,
//     Entity3 : 0,
//     EntityWeight : 0,
//     EntityAverage : 0,
//     EntityAns: 0
// }


    

let attendace = (entityAverage : EntityAverage)=>
{
    entityAverage.Entity1 = 25;
    entityAverage.Entity2 = 25;
    entityAverage.Entity3 = 25;
    entityAverage.Entity4 = 25;

    entityAverage.EntityWeight = 0.2;
    
    let ans = ((entityAverage.Entity1 + entityAverage.Entity2 + entityAverage.Entity3 + entityAverage.Entity4)/4)*entityAverage.EntityWeight;
    return ans;
} 
result = attendace(entityObject);
    console.log(result);

// let assignmentMarks = (entityAverage : EntityAverage)=>
// {
//     entityAverage.Entity1 = 10;
//     entityAverage.Entity2 = 20;
//     entityAverage.Entity3 = 30;
//     entityAverage.EntityWeight = 0.3;
    
//     let ans = ((entityAverage.Entity1 + entityAverage.Entity2 + entityAverage.Entity3)/3)*entityAverage.EntityWeight;
//     return ans;
// } 

// let projectMarks = (entityAverage : EntityAverage)=>
// {
//     entityAverage.Entity1 = 10;
//     entityAverage.Entity2 = 20;
//     entityAverage.Entity3 = 30;
//     entityAverage.EntityWeight = 0.4;
    
//     let ans = ((entityAverage.Entity1 + entityAverage.Entity2 + entityAverage.Entity3)/3)*entityAverage.EntityWeight;
//     return ans;
// } 
// let ModeleTestMarks = (entityAverage : EntityAverage)=>
// {
//     entityAverage.Entity1 = 10;
//     entityAverage.Entity2 = 20;
//     entityAverage.Entity3 = 30;
//     entityAverage.EntityWeight = 0.4;
    
//     let ans = ((entityAverage.Entity1 + entityAverage.Entity2 + entityAverage.Entity3)/3)*entityAverage.EntityWeight;
    
//     return ans;
// } 



// console.log("The Average "+attendace());
// console.log("The Assignment Marks "+assignmentMarks());
// console.log("The Poject marks "+projectMarks());
// console.log("The Module Test Marks "+ModeleTestMarks());