'use strict';

var express = require('express');
var app = express();

var braintree = require('braintree');

var bodyParser = require('body-parser');
var parseUrlEnconded = bodyParser.urlencoded({
  extended: false
});

var gateway = braintree.connect({
    environment:  braintree.Environment.Sandbox,
    merchantId:   'tcwp3jb5zzb9jsg4',
    publicKey:    '6v6kzhf5wmvktwwc',
    privateKey:   'd60dc7847898e1bb175b7be175c3937d'
});

app.use(express.static('public'));

app.set('views', __dirname + '/views');
app.set('view engine', 'ejs');

app.get('/', function (request, response) {

  gateway.clientToken.generate({}, function (err, res) {
    response.render('braintree', {
      clientToken: res.clientToken
    });
  });

});

app.post('/checkout', parseUrlEnconded, function (request, response) {

  var transaction = request.body;

  gateway.transaction.sale({
    amount: transaction.amount,
    paymentMethodNonce: transaction.payment_method_nonce
  }, function (err, result) {

    if (err) {
    console.log(err);
    };

    if (result.success) {

      console.log(result);

      response.sendFile('success.html', {
        root: './public'
      });
    } else {
      console.log(result);
      response.sendFile('error.html', {
        root: './public'
      });
    }
  });

});

app.listen(3000, function () {
  console.log('Listening on port 3000');
});

module.exports = app;