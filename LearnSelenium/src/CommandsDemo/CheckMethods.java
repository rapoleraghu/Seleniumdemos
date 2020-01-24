package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		boolean checkPresence=driver.findElement(By.name("q")).isDisplayed();
		System.out.println(checkPresence);
		 
		boolean checkEnabled=driver.findElement(By.name("q")).isEnabled();
		System.out.println(checkEnabled);
		
		if(checkPresence==true && checkEnabled==true)
		{
			driver.findElement(By.name("q")).sendKeys("Nikhitha Vangaru");
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
		}
	}

}
