var Example = /** @class */ (function () {
    function Example(val1, val2, val3) {
        this.x = val1;
        this.y = val2;
        this.z = val3;
    }
    Example.prototype.add = function () {
        console.log("Ans =" + this.x + this.y);
    };
    Example.prototype.sub = function () {
        console.log("Ans =" + (this.x - this.y));
    };
    return Example;
}());
var qwe = new Example(100, 50, 20);
console.log("z = " + qwe.z);
qwe.add();
qwe.sub();
