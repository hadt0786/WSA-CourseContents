/* foreach syntax for arrays */

var fruits = ["Apple", "Mango", "Banana"];

fruits.forEach(function(index) {
    console.log(index);
});

var numArr = [1, 2, 3];

numArr.forEach((num) => {
    console.log(num * num);
});

// callback: (element, index, reference-to-orig-array)
numArr.forEach(function squreArr(num, index, arr) {
    arr[index] = num * num;
    console.log(index, num);
});

console.log(numArr);

var arr2 = [9, 16, 25];
arr2.forEach(function(num, index){
    arr2[index] = Math.sqrt(num);
});

console.log("New arr: ", arr2);