package com.revature.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {
	
	public static void navigateToSettingsPage(WebDriver wd) {
		try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
		wd.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a")).click();
	}
	
	public static WebElement timelineTrainersPerPage(WebDriver wd) {
		return wd.findElement(By.id("input_3"));
//		return wd.findElement(By.xpath("//*[@id=\"input_181\"]"));			// xpath/id changes when the page is loaded/reloaded
	}
	
	public static WebElement reportsOutgoingGrads(WebDriver wd) {
		return wd.findElement(By.id("input_4"));
	}
	
	public static WebElement reportsIncomingCandidates(WebDriver wd) {
		return wd.findElement(By.id("input_5"));
	}
	
	// Drop Down Menu
	public static WebElement defaultLocation(WebDriver wd) {
		return wd.findElement(By.id("select_6"));
	}

	// Drop Down Menu
	public static WebElement defaultBuilding(WebDriver wd) {
		return wd.findElement(By.id("select_7"));
	}
	
	public static WebElement minBatchSize(WebDriver wd) {
		return wd.findElement(By.id("input_10"));
	}
	
	public static WebElement maxBatchSize(WebDriver wd) {
		return wd.findElement(By.id("input_11"));
	}
	
	public static WebElement defaultBatchLength(WebDriver wd) {
		return wd.findElement(By.id("input_12"));
	}
	
	public static WebElement minBetweenTrainerBatch(WebDriver wd) {
		return wd.findElement(By.id("input_13"));
	}
	
	// only used when logged-in as VP
	public static WebElement findSaveButton(WebDriver wd) {
		return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/section/button[1]"));
	}
	
	// only used when logged-in as VP
	public static WebElement findResetButton(WebDriver wd) {
		return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/section/button[2]"));
	}
}
