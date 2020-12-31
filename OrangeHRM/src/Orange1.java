
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange1 training = new Orange1();
		training.LauchBrowser();
		//training.search();

	}
	WebDriver driver;

	//launching the chrome browser
	public void LauchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjali\\Desktop\\seleniumzip\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// click on the search Username and password fields and send value
		driver.findElement(By.id( "txtUsername")).sendKeys("Admin");
		driver.findElement(By.id( "txtPassword")).sendKeys("admin123");
		
		//Click  on the Login Button
		driver.findElement(By.name("Submit")).click();
		
		
		
	}

	
}



	










	
		