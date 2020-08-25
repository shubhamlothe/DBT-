const http = require('http');
const info = require('./info')

http.createServer((request, response) => {
    response.setHeader('Access-Control-Allow-Origin', "*");


    response.end(JSON.stringify(info));

}).listen(5000);