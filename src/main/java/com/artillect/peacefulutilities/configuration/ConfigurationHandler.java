package com.artillect.peacefulutilities.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile){
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		try {
			//Load config
			configuration.load();
			//Read in properties
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
		}
		catch(Exception e){
			//Log the exception
		}
		finally {
			//Save config
			configuration.save();
		}
		
		System.out.println(configValue);
	}
}
