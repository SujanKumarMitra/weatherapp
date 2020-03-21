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
//	for localhost uncomment this and comment live server url
//    window.location.href = `/weatherapp/GetWeatherByLocation?lat=${latitude}&lon=${longitude}`;
//  for live server uncommemnt this and comment localhost url
    window.location.href = `/GetWeatherByLocation?lat=${latitude}&lon=${longitude}`;
}

function error() {
    status.textContent = 'Unable to retrieve your Location';
    alert('Unable to retrieve your Location');
}