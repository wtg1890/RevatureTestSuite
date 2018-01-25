package com.revature.tester;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodUtil {

	int times;
	public WebElement waitForLoad(WebDriver driver, String xpath) {
		WebElement element = null;
		while(element == null) {
			try {
				element = driver.findElement(By.xpath(xpath));
			} catch(NoSuchElementException e) {
				if(times < 10) {
					try {
						Thread.sleep(200);
						times++;
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				else {
					e.printStackTrace();
				}
			}
		}
		times = 0;
		return element;
	}
}
