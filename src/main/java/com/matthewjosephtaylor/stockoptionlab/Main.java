package com.matthewjosephtaylor.stockoptionlab;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Main 
{
	private static final Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) throws Exception {
		logger.info("Stock Option Lab v"
				+ Main.class.getPackage().getImplementationVersion());
		logger.info("Build: "
				+ ResourceBundle.getBundle("buildInfo")
				.getString("buildNumber"));


	}}
