package at.subsquare.commons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestMixin(CountryLocation)
class CountryLocationTests {

	void testCountryByCode() {

		def country = CountryLocation.byCode("aut")
		assert country
		assert country.sname == "Austria"
	}

	void testCountryByCodeAndColumn() {

		def country = CountryLocation.byCode("aut", "sname")
		assert country
		assert country == "Austria"
	}	

	void testListCountries() {

		def countries = CountryLocation.list()
		assert countries
		assert countries instanceof List
	}
		
	void testListCountriesForCodes() {

		def countries = CountryLocation.list(["alb", "aut", "xxx", "svn"])
		assert countries
		assert countries instanceof List
		assert countries.size() == 3
		println "country0 = "+countries[0]
		assert countries[0].sname == "Albania"
		assert countries[2].sname == "Slovenia"
		assert countries[0].code == "alb"
	}
}
