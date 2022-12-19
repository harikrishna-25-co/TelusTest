package com.telus.test.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class OptikTVUtil {

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	public void findElementByMenuName(String name) {
		WebElement onDemandButton = driver.findElement(By.name(name));
		wait.until(ExpectedConditions.elementToBeClickable(onDemandButton));
		onDemandButton.click();

	}

	public MobileElement getMovieInfoDetailsBasedOnGenreProvided(String genre) {
		MobileElement getMovieInfoDetailsBasedOnGenreProvided = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().textContains(\"" + genre + "\"))"));
		wait.until(ExpectedConditions.elementToBeClickable(getMovieInfoDetailsBasedOnGenreProvided));
		getMovieInfoDetailsBasedOnGenreProvided.click();
		return getMovieInfoDetailsBasedOnGenreProvided;

	}

	public MobileElement findMovieAssetElementByGenreType(String genre) {
		MobileElement findMovieAssetElementByGenreType = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + genre + "\").instance(0))"));
		wait.until(ExpectedConditions.elementToBeClickable(findMovieAssetElementByGenreType));
		findMovieAssetElementByGenreType.click();
		return findMovieAssetElementByGenreType;
	}

	public MobileElement findMobileElementByLabel(String name) {
		MobileElement findMobileElementByLabel = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + name + "\"))"));
		wait.until(ExpectedConditions.elementToBeClickable(findMobileElementByLabel));
		findMobileElementByLabel.click();
		return findMobileElementByLabel;
	}

	public void backButton() {
		WebElement backBtn = driver.findElement(By.id("com.optiktv:id/backBtn"));
		wait.until(ExpectedConditions.elementToBeClickable(backBtn));
		backBtn.click();
	}

}
