/** global vars **/
var g_currentInfoWin = null;

/** initializes the "map_canvas" **/
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

/** places the default marker **/
function placeMarker(map, location, isDraggable, callback) {

	var m = new google.maps.Marker({
      		position: location, 
      		map: map,
			draggable: isDraggable
		});	
		
	if (callback) {
		google.maps.event.addListener(m, 'click', callback);
	}
	return m;			
}

/** places a custom marker with provided image, shadow & shape **/
function placeMarker(map, location, isDraggable, callback, image, shadow, shape) {

	var m = new google.maps.Marker({
      		position: location, 
      		map: map,
			draggable: isDraggable,
		    icon: image,
		    shadow: shadow,
		    shape: shape
		});	
		
	if (callback) {
		google.maps.event.addListener(m, 'click', callback);
	}
	return m;			
}

/** returns an infowindow closure - will open on call **/
function infoWinCallback(infoWin, marker) { 
	return function() { 
		if (g_currentInfoWin != null)
			g_currentInfoWin.close();
		infoWin.open(g_map, marker); 
		g_currentInfoWin = infoWin;
	}; 
}

/** geocodes a given address **/
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