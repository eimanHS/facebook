package najah.edu;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class testFBwithJunit {
static WebDriver driver;


	@BeforeClass
public static void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Desktop\\3rdY2ndSYM\\softwear\\jars for projects\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterClass
	public static void  tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("https://ar-ar.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("raya.mah.987@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("rayamah987");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
