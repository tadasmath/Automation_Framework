package software;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String Source=driver.getPageSource();
		System.out.println(Source);

	}

}
