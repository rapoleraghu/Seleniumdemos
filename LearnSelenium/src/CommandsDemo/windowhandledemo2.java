package CommandsDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandledemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window's handle: "+parentwindow);
        
		WebElement clickElement=driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]"));
		
		for(int i=0;i<3;i++){
			clickElement.click();
			Thread.sleep(3000);
		}
		List<String>childwindow=new ArrayList<>(driver.getWindowHandles());
		System.out.println("Child window name"+childwindow);
		String lastwindow="";
		for(int i=0;i<childwindow.size();i++){
			driver.switchTo().window(childwindow.get(i).toString());
			driver.get("https://www.google.com/");
			lastwindow=childwindow.get(i).toString();
		}
		driver.switchTo().window(parentwindow);
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
