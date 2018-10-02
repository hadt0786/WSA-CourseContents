var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Dosa = /** @class */ (function () {
    function Dosa(name) {
        console.log("Initializing...");
        this.dosaName = name;
    }
    Dosa.prototype.makeDosa = function () {
        console.log("Its just a Dosa.");
    };
    Dosa.prototype.billDosa = function () {
        console.log("Bill is ready");
    };
    return Dosa;
}());
var DosaPrice = /** @class */ (function (_super) {
    __extends(DosaPrice, _super);
    function DosaPrice(newName, price) {
        var _this = _super.call(this, newName) || this;
        _this.dosaPrice = price;
        return _this;
    }
    DosaPrice.prototype.makeDosa = function () {
        console.log("Dosa");
        //super.makeDosa();
    };
    DosaPrice.prototype.testDosa = function () {
        _super.prototype.billDosa.call(this);
    };
    return DosaPrice;
}(Dosa));
var AnotherDosa = /** @class */ (function (_super) {
    __extends(AnotherDosa, _super);
    function AnotherDosa(onion, content, onionPrice) {
        var _this = _super.call(this, onion) || this;
        _this.dosaContent = content;
        _this.priceDosa = onionPrice;
        return _this;
    }
    AnotherDosa.prototype.makeDosa = function () {
        console.log("onion Dosa");
    };
    return AnotherDosa;
}(Dosa));
var masalaDosa = new DosaPrice("MTR", 100);
var onionDosa = new AnotherDosa("onion", "onion and oil", 120);
masalaDosa.makeDosa();
onionDosa.makeDosa();
masalaDosa.testDosa();
