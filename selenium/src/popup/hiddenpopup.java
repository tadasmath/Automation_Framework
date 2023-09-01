package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjwoK2mBhDzARIsADGbjeqGPHIGZ7j8cIO_L6Ds3mIMmnOjSROy3G7AhVx8f_xB3M2Ok26HRrEaAvqVEALw_wcB&gclid=Cj0KCQjwoK2mBhDzARIsADGbjeqGPHIGZ7j8cIO_L6Ds3mIMmnOjSROy3G7AhVx8f_xB3M2Ok26HRrEaAvqVEALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Sun, Aug 6']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='Wed, Aug 9']")).click();
		driver.quit();

	}

}
