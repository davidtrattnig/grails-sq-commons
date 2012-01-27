package at.subsquare.commons

/**
 * FileRecord
 * <p>
 * Enables storage of files in the database.
 * 
 * @author david.trattnig
 * @since 0.1
 */
class FileRecord {

	static mapping = {
	    //content type: "blob" // or "binary"?
		content column: "content", sqlType: "mediumblob"
	}
	
	String name
	byte[] content
	String contentType 
	
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		name nullable:true
		contentType nullable:true
		content maxSize: 5000000 //5MB
    }

	public Reader reader() {
		def reader = null
		println "content >> "+content
		if (content) {
			def bais = new ByteArrayInputStream(content)
			bais.reset()
			reader = new InputStreamReader(bais)

		}
		
		return reader
	}
}
