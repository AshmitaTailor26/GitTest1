package abc.abc;


import org.openqa.selenium.opera.OperaDriver;

public class abc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver", "/usr/local/bin/operadriver/");
		OperaDriver driver = new OperaDriver();
		driver.get("http://www.google.com/");
			

	}

}
