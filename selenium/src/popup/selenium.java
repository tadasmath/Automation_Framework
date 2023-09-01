package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Blog']"));
        ArrayList<WebElement> l=new ArrayList();
        l.add(ele);
        l.add(ele1);
        l.add(ele2);
        l.add(ele3);
        l.add(ele4);
        Actions act=new Actions(driver);
        
        Robot r=new Robot();
        for(WebElement clk:l)
        {
        act.contextClick(clk).perform();
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        }
        
        Set<String> allwh=driver.getWindowHandles();
       // ArrayList<WebElement>
      //  driver.switchTo().window("https://www.selenium.dev/documentation/");
		
		

	}

}
