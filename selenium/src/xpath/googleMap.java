package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleMap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("mysore");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@aria-label='Driving']")).click();

	}

}
