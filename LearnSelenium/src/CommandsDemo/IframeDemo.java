package CommandsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		List<WebElement> iframescount=driver.findElements(By.tagName("iframe"));
		System.out.println("No.of frames:"+iframescount.size());
		
		for(int i=0;i<iframescount.size();i++)
		{
			System.out.println(iframescount.get(i).getAttribute("name"));
		}
		  
		//switch to frame
		
		WebElement frame=driver.findElement(By.xpath("//*[@id='Single']//iframe"));
		driver.switchTo().frame(frame);
		
		//enter the value into the text box inside frame
		WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox.sendKeys("Selenium");
		
		
	}

}
