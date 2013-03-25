
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

	String ns
	String name
	String value
	String role
	
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		ns nullable: true
		name unique: true, blank: false
		value nullable: true
		role nullable: true
    }

	/**
	 * Default toString method
	 */
	public String toString() {
		def prefix = role ? "${role}@" : ""
		"${prefix}${ns ? ns+":" : ""}${name}:${value}"
	}
}
