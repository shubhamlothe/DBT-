const fs = require("fs");

let readFile = () => {
    try {
        const filepath = "I:/mean/day/src/demo.txt";

        const filecontent = fs.readFileSync(filepath, { encoding: "utf-8" });

        console.log(filecontent);

    } catch (err) {
        console.log("There is some error", err.message);
    }
};


readFile();
