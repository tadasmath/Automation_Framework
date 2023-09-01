package software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());	
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
