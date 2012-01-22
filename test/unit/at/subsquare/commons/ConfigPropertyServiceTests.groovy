package at.subsquare.commons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ConfigPropertyService)
@Mock([ConfigProperty])
class ConfigPropertyServiceTests {

	@Before
	void setUp() {
		//super.setUp()
		
		//create default props
		def cp = new ConfigProperty(code:"FOO", value:"bar")
		assert cp.save(flush:true)
		cp = new ConfigProperty(code:"hello", value:"WORLD")
		assert cp.save(flush:true)
	}
	
    void testCacheNRefreshConfig() {
        
		assert ConfigProperty.list().size() == 2
		
		//read initial values
		def service = new ConfigPropertyService()
		assertEquals "bar", service.getProperty("FOO")
		assertEquals "hello", service.getProperty("WORLD")
		
		//update in db
		def cp = ConfigProperty.findByCode("hello")
		assert cp
		assert cp.value == "WORLD"
		cp.value = "xxx"
		assert cp.save(flush:true)
		
		//check cached value
		assertEquals "hello", service.getProperty("WORLD")
		
		//refresh cache & recheck
		service.refresh()
		assertEquals "hello", service.getProperty("xxx")
    }

	void testUpdateValue() {
		
		assert ConfigProperty.list().size() == 2	
		assert ConfigProperty.findByCode("hello").value == "WORLD"
		
		service.update("hello", "chuck!")
		
		assert ConfigProperty.findByCode("hello").value == "chuck!"
		assert service.getProperty("hello").value == "chuck!"
	}
}
