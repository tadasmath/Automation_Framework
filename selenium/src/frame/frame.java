package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/mainpage.html");
		driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("fsyt2");
		Thread.sleep(1000);
		//WebElement frame = driver.findElement(By.tagName("ifame"));
		//driver.switchTo().frame(frame);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("dua");

	}

}
