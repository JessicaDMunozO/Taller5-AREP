function sinForm() {
    let number = document.getElementById("num").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        document.getElementById("sinmsg").innerHTML =
            this.responseText;
    };
    xhttp.open("GET", "/sin/" + number);
    xhttp.send();
}

function cosForm() {
    let number = document.getElementById("num").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        document.getElementById("cosmsg").innerHTML =
            this.responseText;
    };
    xhttp.open("GET", "/cos/" + number);
    xhttp.send();
}

function palindromeForm() {
    let word = document.getElementById("word").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        document.getElementById("palmsg").innerHTML =
            this.responseText;
    };
    xhttp.open("GET", "/palindrome/" + word);
    xhttp.send();
}

function vectorForm() {
    let val1 = document.getElementById("val1").value;
    let val2 = document.getElementById("val2").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        document.getElementById("vecmsg").innerHTML =
            this.responseText;
    };
    xhttp.open("GET", "/vector/" + val1 + "/" + val2);
    xhttp.send();
}