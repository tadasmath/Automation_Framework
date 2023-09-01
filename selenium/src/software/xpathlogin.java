package software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlogin
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("akshu@123");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dtf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
		
		/*driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("8895563255");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sftduwi55");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();*/
	
		/*driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@jstcache='50']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("mysore");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@aria-label='Driving']")).click();*/
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("asur2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='video-title']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
		
		//movie name and collection
		//a[text()='Satya Prem Ki Katha']/../../../td[2]
		//a[text()='The Trial']/../../../td[3]
		//strong[text()='Baby(Telugu)']/../../../td[4]
	}
}


