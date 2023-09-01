package Assertion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Assert extends Generic 
{
	@Test
	public void test1() 
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("mana");
		driver.findElement(By.name("login")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title,"")
		
		
	}
	
	

}
