function initMap(center, zoom) {
	
  	var myOptions = {
		backgroundColor: '#ccc',
    	zoom: zoom,
    	center: center,
    	// mapTypeId: google.maps.MapTypeId.ROADMAP
		mapTypeId: google.maps.MapTypeId.TERRAIN

	};
	
	var map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
	return map;
}

function placeMarker(map, location, isDraggable, callback) {

	var m = new google.maps.Marker({
      		position: location, 
      		map: map,
			draggable: isDraggable,
		});	
		
	if (callback) {
		google.maps.event.addListener(m, 'click', callback);
	}
	return m;			
}

function codeAddress(map, geocoder, address, country, callback) {

	address = address.replace(/(\r\n|\n|\r)/gm,", ");
	address += ", " + country;
	
  	geocoder.geocode( { 'address': address}, function(results, status) {
		    if (status == google.maps.GeocoderStatus.OK) {
		    	map.setCenter(results[0].geometry.location);
		    	var marker = new google.maps.Marker({
		        		map: map,
		          		position: results[0].geometry.location,
						draggable: true
		      		});
				callback(marker);
		    } else {
		      alert("Geocode was not successful for the following reason: " + status);
		    }
  		});

}