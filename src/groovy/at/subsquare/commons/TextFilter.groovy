package at.subsquare.commons

import java.util.*;
import java.util.regex.*;

/**
 * TextFilter
 * <p>
 * Filters URLs and Emails and converts them to HTML links.
 *
 * @author david.trattnig
 * @since 0.3.8
 */
 public class TextFilter {
	
	
 	 public static String filterURL(String text) {
		 
		 if (text) {
			 Pattern pattern = Pattern.compile(
			    '\\b(((ht|f)tp(s?)\\:\\/\\/|~\\/|\\/)|www.)' +
			    '(\\w+:\\w+@)?(([-\\w]+\\.)+(com|org|net|gov' + 
			    '|mil|biz|info|mobi|name|aero|jobs|museum' + 
			    '|travel|[a-z]{2}))(:[\\d]{1,5})?' +
			    '(((\\/([-\\w~!$+|.,=]|%[a-f\\d]{2})+)+|\\/)+|\\?|#)?' +
			    '((\\?([-\\w~!$+|.,*:]|%[a-f\\d{2}])+=?' + 
			    '([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)' + 
			    '(&(?:[-\\w~!$+|.,*:]|%[a-f\\d{2}])+=?' + 
			    '([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)*)*' + 
			    '(#([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)?\\b')
	
			 def urls = []
			 Matcher matcher = pattern.matcher(text);
		     while (matcher.find()) {
		        urls.add(matcher.group());
		     }
			 
			 urls.each { url ->
				 if ( !text.contains("<a href=\"$url\"")) {
					 def href = url.startsWith("http://") ? url : "http://${url}"
					 text = text.replace(url, "<a href=\"$href\">$url</a>")
				}
			 }
		 }
		 return text
 	 }
	 
	 public static String filterEmail(String text) {
	 	
		 if (text) {
			 def emails = text =~ "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9\\-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})"
			 emails.each { email ->
				 if ( !text.contains("mailto:${email[0]}")) {
					 text = text.replace(email[0], "<a href=\"mailto:${email[0]}\">${email[0]}</a>")
				 }
			 }
		 }
		 return text
	 }
	 
	 public static String filterCR(String text) {
	 
	 	text.replaceAll("\r\n|\n\r|\n|\r","<br/>")
	 }
	 
 }
