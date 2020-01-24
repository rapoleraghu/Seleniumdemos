package CommandsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Registration {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rapole");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Raghu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("2-3-182/5,Vidhya Nagar Colony,Narayanakhed,Sangareddy,Telangana");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("rapoleraghu@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6300665234");
		Thread.sleep(1000);
		//driver.findElement(By.className("ui-autocomplete-multiselect ui-state-default ui-widget")).sendKeys("English,Telugu,Hindi,Kanada");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
	}

}
