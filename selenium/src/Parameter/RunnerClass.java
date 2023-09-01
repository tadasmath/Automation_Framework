package Parameter;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerClass extends Generic{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.name("pass")).sendKeys("acfg45");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
}
