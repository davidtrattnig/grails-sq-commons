package at.subsquare.commons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestMixin(RandomUtil)
class RandomUtilTests {

	void testGenerateUUID() {
		def uuid = RandomUtil.generateUUID()
		println "uuid: $uuid"
	}
	
	void testGenerateToken() {
		def token = RandomUtil.generateToken()
		println "token: $token"
	}
	
    void testGeneratePassword() {
		def pwd = RandomUtil.generatePassword(3)
		assert pwd
		assert pwd.length() == 3
		
		pwd = RandomUtil.generatePassword(10)
		assert pwd.length() == 10
		
		println "10 char pwd: $pwd"
	}

	void testGenerateCustomPassword() {
		
		def pwd = RandomUtil.generatePassword(10, 20, 30)
		assert pwd.length() == 10
		
		println "10 char pwd: $pwd"		
	}
}
