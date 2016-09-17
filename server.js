var express = require('express'),
    app = express();

require('./chainOfResponsibility/chainOfResponsibility')(app);
require('./interpreter/interpreter')(app);

app.listen(3000, function () {
  console.log('Server listening on port 3000!');
});
