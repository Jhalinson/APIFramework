package com.brakingbadapi.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.breakingbadapi.qa.apiConfigs.APIPath;
import com.breakingbadapi.qa.enums.ConfigProperties;


public class ReaderProperty {
	
	private  Properties prop = new Properties();
	private final Map<String, String> PROPMAP = new HashMap<>();

	public ReaderProperty() {
		FileInputStream fiS;
		try {
			fiS = new FileInputStream(APIPath.getConfigpath());
			prop.load(fiS);
			
			for (Map.Entry<Object, Object> key : prop.entrySet()) {
				PROPMAP.put(String.valueOf(key.getKey()), String.valueOf(key.getValue()).trim());
		} }catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		}
	

//	static {
//
//		try {
//			FileInputStream fiS = new FileInputStream(APIPath.getConfigpath());
//			prop.load(fiS);
//
//			for (Map.Entry<Object, Object> key : prop.entrySet()) {
//				PROPMAP.put(String.valueOf(key.getKey()), String.valueOf(key.getValue()).trim());
//
//			}
//		} catch (Exception e) {
//			System.out.println("Error loading config.properties " + e.getMessage());
//			e.printStackTrace();
//		}
//
//	}

	public  String getValue(ConfigProperties key) throws Exception {
		String value;
		if (Objects.isNull(key) || Objects.isNull(PROPMAP.get(key))) {
			value = PROPMAP.get(key.name().toLowerCase());
		} else {
			throw new Exception("Property name:  " + key + " is not found. Please check config.properties");
		}

		return value;
	}	
}
