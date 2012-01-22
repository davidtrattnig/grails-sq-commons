package at.subsquare.commons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestMixin(StringUtil)
class StringUtilTests {

	void testRemoveAllWhitespace() {
		
		def s = "H \ne\tl\u200al \to   World"
		assert StringUtil.removeAllWhitespace(s) == "HelloWorld"
	}
	
	void testExtractIntNumbers() {
		
		def s = "TOP 123,43  s33tring"
		def res = StringUtil.extractIntNumbers(s)
		println res
		assert res.size() == 3
		assert res[0] == 123
		assert res[1] == 43
		assert res[2] == 33
	}
	
	void testExtractFloatNumbers() {
		
		def s = "TOP 123,43  s33tring "
		def res = StringUtil.extractFloatNumbers(s)
		println res
		assert res.size() == 2
		assert res[0].toString() == "123.43"
		assert res[1] == 33.0

	}
	
	void testExtractFloatNumberWithDot() {
		
		def s = "abc 12.501,45 yzc"
		def res = StringUtil.extractFloatNumbers(s)
		println res
		assert res.size() == 1
		assert res[0].toString() == "12501.45"
	}
}