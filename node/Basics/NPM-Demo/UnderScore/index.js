var _=require('underscore');
var arr = [1,2,3];

var newArr = _.map(arr, function(num){
    return num * 3;
});
console.log(newArr);

var isPresent = _.contains(arr,2);
console.log(isPresent);

var seq = _.range(1,10,2);//print t 1 to 10 with interval of 2


console.log(seq);
