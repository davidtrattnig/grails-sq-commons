package at.subsquare.commons


class ConfigProperty {

	String code
	String value
	
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		code unique: true, blank: false
		value nullable: true
    }

	/**
	 * Default toString method
	 */
	public String toString() {
		"<${code}>:<${value}>"
	}
}
