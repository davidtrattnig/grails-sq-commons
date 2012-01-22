package at.subsquare.commons


class ConfigProperty {

	String name
	String value
	
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		name unique: true, blank: false
		value nullable: true
    }

	/**
	 * Default toString method
	 */
	public String toString() {
		"<${name}>:<${value}>"
	}
}
