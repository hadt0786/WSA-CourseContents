var Kalaa = /** @class */ (function () {
    function Kalaa() {
        var _this = this;
        this.setPunch = function (bOffice) {
            _this.actorName = 'Rajinikanth';
            _this.punchDiag = 'Kya re...setting ah?';
            _this.boxOffice = bOffice;
        };
    }
    return Kalaa;
}());
var newMovie = new Kalaa();
newMovie.setPunch(200);
console.log("Actor Name -->" + newMovie.actorName);
console.log("Punch Dialogue -->" + newMovie.punchDiag);
console.log("Box office collection --> " + newMovie.boxOffice + " Crores");
