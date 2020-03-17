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

    window.location.href = `https://www.google.com/maps/place/${latitude}+${longitude}`;
}

function error() {
    status.textContent = 'Unable to retrieve your Location';
    alert('Unable to retrieve your Location');
}