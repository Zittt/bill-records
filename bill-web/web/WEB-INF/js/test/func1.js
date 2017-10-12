
// demo of module
var xVal = 12;
var yVal = 9;

var add = function(x = 1, y = 2) {
    return x+y;
};

var subtract = function(x = 2, y = 1) {
    return x - y;
};

export {
    xVal,
    yVal,
    add as addFunc,
    subtract as subtractFunc
}
