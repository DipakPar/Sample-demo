package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class test extends base {

	@Test
	public void method1() throws InterruptedException {
	
		WebElement emailinputbox = driver.findElement(By.className("whsOnd"));
	    helper.highLighterMethod(driver, emailinputbox);
		emailinputbox.sendKeys(data.userid, Keys.ENTER);
		Thread.sleep(1000);
		WebElement passwordinputbox = driver.findElement(By.name("password"));
		helper.highLighterMethod(driver, passwordinputbox);
		passwordinputbox.sendKeys(data.Pass, Keys.ENTER);
		Thread.sleep(8000);
		mail1.findmail();
	}
/*@Test
public void method2(){
	mail1.findmail();
}*/
}
