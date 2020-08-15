var count = 0;
var count2 = 0;

function like() {

    var like = document.getElementById('like');
    count++;
    document.getElementById('like').innerHTML = count;
}

function dislike() {

    var dislike = document.getElementById('dislike');
    count2--;
    document.getElementById('dislike').innerHTML = count;
}

function comment() {
    var comment = document.getElementById('com').value;
    let cloneval = document.getElementById('ucom').cloneNode(true);
    cloneval.innerHTML = comment;

    let comdiv = document.querySelector('#com');
    comdiv.insertBefore(cloneval, comdiv.firstChild);
}