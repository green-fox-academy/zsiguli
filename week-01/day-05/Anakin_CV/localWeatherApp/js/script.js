var switcher = ' °C';

function success(pos) {
  var crd = pos.coords;
  var latitude = crd.latitude;
  var longitude = crd.longitude;

$(document).ready(function() {  
  $.getJSON("http://api.openweathermap.org/data/2.5/weather?lat=" + latitude + "&lon=" + longitude + "&appid=5fb2f07512556f19b04c6e9aa0782c25", function(data) {
    $('#temp').html(Math.floor(data.main.temp - 273.15) + switcher);
    $('#icon').attr('src', 'http://openweathermap.org/img/w/' + data.weather[0].icon + '.png');
    $('#location').html(data.name);
    $('#sky').html(data.weather[0].description);
    $('#wind').html(data.wind.speed + ' knots');
    $('#btn').on('click', function() {
    	if (switcher === ' °C') {
            switcher = ' °F';
          	$('#temp').html(Math.floor(data.main.temp * 9 / 5 - 459.67) + switcher);
    	} else {
    		switcher = ' °C';
    		$('#temp').html(Math.floor(data.main.temp - 273.15) + switcher);
    	}
    });
});
  
  });
}

function error(err) {
  console.warn(`ERROR(${err.code}): ${err.message}`);
}
                
navigator.geolocation.getCurrentPosition(success, error);