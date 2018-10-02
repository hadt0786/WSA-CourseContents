var MyInputs = /** @class */ (function () {
    function MyInputs(val1, val2) {
        this.x = val1;
        this.y = val2;
    }
    MyInputs.prototype.add = function () {
        console.log(this.x + this.y);
    };
    MyInputs.prototype.sub = function () {
        console.log(this.x - this.y);
    };
    return MyInputs;
}());
var currentInput = new MyInputs(100, 50);
currentInput.add();
currentInput.sub();
var secondInput = new MyInputs(500);
secondInput.x = 200;
secondInput.y = 100;
secondInput.add();
secondInput.sub();
