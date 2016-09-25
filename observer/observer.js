module.exports = function (app) {

    var observer = require('./observe');

    app.post('/observe/add', function (req, res) {
        observer.observe.add(req.body);
        res.status(200).send();
    });

    return app;
};
