package at.subsquare.commons


import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ConfigProperty)
class ConfigPropertyTests {

    void testCreateConfigProperty() {
		
		def cp = new ConfigProperty(code:"FOO", value:"bar")
		cp.validate()
		println cp.errors
		assert cp.validate()
    }

    void testConfigPropertyToString() {
		
		def cp = new ConfigProperty(code:"aa", value:"123")
		cp.validate()
		println cp.errors
		assert cp.save(flush:true)
		assert cp.toString() == "<aa>:<123>"
    }
}
