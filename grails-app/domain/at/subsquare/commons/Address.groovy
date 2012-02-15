package at.subsquare.commons

/**
 * Address
 * <p/>
 * Representation of an address with loose constraints
 * for easy reuse. Hence {@code country} is the only
 * attribute which has to be supplied.
 *
 * @author david.trattnig
 * @since 0.1
 */
class Address {

	String street
	String zipCode
	String city
	String country
	
    static constraints = {
		street nullable: true
		zipCode nullable: true, size: 1..15
		city nullable: true
		country blank: false
    }
	
	/**
	 * String representation of an address
	 */
	public String toString() {
		
		def address = street.trim() ? "$street, " : ""
		address += zipCode ? "$zipCode " : ""
		address += city ? " $city, " : ""
		address += country
	}
}
