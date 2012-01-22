package at.subsquare.commons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Address)
class AddressTests {

    void testCreateAddres() {

		def a = new Address()
		a.street = "street 1"
		a.zipCode = "123"
		a.city = "city"
		a.country = "country"
		assert a.save()
    }

    void testCreateAddresWoZip() {

		def a = new Address()
		a.street = "street 1"
		a.city = "city"
		a.country = "country"
		assert a.save()
    }

    void testCreateInvalidAddress() {

		def a = new Address()
		a.street = "street 1"
		a.zipCode = "123"
		a.city = "city"
		assert null == a.save()
    }
}
