package at.subsquare.commons

/**
 * RandomUtil
 * <p>
 * Utility class for random number operations.
 *
 * @author david.trattnig
 * @since 0.1
 */
public class RandomUtil {
	
	/**
	 * Genrates a random integer number with {@code max} as upper boundary.
	 */
	public static int randomInt(int max) {
		Random rand = new Random(System.currentTimeMillis())
		rand.nextInt(max)
	}
	
	/**
	 * Generates an universal unique id.
	 */
	public static String generateUUID() {
		UUID.randomUUID()
	}
	
	/**
	 * Generates a random token.
	 */
	public static String generateToken() {
		Random rand = new Random(System.currentTimeMillis())
		Long salt = new Long((new Date()).time+rand.nextInt(3156))
	    Long.toString(salt, Character.MAX_RADIX)
	}
	
	/**
	 * Generates a password with the given length including 20
	 * percent digit and 30 percent uppper case probability.
	 *
	 * @param length specifies the password length.
	 */
	public static String generatePassword(int length) {
		generatePassword(length, 20, 30)
	}
	
	/**
	 * Create a random string with the given length.
	 *
	 * @param length specifies the password length
	 * @param percDigits the probability in percent of numeric values within the password
	 * @param percUpperCase the probability in percent of upper case values within the password
	 */
	public static String generatePassword(int length, int percDigits, int percUpperCase) {
		
		Random rand = new Random(System.currentTimeMillis())

		def pwd = ""
		def digits = 1..9
		def lower = 'a'..'z'    
		def upper = 'A'..'Z'   

        length.times {
            def type = rand.nextInt(100)
            if (type <= percDigits) {
                int pos = rand.nextInt(digits.size())
                pwd += digits.get(pos)
            } else if (percDigits < type && type <= percUpperCase) {
                int pos = rand.nextInt(upper.size())
				pwd += upper.get(pos)
            } else {
                int pos = rand.nextInt(lower.size())
				pwd += lower.get(pos)	
			}
        }

		return pwd
	}
}
