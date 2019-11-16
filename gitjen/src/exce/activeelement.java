package exce;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
public class activeelement {
 static WebElement q;
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:/Users/mohan/Documents/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		
		//driver.switchTo().activeElement().sendKeys("Poojai"+Keys.ENTER);
		
		PageFactory.initElements(driver, activeelement.class);
		q.sendKeys("Poojai"+Keys.ENTER);
		System.out.println("Test Passed!");
		System.out.println("Test6 Passed!");
		System.out.println("Test36 Passed!");
		System.out.println("Test96 Passed!");
		
	}
}

