package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=mail-direct&pspid=159600001&done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.lang%3Den-IN&add=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("akshust@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akshu123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-labelledby='to']")).sendKeys("akshust123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("done");


	}

}
