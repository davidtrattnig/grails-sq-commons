package at.subsquare.commons

/**
 * FileRecord
 * <p>
 * Provides storage of files in the database.
 * 
 * @author david.trattnig
 * @since 0.1
 */
class FileRecord {

	static mapping = {
		content column: "content", sqlType: "mediumblob"
	}
	
	String ns
	String name
	byte[] content
	String contentType 
	
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		ns nullable:true
		name nullable:true
		contentType nullable:true
		content maxSize: 5000000 //5MB
    }

	public Reader reader() {
		def reader = null
		
		if (content) {
			def bais = new ByteArrayInputStream(content)
			bais.reset()
			reader = new InputStreamReader(bais)

		}
		
		return reader
	}
}
