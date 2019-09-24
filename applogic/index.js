module.exports = (request, response) => {
    const HEADERS = JSON.parse(request.headers);

    /* 
        RESPONSE
    */
    response.writeHead(200, {
        'Content-Type': 'application/json'
    });
    response.write(JSON.stringify({ output: "hello catalyst" }));
    response.end();
}