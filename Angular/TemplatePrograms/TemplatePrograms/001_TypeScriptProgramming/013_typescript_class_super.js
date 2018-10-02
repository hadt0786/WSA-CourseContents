/******************************************************************************
+   Description : Usage of super in Classes
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/
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
    function Dosa(theName) {
        console.log("Dosa initialization");
        this.dosaName = theName;
    }
    Dosa.prototype.makeDosa = function () {
        console.log("Whatever type...its fundamentally Dosa...");
    };
    return Dosa;
}());
var MasalaDosa = /** @class */ (function (_super) {
    __extends(MasalaDosa, _super);
    function MasalaDosa(dName, dPrice) {
        var _this = 
        // Constructors in derived class should have super as their first item 
        _super.call(this, dName) || this;
        _this.dosaPrice = dPrice;
        return _this;
    }
    MasalaDosa.prototype.makeDosa = function () {
        console.log("Masala dosa..but looks like customer wants something else...");
        _super.prototype.makeDosa.call(this);
    };
    return MasalaDosa;
}(Dosa));
var OnionDosa = /** @class */ (function (_super) {
    __extends(OnionDosa, _super);
    function OnionDosa(dName, dContent, dPrice) {
        var _this = _super.call(this, dName) || this;
        _this.dosaContent = "onion";
        _this.dosaPrice = dPrice;
        return _this;
    }
    OnionDosa.prototype.makeDosa = function () {
        console.log("Onion dosa..the best ever...");
    };
    return OnionDosa;
}(Dosa));
var firstDosa = new MasalaDosa("MTR", 100);
console.log("Dosa name-->" + firstDosa.dosaName + "  Dosa price-->" + firstDosa.dosaPrice);
firstDosa.makeDosa();
var secondDosa = new OnionDosa("Adigas", "OnionAndOil", 120);
console.log("Dosa name-->" + secondDosa.dosaName + "  Dosa price-->" + secondDosa.dosaPrice + "  Dosa content-->" + secondDosa.dosaContent);
secondDosa.makeDosa();
