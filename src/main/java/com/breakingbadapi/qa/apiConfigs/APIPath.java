package com.breakingbadapi.qa.apiConfigs;

public class APIPath {
	private  final String GETSINGLECHARACTER = "/api/characters/1";
	
	private  final String GETALLCHARACTERS = "/api/characters";
	
	private static final String CONFIGPATH =System.getProperty("user.dir")+"/inputs/config.properties";
	private static final String REPORTPATH = System.getProperty("user.dir")+"/extent-test-output/index.html";
	private static final String EXCELPATH = System.getProperty("user.dit")+"/inputs/constdata.xlsx";
	public static String getExcelpath() {
		return EXCELPATH;
	}

	public static String getReportpath() {
		return REPORTPATH;
	}

	public APIPath() {
		
	}

	public String getGETSINGLECHARACTER() {
		return GETSINGLECHARACTER;
	}

	public String getGETALLCHARACTERS() {
		return GETALLCHARACTERS;
	}

	public static String getConfigpath() {
		return CONFIGPATH;
	}

	
	
	

}
