package at.subsquare.commons

/**
 * CountryLocation
 *
 * Class to query properties regarding Countries
 * such as
 * 
 * <li>code ISO code
 * <li>sname Short name
 * <li>lname Full name (offical variant)
 * <li>latitude
 * <li>tatitude
 * <li>official flag to indicate official country tode; false for temp codes
 *
 * @author david.trattnig
 * @since 0.1
 */
class CountryLocation {

	static def EUROPE = [latitude: 9.14055555556, longitude: 48.6908333333]
	
	
	static def countries = [
		alb: [ offical: true,	sname:'Albania', 			latitude:'20.0', 	longitude:'41.0'	],
		and: [ offical: true,	sname:'Andorra', 			latitude:'1.6', 	longitude:'42.5'	],
		arm: [ offical: true,	sname:'Armenia', 			latitude:'45.0', 	longitude:'40.0'	],
		aut: [ offical: true,	sname:'Austria', 			latitude:'13.3333', longitude:'47.3333'	],
		aze: [ offical: true,	sname:'Azerbaijan', 		latitude:'47.5', 	longitude:'40.5'	],
		bel: [ offical: true,	sname:'Belgium', 			latitude:'4.0', 	longitude:'50.8333'	],
		bih: [ offical: true,	sname:'Bosnia-Herzegovina', latitude:'18.0',	longitude:'44.0'	],
		bgr: [ offical: true,	sname:'Bulgaria', 			latitude:'25.0', 	longitude:'43.0'	],
		hrv: [ offical: true,	sname:'Croatia', 			latitude:'15.5', 	longitude:'45.1667'	],
		cyp: [ offical: true,	sname:'Cyprus', 			latitude:'33.0', 	longitude:'35.0'	],
		cze: [ offical: true,	sname:'Czech Republic', 	latitude:'15.5', 	longitude:'49.75'	],
		dnk: [ offical: true,	sname:'Denmark', 			latitude:'10.0',	longitude:'56.0'	],
		est: [ offical: true,	sname:'Estonia', 			latitude:'26.0',	longitude:'59.0'	],
		fin: [ offical: true,	sname:'Finland', 			latitude:'26.0',	longitude:'64.0'	],
		fra: [ offical: true,	sname:'France', 			latitude:'2.0',  	longitude:'46.0'	],
		geo: [ offical: true,	sname:'Georgia',		 	latitude:'43.5',	longitude:'42.0'	],
		deu: [ offical: true,	sname:'Germany',			latitude:'9.0', 	longitude:'51.0',	
	    	states: [ 			
	    		'de1': [ sname:'Baden-Württemberg',         latitude:'9.349365',      longitude:'48.661943',    zoom:'7'],
	    		'de2': [ sname:'Bayern',                    latitude:'11.502686',     longitude:'48.79239',    zoom:'7'],
	    		'de3': [ sname:'Berlin',                    latitude:'13.406067',      longitude:'52.519146',        zoom:'10'],
	    		'de4': [ sname:'Brandenburg',               latitude:'13.436279',     longitude:'52.395715',    zoom:'7'],
	    		'de5': [ sname:'Bremen',                    latitude:'13.436279',     longitude:'52.48278',    zoom:'11'],
	    		'de6': [ sname:'Hamburg',                   latitude:'9.993439',      longitude:'53.550915',    zoom:'10'],
	    		'de7': [ sname:'Hessen',                    latitude:'9.162438',      longitude:'50.652052',    zoom:'7'],
	    		'de8': [ sname:'Mecklenburg-Vorpommern',    latitude:'12.425537',     longitude:'53.612062',        zoom:'7'],
	    		'de9': [ sname:'Niedersachsen',             latitude:'9.84375',       longitude:'52.636397',    zoom:'7'],
	    		'dea': [ sname:'Nordrhein-Westfalen',       latitude:'7.657471',      longitude:'51.433464',        zoom:'7'],
	    		'deb': [ sname:'Rheinland-Pfalz',           latitude:'7.305908',      longitude:'50.120578',    zoom:'8'],
	    		'dec': [ sname:'Saarland',                  latitude:'7.305908',      longitude:'50.120578',    zoom:'9'],
	    		'ded': [ sname:'Sachsen',                   latitude:'7.022961',      longitude:'49.396423',    zoom:'8'],
	    		'dee': [ sname:'Sachsen-Anhalt',            latitude:'13.201738',     longitude:'51.104541',    zoom:'7'],
	    		'def': [ sname:'Schleswig-Holstein',        latitude:'11.692273',     longitude:'51.950265',    zoom:'8'],
	    		'deg': [ sname:'Thüringen',                 latitude:'9.696117',      longitude:'54.219367',        zoom:'8']
	    		]
			],
		grc: [ offical: true,	sname:'Greece',  			latitude:'22.0', 	longitude:'39.0'	],
		hun: [ offical: true,	sname:'Hungary', 			latitude:'20.0',	longitude:'47.0'	],
		isl: [ offical: true,	sname:'Iceland', 			latitude:'-18.0', 	longitude:'65.0'	],
		irl: [ offical: true,	sname:'Ireland', 			latitude:'-8.0',	longitude:'53.0'	],
		ita: [ offical: true,	sname:'Italy', 				latitude:'12.8333', longitude:'42.8333'	],
		lva: [ offical: true,	sname:'Latvia', 			latitude:'25.0', 	longitude:'57.0'	],
		lie: [ offical: true,	sname:'Liechtenstein', 		latitude:'9.5333', 	longitude:'47.1667'	],
		ltu: [ offical: true,	sname:'Lithuania', 			latitude:'24.0', 	longitude:'56.0'	],
		lux: [ offical: true,	sname:'Luxembourg', 		latitude:'6.1667', 	longitude:'49.75'	],
		mlt: [ offical: true,	sname:'Malta', 				latitude:'14.5833', longitude:'35.8333'	],
		mco: [ offical: true,	sname:'Monaco', 			latitude:'7.4', 	longitude:'43.7333'	],
		naka:[ offical: false,	sname:'Nagorno Karaback ', 	latitude:'47.5', 	longitude:'40.5'	],
		nld: [ offical: true,	sname:'Netherlands', 		latitude:'5.75', 	longitude:'52.5'	],
		nor: [ offical: true,	sname:'Norway', 			latitude:'10.0', 	longitude:'62.0'	],
		pol: [ offical: true,	sname:'Poland', 			latitude:'20.0', 	longitude:'52.0'	],
		prt: [ offical: true,	sname:'Portugal', 			latitude:'-8.0', 	longitude:'39.5'	],
		rou: [ offical: true,	sname:'Romania',			latitude:'25.0', 	longitude:'46.0'	],
		smr: [ offical: true,	sname:'San Marino', 		latitude:'12.4167', longitude:'43.7667'	],
		svk: [ offical: true,	sname:'Slovakia', 			latitude:'19.5', 	longitude:'48.6667'	],
		svn: [ offical: true,	sname:'Slovenia', 			latitude:'15.0', 	longitude:'46.0'	],
		esp: [ offical: true,	sname:'Spain', 				latitude:'-4.0', 	longitude:'40.0'	],
		swe: [ offical: true,	sname:'Sweden', 			latitude:'15.0', 	longitude:'62.0'	],
		che: [ offical: true,	sname:'Switzerland', 		latitude:'8.0', 	longitude:'47.0'	],
		tur: [ offical: true,	sname:'Turkey', 			latitude:'35.0', 	longitude:'39.0'	],
		ukr: [ offical: true,	sname:'Ukraine', 			latitude:'32.0', 	longitude:'49.0'	],
		rus: [ offical: true,	sname:'Russia', 			latitude:'100.0', 	longitude:'60.0'	],
		blr: [ offical: true,	sname:'Belarus', 			latitude:'28.0', 	longitude:'53.0'	],
		gbr: [ offical: true,	sname:'Great Britain', 		latitude:'-2.0', 	longitude:'54.0'	],
		kaz: [ offical: true,	sname:'Kazakhstan', 		latitude:'68.0', 	longitude:'48.0'	],
		 xk: [ offical: false,	sname:'Kosovo', 			latitude:'21', 		longitude:'42.5'	],
		kgz: [ offical: true,	sname:'Kyrgyzstan', 		latitude:'75.0',	longitude:'41.0'	],
		mkd: [ offical: true,	sname:'Macedonia', 			latitude:'0', 		longitude:'0'		],
		mda: [ offical: true,	sname:'Moldova', 			latitude:'0',		longitude:'0'		],
		srb: [ offical: true,	sname:'Serbia', 			latitude:'21.0', 	longitude:'44.0'	],
		mne: [ offical: true,	sname:'Montenegro', 		latitude:'19.0', 	longitude:'42.0'	],
		nirl:[ offical: false,	sname:'Northern Ireland', 	latitude:'-6.074815', longitude:'54.6554798'],
		uzb: [ offical: true,	sname:'Uzbekistan', 		latitude:'64.0', 	longitude:'41.0'	]
		
	]
		
	
		
	public static Object byCode(String code, String col=null) {
		def res = null

		if (col)
			res = countries.get(code)."$col"
		else
			res = countries.get(code)
		res
	}
	
	public static Collection codes() {
		countries.keySet()
	}
			
	public static List<List> list(Collection forCodes) {
		
		def res = []
						
		countries.each { key, value -> 		
			
			assert value instanceof Map
			value.put("code",(key))	
			if (forCodes) {
				if (forCodes.contains(key)) {
					res.add(value)
				}
			} else {
				res.add(value)
			}
		}
			
		return res
	}
	
			
	public static List<List> listStates(String code) {
		
		def res = []
			
		countries."$code".states.each { key, value -> 	
			
			assert value instanceof Map
			value.put("code",(key))	
			res.add(value)
		}
			
		return res
	}
}

