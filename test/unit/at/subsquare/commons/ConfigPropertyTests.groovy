package at.subsquare.commons


import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ConfigProperty)
class ConfigPropertyTests {

    void testCreateConfigProperty() {
		
		def cp = new ConfigProperty(name:"FOO", value:"bar")
		cp.validate()
		println cp.errors
		assert cp.validate()
    }

    void testConfigPropertyToString() {
		
		def cp = new ConfigProperty(name:"aa", value:"123")
		cp.validate()
		println cp.errors
		assert cp.save(flush:true)
		assert cp.toString() == "aa:123"
    }
	
    void testNamespacedConfigPropertyToString() {
		
		def cp = new ConfigProperty(ns:"funnyNamespace", name:"aa", value:"123")
		cp.validate()
		println cp.errors
		assert cp.save(flush:true)
		assert cp.toString() == "funnyNamespace:aa:123"
    }
	
    void testWithRole() {
		
		def cp = new ConfigProperty(role:"ROLE_ADMIN", ns:"funnyNamespace", name:"aa", value:"123")
		cp.validate()
		println cp.errors
		assert cp.save(flush:true)
		assert cp.toString() == "ROLE_ADMIN@funnyNamespace:aa:123"
    }
}
