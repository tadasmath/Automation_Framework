import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("akshata");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tadasmath");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("akshu@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8892236211");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, April 8th, 1995']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("practice form");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("form");
		
		
		

	}

}
