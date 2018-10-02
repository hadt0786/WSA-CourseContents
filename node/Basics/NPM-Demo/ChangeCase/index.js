//Include the modules
var changeCase = require('change-case');

var res;

res = changeCase.upper("hello");
console.log(res);

console.log(changeCase.camelCase("dosome 123"));

console.log(changeCase.titleCase("Do some work"));