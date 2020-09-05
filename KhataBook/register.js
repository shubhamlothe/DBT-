

let registerUsingPost = async () => {
    const lastName = document.querySelector("#bizName").value;
    const firstName = document.querySelector("#contact").value;
    const getMoney = document.querySelector("#password").value;

    const input = {
        bizName,
        password,
        contact,
    };
    console.log(input);
    const url = "http://localhost:3000/adduser";

    // http understands text
    await fetch(url, {
        method: "POST",
        body: JSON.stringify(input),
        headers: {
            "Content-Type": "application/json",
        }
    });

    document.querySelector("#bizName").value = "";
    document.querySelector("#password").value = "";
    document.querySelector("#contact").value = "";

};


