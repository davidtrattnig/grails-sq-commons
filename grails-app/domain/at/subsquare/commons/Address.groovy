package at.subsquare.commons

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
	
	public String toString() {
		
		def address = street.trim() ? "$street, " : ""
		address += zipCode ? "$zipCode " : ""
		address += city ? " $city, " : ""
		address += country
	}
}
