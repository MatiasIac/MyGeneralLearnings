var express = require('express'),
    bodyParser = require('body-parser'),
    logger = require('morgan'),
    app = express();


app.use(logger('dev')); //log any activity on the server
app.use(bodyParser.json()); // to support JSON-encoded bodies

require('./chainOfResponsibility/chainOfResponsibility')(app);
require('./observer/observer')(app);
//require('./interpreter/interpreter')(app);

app.listen(3000, function () {
  console.log('Server listening on port 3000!');
});
