package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/");
		Thread.sleep(1000);
		//step1
		TakesScreenshot ts=(TakesScreenshot)driver;
		//step2
		File src = ts.getScreenshotAs(OutputType.FILE);
		//step3
		File dst = new File("C:\\Selenium\\popup.jpeg");
		FileHandler.copy(src, dst);
		

	}

}
