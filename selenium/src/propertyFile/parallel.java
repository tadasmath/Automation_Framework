package propertyFile;

import java.util.Properties;

import org.testng.annotations.Test;

public class parallel {
	@Test
	public void test1()
	{
		//step1
		Properties p=new Properties();
		//step2
		p.load(new FileInputStream("./p.Properties"));
		//step3
		String val=p.getProperty("baseurl");
		System.out.println(val);
	}

}
