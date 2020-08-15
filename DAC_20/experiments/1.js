let commentCounter = 1;
var likeCounter = 0;
var com;

function commentHere() {
    if (likeCounter == 1) {
        com = 'waah..';
    }
    if (likeCounter == 2) {
        com = 'mashaalla';
    } else if (likeCounter == 3) {
        com = 'cute...';
    } else if (likeCounter == 4) {
        com = 'supper cute';
    }
    // create new element
    const newElement = document.createElement("div");
    newElement.textContent = com + commentCounter; //concatnate the counter


    // add styling to new element
    newElement.style.background = "royalblue"; // values must be in double quotes or single quote
    newElement.style.color = "white";
    newElement.style.margin = "4px";

    // comment box elment
    const comment = document.querySelector(".commentBox");

    // append the new element to parent
    commentBox.appendChild(newElement);

    // incremetn the comment counter
    commentCounter++;
}

function likeHere() {
    likeCounter++;

    let btnElement = document.querySelector("#btnid");
    btnElement.innerHTML = "Like " + likeCounter;
}