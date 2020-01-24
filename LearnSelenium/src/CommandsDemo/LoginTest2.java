package CommandsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginTest2 {

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
		 String pageTitle=driver.getTitle();
		 System.out.println("Page title:"+pageTitle);
		 String expectedTitle="Demo Work Shop";
		 if(pageTitle.equals(expectedTitle))
		 {
			 System.out.println("You are on correct page.");
		 }
		 else
		 {
			 System.out.println("You are not on correct page.");
		 }
		 System.out.println("Length of the page title"+pageTitle.length());
		 String url=driver.getCurrentUrl();
		 System.out.println("The url of the current page:"+url);
		 String Url="http://demowebshop.tricentis.com/";
		 if(Url.equals(url))
		 {
			 System.out.println("You are on correct page url");
		 }
		 else
		 {
			 System.out.println("You are not on correct page url");
		 }
		 String pageSource=driver.getPageSource();
		 System.out.println("The source code of the page:"+pageSource);
		 
		 System.out.println("Length of the source code page:"+pageSource.length());
		 driver.close();
		 
		
	}

}

