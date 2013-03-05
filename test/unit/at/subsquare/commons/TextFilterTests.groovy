package at.subsquare.commons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestMixin(TextFilter)
class TextFilterTests {

	void testFilterURL() {

		def s = "hello world with a http://www.test.com link"
		def res = TextFilter.filterURL(s)
		println res
		assert res
		assert res == 'hello world with a <a href="http://www.test.com">http://www.test.com</a> link'
	}

	void testFilterWWW() {

		def s = "hello world with a www.test.com link"
		def res = TextFilter.filterURL(s)
		println res
		assert res
		assert res == 'hello world with a <a href="http://www.test.com">www.test.com</a> link'
	}
	
	void testFilterEmail() {
	
		def s = "hello world foo@bar.com email"
		def res = TextFilter.filterEmail(s)
		println res
		assert res
		assert res == 'hello world <a href="mailto:foo@bar.com">foo@bar.com</a> email'
	}
	
	void testFilterLineBreakEmail() {
	
		def s = "hello world <br/>foo@bar.com email"
		def res = TextFilter.filterEmail(s)
		println res
		assert res
		assert res == 'hello world <br/><a href="mailto:foo@bar.com">foo@bar.com</a> email'
	}

	
	void testFilterCR() {
	
		def s = "aaaa\rbbbb"
		def res = TextFilter.filterCR(s)
		assert res
		assert res == "aaaa<br/>bbbb"
	}
}
