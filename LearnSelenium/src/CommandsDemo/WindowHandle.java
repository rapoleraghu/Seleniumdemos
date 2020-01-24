package CommandsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		System.out.println("The title of main window is:"+driver.getTitle());
		WebElement tabwindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabwindow.click();
		Set<String>windowids=driver.getWindowHandles();
		Iterator<String>iter=windowids.iterator();
		String mainWindow=iter.next();
		String childWindow=iter.next();
		driver.switchTo().window(childWindow);
		System.out.println("The title of child window is:"+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(mainWindow);
		System.out.println("The Title of main window is:"+driver.getTitle());
		
	}

}
