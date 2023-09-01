package software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("file:///C:/Users/dell/Desktop/Qspider.html");
		driver.get("https:/www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
