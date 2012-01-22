package at.subsquare.commons

/**
 * CountryLocation
 *
 * Class to query properties regaring Countries
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
		alb: [	sname:'Albania', 			latitude:'20.0', 	longitude:'41.0'	],
		and: [	sname:'Andorra', 			latitude:'1.6', 	longitude:'42.5'	],
		arm: [	sname:'Armenia', 			latitude:'45.0', 	longitude:'40.0'	],
		aut: [	sname:'Austria', 			latitude:'13.3333', longitude:'47.3333'	],
		aze: [	sname:'Azerbaijan', 		latitude:'47.5', 	longitude:'40.5'	],
		bel: [	sname:'Belgium', 			latitude:'4.0', 	longitude:'50.8333'	],
		bih: [	sname:'Bosnia-Herzegovina', latitude:'18.0',	longitude:'44.0'	],
		bgr: [	sname:'Bulgaria', 			latitude:'25.0', 	longitude:'43.0'	],
		hrv: [	sname:'Croatia', 			latitude:'15.5', 	longitude:'45.1667'	],
		cyp: [	sname:'Cyprus', 			latitude:'33.0', 	longitude:'35.0'	],
		cze: [	sname:'Czech Republic', 	latitude:'15.5', 	longitude:'49.75'	],
		dnk: [	sname:'Denmark', 			latitude:'10.0',	longitude:'56.0'	],
		est: [	sname:'Estonia', 			latitude:'26.0',	longitude:'59.0'	],
		fin: [	sname:'Finland', 			latitude:'26.0',	longitude:'64.0'	],
		fra: [	sname:'France', 			latitude:'2.0',  	longitude:'46.0'	],
		geo: [	sname:'Georgia',		 	latitude:'43.5',	longitude:'42.0'	],
		deu: [	sname:'Germany',			latitude:'9.0', 	longitude:'51.0'	],
		grc: [	sname:'Greece',  			latitude:'22.0', 	longitude:'39.0'	],
		hun: [	sname:'Hungary', 			latitude:'20.0',	longitude:'47.0'	],
		isl: [	sname:'Iceland', 			latitude:'-18.0', 	longitude:'65.0'	],
		irl: [	sname:'Ireland', 			latitude:'-8.0',	longitude:'53.0'	],
		ita: [	sname:'Italy', 				latitude:'12.8333', longitude:'42.8333'	],
		lva: [	sname:'Latvia', 			latitude:'25.0', 	longitude:'57.0'	],
		lie: [	sname:'Liechtenstein', 		latitude:'9.5333', 	longitude:'47.1667'	],
		ltu: [	sname:'Lithuania', 			latitude:'24.0', 	longitude:'56.0'	],
		lux: [	sname:'Luxembourg', 		latitude:'6.1667', 	longitude:'49.75'	],
		mlt: [	sname:'Malta', 				latitude:'14.5833', longitude:'35.8333'	],
		mco: [	sname:'Monaco', 			latitude:'7.4', 	longitude:'43.7333'	],
		naka:[	sname:'Nagorno Karaback ', 	latitude:'47.5', 	longitude:'40.5'	],
		nld: [	sname:'Netherlands', 		latitude:'5.75', 	longitude:'52.5'	],
		nor: [	sname:'Norway', 			latitude:'10.0', 	longitude:'62.0'	],
		pol: [	sname:'Poland', 			latitude:'20.0', 	longitude:'52.0'	],
		prt: [	sname:'Portugal', 			latitude:'-8.0', 	longitude:'39.5'	],
		rou: [	sname:'Romania',			latitude:'25.0', 	longitude:'46.0'	],
		smr: [	sname:'San Marino', 		latitude:'12.4167', longitude:'43.7667'	],
		svk: [	sname:'Slovakia', 			latitude:'19.5', 	longitude:'48.6667'	],
		svn: [	sname:'Slovenia', 			latitude:'15.0', 	longitude:'46.0'	],
		esp: [	sname:'Spain', 				latitude:'-4.0', 	longitude:'40.0'	],
		swe: [	sname:'Sweden', 			latitude:'15.0', 	longitude:'62.0'	],
		che: [	sname:'Switzerland', 		latitude:'8.0', 	longitude:'47.0'	],
		tur: [	sname:'Turkey', 			latitude:'35.0', 	longitude:'39.0'	],
		ukr: [	sname:'Ukraine', 			latitude:'32.0', 	longitude:'49.0'	],
		rus: [	sname:'Russia', 			latitude:'100.0', 	longitude:'60.0'	],
		blr: [	sname:'Belarus', 			latitude:'28.0', 	longitude:'53.0'	],
		gbr: [	sname:'Great Britain', 		latitude:'-2.0', 	longitude:'54.0'	],
		kaz: [	sname:'Kazakhstan', 		latitude:'68.0', 	longitude:'48.0'	],
		 xk: [	sname:'Kosovo', 			latitude:'21', 		longitude:'42.5'	],
		kgz: [	sname:'Kyrgyzstan', 		latitude:'75.0',	longitude:'41.0'	],
		mkd: [	sname:'Macedonia', 			latitude:'0', 		longitude:'0'		],
		mda: [	sname:'Moldova', 			latitude:'0',		longitude:'0'		],
		srb: [	sname:'Serbia', 			latitude:'21.0', 	longitude:'44.0'	],
		mne: [	sname:'Montenegro', 		latitude:'19.0', 	longitude:'42.0'	],
		nirl:[	sname:'Northern Ireland', 	latitude:'-6.074815', longitude:'54.6554798'],
		uzb: [	sname:'Uzbekistan', 		latitude:'64.0', 	longitude:'41.0'	]
		
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
	

}

