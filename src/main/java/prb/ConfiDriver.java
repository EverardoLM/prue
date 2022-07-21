package prb;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.WebDriver;

//Detecta el driver
import io.github.bonigarcia.wdm.WebDriverManager;


public class ConfiDriver {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Logger LOGGER = Logger.getLogger("cn");
	public static Actions action;
	
	public void iniciaChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		action = new Actions(driver);
		LOGGER.log(Level.INFO, "WEBDRIVER INICIADO CORRECTAMENTE");
		driver.manage().deleteAllCookies();
		driver.get("https://www.grupobancolombia.com/");
		driver.manage().window().maximize();
		
	}
	
	

}
