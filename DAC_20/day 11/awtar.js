let callAjax = function () {
    let xhr = new XMLHttpRequest();

    // response is ready :: 4
    xhr.onload = () => {
        const refJson = JSON.parse(xhr.responseText);
        // using this data :: we have to DOM Operation;
        domLogic(refJson);
    };

    xhr.open("GET", "https://reqres.in/api/users?page=2");
    xhr.send();
};

// DOM HTML, CSS
let domLogic = function (refJson) {
    console.log(refJson);

    let parent = document.querySelector("#parent");

    for (let i = 0; i < refJson.data.length; i++) {
        const item = refJson.data[i];

        let newElement = parent.children[0].cloneNode(true);

        newElement.innerHTML = "<img src=" + refJson.data[i].avatar + ">" + " Email :- " + refJson.data[i].email + "<br>  Name:-" + refJson.data[i].first_name + " " + refJson.data[i].last_name;
        parent.insertBefore(newElement, parent.firstChild);
    }
};

/**
* MIN. REQUERMENT :: SERVER PROGRAAM (API)
*
* AJAX - How to connect or how to talk with server
* RESPONSE (JSON/XML) - Knowledge
*
* Fundamental Knowledge HTML, CSS, DOCUMENT, DOM OPERATION (PAINT THE PAGE)
*
*
*
* for (let i = 0; i < refJson.data.length; {

        let newEle = parent.children[0].cloneNode(true);
        newEle.style.display = "flex";
        newEle.children[0].innerHTML = "<img src=" + refJson.data[i].avatar + ">" + " Email :- " + refJson.data[i].email + "<br>  Name:-" + refJson.data[i].first_name + " " + refJson.data[i].last_name;
    parent.insertBefore(newEle, parent.firstChild);
    //console.log(newEle.children[0].innerHTML);

    }
*/