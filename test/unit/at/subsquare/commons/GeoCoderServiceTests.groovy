package at.subsquare.commons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(GeoCoderService)
class GeoCoderServiceTests {

	@Before
	void setUp() {
		mockCodec(org.codehaus.groovy.grails.plugins.codecs.URLCodec)
	}
	
    void testFindLocation() {

		def service = new GeoCoderService()
		def res = service.findLocation("st. peter 16, radenthein")
		println "geoCode response: $res"
		assert res
		assert res.longitude ==  "13.728496" 
		assert res.latitude == "46.797153"
		assert res.address
    }
}