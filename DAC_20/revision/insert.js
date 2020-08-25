var likecount = 0;

function like() {
    likecount++;
    document.querySelector('#likebtn').innerHTML = "Like " + likecount;
}

function comment() {
    var userComment = document.querySelector('#input1').value;

    const newElement = document.createElement('div');

    newElement.style.backgroundColor = "tomato";
    newElement.style.margin = "5px";
    newElement.innerText = userComment;
    const commentBox = document.querySelector('#commentBox');
    commentBox.insertBefore(newElement, commentBox.firstChild);

    document.querySelector('#input1').value = "";
}