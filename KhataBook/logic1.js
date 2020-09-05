let recordCounter = 0;
let getrecord = () => {

    let xhr = new XMLHttpRequest();

    // response is ready :: 4
    xhr.onload = () => {
        const refJson = JSON.parse(xhr.responseText);
        // using this data :: we have to DOM Operation;
        domLogic(refJson);
    };

    xhr.open("GET", "http://localhost:3000/alluser");
    xhr.send();


    // DOM HTML, CSS
    let domLogic = function (refJson) {
        console.log(refJson);

        // let parent = document.querySelector("#parent");

        for (let i = 0; i < refJson.length; i++) {
            const item = refJson[i];
            const parent = document.querySelector(".parent");

            let newElement = parent.children[0].cloneNode(true);
            newElement.style.display = "block";
            if (item.getMoney == 0) {
                newElement.style.backgroundColor = "red";
            }
            else {
                newElement.style.backgroundColor = "green";
            }
            newElement.children[0].innerHTML = item.firstName + " " + item.lastName;
            newElement.children[1].innerHTML = "You will get Rs." + item.getMoney;
            newElement.children[2].innerHTML = "You will give Rs." + item.giveMoney;
            parent.insertBefore(newElement, parent.lastChild);
        }
    };

}

//http://localhost:3000/alluser