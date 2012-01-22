
package at.subsquare.commons


import java.util.regex.Matcher

import com.google.common.base.CharMatcher

/**
 * StringUtil
 *
 * @author david.trattnig
 * @since 0.1
 */
class StringUtil {
	
	/**
	 * Removes all types of whitespace including UTF-8 whitespace chars
	 * 
	 * @param string
	 */
	public static String removeAllWhitespace(String s) {
		CharMatcher.WHITESPACE.removeFrom(s)
	}
	
	public static List<Integer> extractIntNumbers(String s) {

		def nums = []		
		def m = s =~ /\d+/
		
		m.each {
			nums.add(new Integer(it))
		}

		println nums
		return nums
	}
	
	/**
	 * Extracts floating numbers from strings allowing 
	 * either dots or comma be the floating point char
	 */
	public static List<Float> extractFloatNumbers(String s) {
		
		def nums = []
		def m = null
		
		m = s =~ /[-+]?[0-9]*[\.]?[0-9]*[\,]?[0-9]+/
		
		m.each { num ->
			num = num.replace(".", "")
			num = num.replace(",",".")
			nums.add(new Float(num))
		}

		return nums
	}
}
