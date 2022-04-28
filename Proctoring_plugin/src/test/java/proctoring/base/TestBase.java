package proctoring.base;

import java.io.FileInputStream;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	static String ProjectPath= System.getProperty("user.dir");

	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\BS784\\Documents\\Automation\\Proctoring_plugin\\src\\test\\java\\proctoring\\config\\config.properties");
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@BeforeSuite
	public static void initialization(){
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", ProjectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		

		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		driver.get(prop.getProperty("url"));

		
	

	}
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
}

