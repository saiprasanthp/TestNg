package com.Actions.keyup_keydown;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyUp_KeyDown {
	
	@Test
	public void m1() {
		WebDriver driver=new ChromeDriver();
		Actions a=new Actions(driver);
		a.keyUp(Keys.CONTROL);
		a.keyDown(Keys.BACK_SPACE);
		a.keyUp(Keys.PAGE_DOWN);
		a.keyDown(Keys.ESCAPE).build().perform();
	}
}