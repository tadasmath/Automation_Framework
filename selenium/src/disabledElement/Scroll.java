package disabledElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	    WebElement ele = driver.findElement(By.xpath("//a[text()='Instagram']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Point locn = ele.getLocation();
		int x = locn.getX();
		int y=locn.getY();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy ("+x+","+y+")");
		Thread.sleep(1000);
		ele.click();
		
		

	}

}
