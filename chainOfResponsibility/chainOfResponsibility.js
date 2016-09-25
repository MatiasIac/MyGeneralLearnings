module.exports = function (app) {

    var checks = require('./checks');

    var a = new checks.checkUpperBound();
        b = new checks.checkLowerBound();
        c = new checks.checkNumber ();

        a.next = b;
        b.next = c;

    app.get('/chain/:string', function (req, res) {
        res.send('string : ' +  a.validate(req.params.string));
    });

    return app;
};
