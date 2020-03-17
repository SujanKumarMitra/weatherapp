function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition, error);
    } else {
        alert('Geolocation is not supported by this Browser');
    }
}

function showPosition(position) {
    var latitude = position.coords.latitude;
    var longitude = position.coords.longitude;

    window.location.href = `http://localhost:8080/weatherapp/GetWeatherByLocation?lat=${latitude}&lon=${longitude}`;
}

function error() {
    status.textContent = 'Unable to retrieve your Location';
    alert('Unable to retrieve your Location');
}