package software;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
