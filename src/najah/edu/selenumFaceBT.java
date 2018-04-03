package najah.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenumFaceBT {
	static WebDriver driver;
	
	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Desktop\\3rdY2ndSYM\\softwear\\jars for projects\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://ar-ar.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("raya.mah.987@gmail.com");
driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("rayamah987");
driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
