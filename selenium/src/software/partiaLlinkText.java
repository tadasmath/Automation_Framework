package software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiaLlinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https:/www.facebook.com");
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("for")).click();
		driver.findElement(By.partialLinkText("cloth")).click();

	}

}
