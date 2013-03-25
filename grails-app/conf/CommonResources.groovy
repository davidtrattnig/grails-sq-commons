modules = {
  
	sqCommons {
		dependsOn 'ui'
		resource url: '/js/sq-commons.js', disposition: 'head' 
	}	

	ui {
        dependsOn 'jquery'
		//dependsOn 'jquery-ui'
	}
}