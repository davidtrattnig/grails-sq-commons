package at.subsquare.commons


import groovy.json.JsonSlurper

/**
 * GeoCoderService
 * <p/>
 * Service to query latitude/longitude data for an given address.
 * <p/>
 * For more interface details refer to
 * {@url http://code.google.com/apis/maps/documentation/geocoding/}
 *
 * @author david.trattnig
 * @since 0.1
 */
class GeoCoderService {

	//TODO provide way using alternative service such as geonames:
	//def serviceUrl = "http://ws.geonames.org/search?name_equals=${query}&style=full"
	def serviceUrl = { query ->
		def url = "http://maps.google.com/maps/api/geocode/json?address=${query}&sensor=false"
		log.debug "REQUEST: $url"
		url
	}
	
	/**
	 * Retrieves latitude/longitude for the given address.
	 *
	 * @param address address delimited by commas
	 * @return map holding following elements:
	 * <ul>
     *   <li>address ... formatted address from GeoCoder service</li>
     *   <li>longitude</li>
     *   <li>latitude</li>
     * </ul>
	 */
    public Map findLocation(String address, encode=true) {
	
		def result = [ : ]
		address = encode ? address.encodeAsURL() : address
		def requestUrl = serviceUrl(address)
		def data = new URL(requestUrl).text
		def jsonParser = new JsonSlurper().parseText(data)

		if (data && jsonParser?.results) {
			result.address = jsonParser.results."formatted_address".first().toString()
			result.latitude = jsonParser.results.geometry.location.lat.first().toString()
			result.longitude = jsonParser.results.geometry.location.lng.first().toString()
		} else {
			log.error "no response from ${requestUrl}"
			result = null
		}
		
		return result
    }
}
