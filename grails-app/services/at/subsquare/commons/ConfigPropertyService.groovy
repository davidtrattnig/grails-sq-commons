package at.subsquare.commons


/**
 * ConfigPropertyService
 * <p>
 * Service which holds config key/value pairs stored in 
 * the db. They are cached until the {@code refresh()}
 * method is called.
 *
 * @author david.trattnig
 * @since 0.1
 */
class ConfigPropertyService {

	private Map<String, ConfigProperty> configProperties
	
	
	public ConfigPropertyService() {
		configProperties = new HashMap<>()
	}	

	/**
	 * Retrieves the propety instance for the given key
	 */
    public ConfigProperty getProperty(code) {
	
		if ( !configProperties)
			refresh()
			
		configProperties.get(code)
    }

	/**
	 * Sets the given value and updates the cache.
	 */
	public ConfigProperty update(code, value) {
		
		def cp = ConfigProperty.findByCode(code)
		cp.value = value
		configProperties.put(cp.code, cp)
	}
	
	/**
	 * Refreshes the cache
	 */
	public void refresh() {
		ConfigProperty.list().each { prop ->
				configProperties.put(prop.code, prop)
			}
	}
}
