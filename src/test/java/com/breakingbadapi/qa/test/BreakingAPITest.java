package com.breakingbadapi.qa.test;

import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.breakingbadapi.qa.baseTest.BaseTest;
import com.breakingbadapi.qa.enums.ConfigProperties;
import com.breakingbadapi.qa.pojos.Characters;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class BreakingAPITest extends BaseTest {
	@Test
	public void getBirthdayDate() throws Exception {

		try {
			RestAssured.baseURI = readerProterty.getValue(ConfigProperties.URL);
			Response response = given().when().get(apiPath.getGETSINGLECHARACTER());

			String body = response.getBody().asString();
			JsonPath jsonPath = new JsonPath(body);
			String birthday = jsonPath.getString("birthday");
			System.out.println("Birthday:: " + birthday);
			Assert.assertEquals(response.getStatusCode(), 200);
			Assert.assertEquals(birthday, "[09-07-1958]");

		} catch (Exception e) {
		e.getStackTrace();
		}

	}

	@Test
	public void getNameAndPortrayed() throws Exception {

		try {

			RestAssured.baseURI = readerProterty.getValue(ConfigProperties.URL);

			Characters[] character = RestAssured.given().when().get(apiPath.getGETALLCHARACTERS())
					.as(Characters[].class);
			/**
			 * Another logic that can apply
			 * 
			 **/

//			for (int i = 0; i < character.length; i++) {
//				Characters characters = character[i];
//				System.out.println("Name:: "+characters.getName());
//				System.out.println("Portrayed:: "+characters.getPortrayed());
//				System.out.println("--------------------------");
//				
//			}

			for (Characters characters : character) {
				System.out.println("Name: " + characters.getName());
				System.out.println("Portrayed: " + characters.getPortrayed());
				System.out.println("--------------------------");
			}

		} catch (Exception e) {
		
			e.getStackTrace();
		}

	}

}
