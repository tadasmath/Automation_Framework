package software;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="C:\\Selenium\\ChromeDriver\\chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver=new ChromeDriver(); 

	}

}
