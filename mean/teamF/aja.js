function get() {
    let xhr = new XMLHttpRequest()
    xhr.open("GET", "http://localhost:5000");
    xhr.send();
    xhr.onload = () => {
        let refjson = JSON.parse(xhr.responseText);
        console.log(refjson)
        domlogic(refjson);
    }
}

function domlogic(refjson) {
    const parent = document.querySelector(".parent")
    //const ele = document.querySelector(".parent").cloneNode(true);
    // console.log(refjson.info[5], parent, ele);
    // console.log(refjson.info.lenght);
    for (let i = 0; i < 9; i++) {
        console.log(refjson.info[i]);
        const ele = document.querySelector(".ele").cloneNode(true);
        ele.children[0].innerHTML = refjson.info[i].name;
        ele.children[1].innerHTML = refjson.info[i].id;
        ele.children[2].innerHTML = refjson.info[i].team;

        parent.appendChild(ele);
        console.log(ele);



    }
}