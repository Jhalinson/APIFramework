package com.breakingbadapi.qa.baseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.brakingbadapi.qa.utils.ReaderProperty;
import com.breakingbadapi.qa.apiConfigs.APIPath;
import com.breakingbadapi.qa.enums.ConfigProperties;

import io.restassured.response.Response;

@Listeners(com.breakingbadapi.qa.reports.ExtentReport.class)
public class BaseTest {
	protected Response response;
	protected ReaderProperty readerProterty;
	protected APIPath apiPath;

	@BeforeMethod
	public void setUp() {
		apiPath = new APIPath();
		readerProterty = new ReaderProperty();
		
	}

}
