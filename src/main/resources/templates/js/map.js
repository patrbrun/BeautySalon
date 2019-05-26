function initialize() {
	var myOptions = {
		zoom: 16,
		center: new google.maps.LatLng(59.3953113086, 24.6643726694), //change the coordinates
		mapTypeId: google.maps.MapTypeId.ROADMAP,
		scrollwheel: false,
		mapTypeControl: false,
		zoomControl: false,
		streetViewControl: false,
		}
	var map = new google.maps.Map(document.getElementById("map-canvas"), myOptions);

	// Map Marker
	
	var marker = new google.maps.Marker({
		map: map,
		position: new google.maps.LatLng(59.3953113086, 24.6643726694) //change the coordinates
	});
	google.maps.event.addListener(marker, "click", function() {
		infowindow.open(map, marker);
	});
}
google.maps.event.addDomListener(window, 'load', initialize);