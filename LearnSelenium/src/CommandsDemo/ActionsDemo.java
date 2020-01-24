package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		driver.navigate().back();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		//act.sendKeys(Keys.ENTER).perform();
		Actions act2=new Actions(driver);
		
		act2.sendKeys(Keys.DOWN).perform();
		//driver.findElement(By.xpath("//ul[@class='erkvQe']//li[2]//div[1]//div[2]")).click();
		act2.sendKeys(Keys.ENTER).perform();
	}

}
