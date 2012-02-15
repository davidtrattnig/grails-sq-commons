package at.subsquare.commons


/**
 * ConfigProperty
 * <p>
 * Provides storage of key/value pairs in the database
 * 
 * @author david.trattnig
 * @since 0.1
 */
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
