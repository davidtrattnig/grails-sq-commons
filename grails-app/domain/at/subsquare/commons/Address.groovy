package at.subsquare.commons

class Address {

	String street
	String zipCode
	String city
	String country
	
    static constraints = {
		street blank: false
		zipCode nullable: true, blank: true, size: 1..15
		city blank: false
		country blank: false
    }

	public String toString() {
		def zip = zipCode ? " $zipCode" : ""
		"$street,$zip $city, $country"
	}
}
