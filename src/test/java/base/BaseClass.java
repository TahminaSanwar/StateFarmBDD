package base;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import common.CommonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.MainPage;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static CommonMethods cm;
	public static MainPage mainPage;

	
	public static void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.statefarm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		initClasses();
	}

	
	public static void tearUp() {
		driver.quit();
	}

	private static void initClasses() {
		cm = new CommonMethods();
		mainPage = new MainPage(driver);

	}
}
