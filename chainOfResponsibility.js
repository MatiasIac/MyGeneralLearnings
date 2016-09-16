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

var chain = function () {

	this.next = null;

};

var checkUpperBound = function () {
    this.validate = function (str) {
    	return str.length < 15;
    };
};

var checkLowerBound = function () {
    this.validate = function (str) {
    	return str.length > 3;
    };
};

checkUpperBound.prototype = new chain();
checkLowerBound.prototype = new chain();


var a = new checkUpperBound();
	b = new checkLowerBound();

	a.next = b;
