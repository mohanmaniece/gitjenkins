package exce;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/mohan/Documents/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(9) > a > img")).click();
		//normal alert
		WebElement alertboxok=	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertboxok.click();
		Alert okalert=driver.switchTo().alert();
		Thread.sleep(3000);
		okalert.accept();

		//confirmation alert
		WebElement alertboxcancel=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		alertboxcancel.click();
		Alert cancelalert=driver.switchTo().alert();
		Thread.sleep(3000);
		cancelalert.dismiss();

		//prompt alert(send text)

		WebElement alertboxsendtext=	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		alertboxsendtext.click();
		Alert sendtext=driver.switchTo().alert();
		Thread.sleep(3000);
		sendtext.sendKeys("pooja");
		sendtext.accept();


	}
}

