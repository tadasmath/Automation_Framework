package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/Qspider.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("countries"));
		Select S=new Select(ele); 
		S.selectByIndex(1);
		Thread.sleep(2000);
		S.selectByValue("k");
		Thread.sleep(2000);
		S.selectByVisibleText("India");
		Thread.sleep(2000);
		S.deselectAll();
		

	}

}
