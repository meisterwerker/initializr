package com.jverrecchia.initializr.builder.mode;

import com.jverrecchia.initializr.builder.files.File;

public class Boilerplate extends Mode { 
	
	public Boilerplate(){
		this.setName("boilerplate-initializr");
		this.getFiles().add(new File("index.html", "builder/templates/index.html", true, true));
		this.getFiles().add(new File("css/style.css", "builder/templates/style.css", true, true));
		this.getDefaultModulesNames().add("h5bp-content");
		this.getDefaultModulesNames().add("h5bp-css");
		this.getDefaultModulesNames().add("h5bp-csshelpers");
		this.getDefaultModulesNames().add("h5bp-mediaqueries");
		this.getDefaultModulesNames().add("h5bp-mediaqueryprint");		
		this.getDefaultModulesNames().add("h5bp-primarystyles");
		this.getDefaultModulesNames().add("h5bp-favicon");
		this.getDefaultModulesNames().add("h5bp-appletouchicons");
		this.getDefaultModulesNames().add("h5bp-adobecrossdomain");
		this.getDefaultModulesNames().add("h5bp-humans");
		this.getDefaultModulesNames().add("h5bp-robots");
		this.getDefaultModulesNames().add("h5bp-404");
	}
}
