// checking the scope of let and var in typescript
function scopeTesting() {
    var varTest = 100;
    for (var letTest = 0; letTest <= 10; letTest++) {
        console.log("the let value " + letTest);
        console.log("the var value " + varTest);
    }
    console.log("OUTER LOOP ");
    console.log("The let value " + letTest);
    console.log("The var test " + varTest);
}
scopeTesting();
