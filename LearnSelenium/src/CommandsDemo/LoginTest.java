package CommandsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://online-learning.harvard.edu/course/data-science-capstone?delta=0");
		*/
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.className("email")).sendKeys("rapoleraghu@gmail.com");
		driver.findElement(By.className("password")).sendKeys("Raghu@1995");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		//driver.get("http://demowebshop.tricentis.com/register");
		//driver.findElement(By.)
		 String expectedName="Demo Web Shop";
		 String actualName=driver.getTitle();
		 System.out.println(actualName);
		 if(expectedName.equals(actualName))
		 {
			 System.out.println("U are on the correct page:");
		 }
		 else
		 {
			 System.out.println("Incorrect Page:");
		 }
		 System.out.println("Length of the title:"+actualName.length());
		 String url=driver.getCurrentUrl();
		 System.out.println("You are at url:"+url);
		 String Url="http://demowebshop.tricentis.com/";
		 if(Url.equals(url))
		 {
			 System.out.println("You are on correct page.");
			
		 }
		 else
		 {
			 System.out.println("You are not on correct Page.");
		 }
		 String pageSource=driver.getPageSource();
		 System.out.println("Page source:"+pageSource);
		 System.out.println("Page source length:"+pageSource.length());
		driver.close();
		 
		
	}

}
