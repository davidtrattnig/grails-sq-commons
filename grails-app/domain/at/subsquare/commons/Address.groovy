package at.subsquare.commons

/**
 * Address
 * <p/>
 * Representation of an address with loose constraints
 * for easy reuse. 
 *
 * @author david.trattnig
 * @since 0.1
 */
class Address {

	String note
	String street
	String zipCode
	String city
	String province
	String country
	String countryCode //ISO 3166-1 alpha-2 code
	
    static constraints = {
		note nullable: true
		street nullable: true
		zipCode nullable: true, size: 1..15
		city nullable: true
		province nullable: true
		country nullable: true
		countryCode nullable: true
    }
	
	/**
	 * String representation of an address
	 */
	public String toString() {
		
		def address = street?.trim() ? "$note, " : ""
		address = street?.trim() ? "$street, " : ""
		address += zipCode ? "$zipCode " : ""
		address += city ? " $city, " : ""
		address += province ? province  : ""
		address += country ? " $country" : ""
	}
	
	public int compareTo(Address o) {
		
		def same = note+street+zipCode+city+province+country+countryCode
		def other = o.note+o.street+o.zipCode+o.city+o.province+o.country+o.countryCode
    	same.compareTo(other)
	}
}
