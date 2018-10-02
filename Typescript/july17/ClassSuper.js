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
        this.dosaName = theName;
    }
    Dosa.prototype.makeDosa = function () {
        console.log("whatever it is.. fundamentally it is a dosa");
    };
    return Dosa;
}());
var MasalaDosa = /** @class */ (function (_super) {
    __extends(MasalaDosa, _super);
    function MasalaDosa(dPrice, dName) {
        var _this = _super.call(this, dName) || this;
        _this.dosaPrice = dPrice;
        return _this;
    }
    MasalaDosa.prototype.makeDosa = function () {
        console.log("MAsala Dosa.. ");
        //super.makeDosa();
    };
    return MasalaDosa;
}(Dosa));
var OnionDosa = /** @class */ (function (_super) {
    __extends(OnionDosa, _super);
    function OnionDosa(dName, dContent, dPrice) {
        var _this = _super.call(this, dName) || this;
        _this.dosaContent = dContent;
        _this.dosaPrice = dPrice;
        return _this;
    }
    OnionDosa.prototype.makeDosa = function () {
        console.log("Onion dosa,");
    };
    return OnionDosa;
}(Dosa));
var firstDosa = new MasalaDosa(100, "MTR");
firstDosa.makeDosa();
