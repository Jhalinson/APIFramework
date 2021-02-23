package com.breakingbadapi.qa.apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfig {
	private static Map<String, String> defaultHeader = null;
	public static Map<String, String> defaultHeader(){
		defaultHeader = new HashMap<String, String>();
		defaultHeader.put("Content-Type", "application/json");
		
		return defaultHeader;
	}

}
