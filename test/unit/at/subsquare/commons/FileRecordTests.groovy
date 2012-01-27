package at.subsquare.commons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(FileRecord)
class FileRecordTests {

    void testCreateFileRecord() {

		def file = new FileRecord()
		file.content = new File("LICENSE.txt").readBytes()
		assert file.validate()
    }

    void testFileRecordReader() {

		def file = new FileRecord()
		file.content = new File("LICENSE.txt").readBytes()
		assert file.validate()
		
		def reader = file.reader()
		assert reader
		def txt =  reader.text //assign value otherwise stream will be -closed-
		assert txt
    }
}
