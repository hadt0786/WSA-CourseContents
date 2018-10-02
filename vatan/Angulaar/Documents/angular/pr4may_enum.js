var color;
(function (color) {
    color[color["black"] = 100] = "black";
    color[color["blue"] = 101] = "blue";
    color[color["green"] = 102] = "green";
    color[color["red"] = 103] = "red";
    color[color["yellow"] = 300] = "yellow";
    color[color["white"] = 301] = "white";
    color[color["grey"] = 302] = "grey";
})(color || (color = {}));
;
var x = color.green;
console.log(x);
x = color.grey;
console.log(x);
