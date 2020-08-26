const Promise = require("bluebird");
const mysql = require("mysql");

Promise.promisifyAll(require("mysql/lib/Connection").prototype);
Promise.promisifyAll(require("mysql/lib/Pool").prototype);

const DB_CONFIG = {
    host: "localhost",
    user: "root",
    password: "asdf",
    database: "conSample",
};

let addRecord = async () => {
    const connection = mysql.createConnection(DB_CONFIG);
    await connection.connectAsync();

    // LOGIC
    let sql =
        "INSERT INTO USER (id, name, email, contact) VALUES (?, ?, ?, ?)";
    let operation = await connection.queryAsync(sql, [
        "12345",
        "rambo ",
        "rambo@gmail.com",
        "3456789012",
    ]);

    await connection.endAsync();
    return operation;
};

addRecord();