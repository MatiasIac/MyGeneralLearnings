var express = require('express');
var app = express();

var checks = require('./checks.js');

var a = new checks.checkUpperBound();
    b = new checks.checkLowerBound();
    c = new checks.checkNumber ();

    a.next = b;
    b.next = c;

app.get('/chain/:string', function (req, res) {
    res.send('string : ' +  a.validate(req.params.string));
});

app.listen(3000, function () {
  console.log('Server listening on port 3000!');
});
