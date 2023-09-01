package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class order {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/b/ref=nav_ya_signin?node=6648217031&pf_rd_r=NQ2T7W8RST0XNVYFDDX6&pf_rd_p=1650917e-ff65-4959-8213-25925d40313f&pd_rd_r=ba463473-2712-4d4a-86df-e99e5bc32a42&pd_rd_w=vCOTW&pd_rd_wg=tGOhO&");
		//driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("kurta");
		driver.findElement(By.xpath("//li[@data-csa-c-id='92k1vv-qxdoop-mbzz8l-scilri']")).click();
		Thread.sleep(2000);
		
		
		
		driver.quit();

	}

}
