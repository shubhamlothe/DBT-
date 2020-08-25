var likecount = 0;

function comment() {
    let usercomment = document.querySelector("#input1").value;

    const newElement = document.querySelector("#referenceCom").cloneNode(true);
    newElement.removeAttribute("id");
    newElement.style.visibility = "visible";
    newElement.children[0].innerHTML = usercomment;

    const commentBox = document.querySelector("#commentBox");

    commentBox.insertBefore(newElement, commentBox.firstChild);
    document.querySelector("#input1").value = "";
}

function like() {
    likecount++;
    let b = document.querySelector("#likebtn");
    b.innerHTML = "Like " + likecount;
}