var express = require('express');
var app = express();

app.get('/chain/:string', function (req, res) {
    res.send('string : ' + testStr(req.params.string).check());
});

app.listen(3000, function () {
  console.log('Server listening on port 3000!');
});

/*
    string > 3 length
    string > 15 length
    string contains a number
    string contains a upercase
    string not contains a special characters
*/

var checkLengthUpperBound = function (str) {
    console.log(3);
    console.log(str);
    return str.length < 15;
};

var checkLengthLowerBound = function (str) {
    return 'pinchila';
};

var checkNumber = function (str) {

};

var checkUpperCase = function (str) {

};

var checkNoSpecialCharacters = function (str) {

};

var testStr = function (str) {
    return {
        str: str,
        checkUpperBound: function () {
            checkLengthUpperBound(this.str);
        },
        check: function () {
            this.checkUpperBound();
        }
    };
};
