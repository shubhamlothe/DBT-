

let registerUsingPost = async () => {
    const lastName = document.querySelector("#lastName").value;
    const firstName = document.querySelector("#firstName").value;
    const getMoney = document.querySelector("#getMoney").value;
    const giveMoney = document.querySelector("#giveMoney").value;
    const contact = document.querySelector("#contact").value;
    const input = {
        lastName,
        firstName,
        getMoney,
        giveMoney,
        contact,
    };
    console.log(input);
    const url = "http://localhost:3000/addcustomer";

    // http understands text
    await fetch(url, {
        method: "POST",
        body: JSON.stringify(input),
        headers: {
            "Content-Type": "application/json",
        }
    });

    document.querySelector("#lastName").value = "";
    document.querySelector("#firstName").value = "";
    document.querySelector("#getMoney").value = "";
    document.querySelector("#giveMoney").value = "";
    document.querySelector("#contact").value = "";
};


