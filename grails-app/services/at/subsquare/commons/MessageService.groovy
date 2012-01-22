package at.subsquare.commons

import org.springframework.context.i18n.LocaleContextHolder as LCH

/**
 * MessageService
 * <p>
 * Service for various messaging tasks. Note that some
 * services methods require an installed mail-plugin
 *
 * @author david.trattnig
 * @since 0.1
 */
class MessageService {

    static transactional = true

	/** dependency injections **/
	def mailService
	
	
	/**
	 * Sends a mail to the given email address.
	 *
	 * @param user the user object the mail should be sent to
	 * @param title the mail's subject
	 * @param message the text of the mail
	 * @param failOnError (optional) throws an exception in case of an error
	 * @return true if sending was successful
	 */
    public boolean sendMail(String email, String title, String message) {
		sendMail([email], title, message)
    }
	
	/**
	 * Sends a mail to the given email addresses.
	 *
	 * @param email list of emails
	 * @param title the mail's subject
	 * @param message the text of the mail
	 * @param failOnError (optional) throws an exception in case of an error
	 * @return true if sending was successful
	 */
    public boolean sendMail(List emails, String title, String message) {

		def success = false
		try {
			mailService.sendMail {     
			  to emails
			  subject title     
			  body message
			}
			
			log.info("mail '${title}' to ${emails} successfully sent")
			success = true
		} catch (Exception e) {
			log.error("error while sending mail to ${emails}", e)
		}
		
		return success
    }
}