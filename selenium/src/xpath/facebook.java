package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   public class facebook
   {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("akshu@123");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dtf5551");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@name='login']")).click();

}
}