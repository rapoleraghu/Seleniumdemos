package CommandsDemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		
		Select s=new Select(driver.findElement(By.id("yearbox")));
		List<WebElement> list=s.getOptions();
		System.out.println("No.of years:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		WebElement year=driver.findElement(By.id("yearbox"));
		Select s1=new Select(year);
		s1.selectByVisibleText("1995");
		
		
		
		
		Select month=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		List<WebElement> Month=month.getOptions();
		System.out.println("No.of Months:"+Month.size());
		for(int i=1;i<Month.size();i++)
		{
			System.out.println(Month.get(i).getText());
		}
		WebElement Month1=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select s2=new Select(Month1);
		s2.selectByVisibleText("February");
		
		
		
		
		Select day=new Select(driver.findElement(By.id("daybox")));
		List<WebElement> Day=day.getOptions();
		System.out.println("No.of day:"+Day.size());
		for(int i=1;i<Day.size();i++)
		{
			System.out.println(Day.get(i).getText());
		}
		WebElement Day1=driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		Select s3=new Select(Day1);
		s3.selectByVisibleText("10");
		
		
		
	}

}
