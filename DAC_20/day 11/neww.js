//[11:32 PM, 8/20/2020] Vaishnavi Chouhan: the API uses the below endpoint

//https://disease.sh/v3/covid-19/historical/all?lastdays=NO-OF-DAYS
// https://api.thevirustracker.com/free-api?countryTotals=ALL

function getWeather() {
    //  
    var cityName = document.querySelector('.inputValue').value;
    // https://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=35099c5f85b8537a8cd8721dddaae1f2
    let url = "https://api.thevirustracker.com/free-api?countryTotals=ALL";

    let xhr = new XMLHttpRequest();
    xhr.open("GET", url);

    xhr.onload = () => {
        const refjson = JSON.parse(xhr.responseText);
        console.log(refjson['countryitems'][0][title]);
        // jsonDomOperation(refjson);
    };
    xhr.send();





}
/*
let jsonDomOperation = function (refjson) {
    console.log(refjson);

    var nameValue = refjson['name'];
    console.log(nameValue);
    var tempValue = refjson['main']['temp'];

    console.log(tempValue);
    var descValue = refjson['weather'][0]['description'];
    console.log(descValue);

    const display = document.querySelector('.display');
    display.children[0].innerHTML = "City: " + nameValue;
    display.children[1].innerHTML = "Temperature: " + tempValue + '\xB0C.';
    display.children[2].innerHTML = "Description: " + descValue;

    document.querySelector('.inputValue').value = "";
refjson["countryitems"][0][3]["title"];
}*/