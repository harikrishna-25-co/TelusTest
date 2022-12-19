package com.telus.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.telus.test.util.OptikTVUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OptikTVTest {

	OptikTVUtil optikTVTest;
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() throws MalformedURLException {

		optikTVTest = new OptikTVUtil();
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Device information
		capabilities.setCapability("deviceName", "Pixel 4 API 29");
		capabilities.setCapability("udid", "emulator-5554");

		// Platform information
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10.0");
		capabilities.setCapability("automationName", "UiAutomator");

		// Application Information
		capabilities.setCapability("appActivity", "com.telus.mediaroom.tvx.ui.main.MainActivity");
		capabilities.setCapability("appPackage", "com.optiktv");
		capabilities.setCapability("BROWSER_NAME", "Chrome");

		driver = new AndroidDriver<MobileElement>(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		wait = new WebDriverWait(driver, 30);

	}

	@Test
	public void testMoviesBy18AGenreType() {

		optikTVTest.findElementByMenuName("On Demand");

		optikTVTest.findMobileElementByLabel("Movies  >");

		// Clicking on the asset by rating
		MobileElement findMovieAssetElementBy18AType = optikTVTest.findMovieAssetElementByGenreType("18A");

		// getting the asset rating text based on genre provided
		MobileElement getMovieAssetTextType = optikTVTest.getMovieInfoDetailsBasedOnGenreProvided("18A");

		// Validating the asset rating text
		Assert.assertEquals(findMovieAssetElementBy18AType.getText(), "18A");
		Assert.assertTrue(getMovieAssetTextType.getText().contains("18A"));

		// going back to movies home page
		optikTVTest.backButton();
	}

	@Test
	public void testMoviesByC8GenreType() {

		// Clicking on the asset by rating
		MobileElement findMovieAssetElementByType = optikTVTest.findMovieAssetElementByGenreType("C8+");

		// getting the asset rating text based on genre provided
		MobileElement getMovieAssetTextType = optikTVTest.getMovieInfoDetailsBasedOnGenreProvided("C8+");

		// Validating the asset rating text
		Assert.assertEquals(findMovieAssetElementByType.getText(), "C8+");
		Assert.assertTrue(getMovieAssetTextType.getText().contains("C8+"));

		// going back to movies home page
		optikTVTest.backButton();

	}

	@Test
	public void testMoviesByPGGenreType() {

		// Clicking on the asset by rating
		MobileElement findMovieAssetElementByType = optikTVTest.findMovieAssetElementByGenreType("PG");

		// getting the asset rating text based on genre provided
		MobileElement getMovieAssetTextType = optikTVTest.getMovieInfoDetailsBasedOnGenreProvided("PG");

		// Validating the asset rating text
		Assert.assertEquals(findMovieAssetElementByType.getText(), "PG");
		Assert.assertTrue(getMovieAssetTextType.getText().contains("PG"));

		// going back to movies home page
		optikTVTest.backButton();

	}

	@Test
	public void testMoviesBy14AGenreType() {

		// Clicking on the asset by rating
		MobileElement findMovieAssetElementByType = optikTVTest.findMovieAssetElementByGenreType("14A");

		// getting the asset rating text based on genre provided
		MobileElement getMovieAssetTextType = optikTVTest.getMovieInfoDetailsBasedOnGenreProvided("14A");

		// Validating the asset rating text
		Assert.assertEquals(findMovieAssetElementByType.getText(), "14A");
		Assert.assertTrue(getMovieAssetTextType.getText().contains("14A"));

		// going back to movies home page
		optikTVTest.backButton();

	}

	@Test
	public void testMoviesByGGenreType() {

		// Clicking on the asset by rating
		MobileElement findMovieAssetElementByType = optikTVTest.findMovieAssetElementByGenreType("G");

		// getting the asset rating text based on genre provided
		MobileElement getMovieAssetTextType = optikTVTest.getMovieInfoDetailsBasedOnGenreProvided("G");

		// Validating the asset rating text
		Assert.assertEquals(findMovieAssetElementByType.getText(), "G");
		Assert.assertTrue(getMovieAssetTextType.getText().contains("G"));

		// going back to movies home page
		optikTVTest.backButton();
	}

}
