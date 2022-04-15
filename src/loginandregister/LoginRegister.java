package loginandregister;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LoginRegister {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\LivestockLogin\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open application url
		driver.get("https://livestocklog-frontend-stg.herokuapp.com/");
		//to maximize browser
		driver.manage().window().maximize();
		//to manage timeouts
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to click  on create account
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[1]/a[2]")).click();
		//to enter firstname
		driver.findElement(By.name("first_name")).click();
		driver.findElement(By.name("first_name")).sendKeys("Bolu");
		//to enter lastname
		driver.findElement(By.name("last_name")).click();
		driver.findElement(By.name("last_name")).sendKeys("Bayo");
		//enter email
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("sleaudni@gmail.com");
		//click on next
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/form/div[4]/button")).click();
		//enter farm name
		driver.findElement(By.id("farm_name")).click();
		driver.findElement(By.id("farm_name")).sendKeys("BB Farms");
		//enter herd name
		driver.findElement(By.id("herd_name")).click();
		driver.findElement(By.id("herd_name")).sendKeys("BB GOATS");
		//select specie dropdown
		Select dropdown = new Select(driver.findElement(By.id("specie")));  
		dropdown.selectByVisibleText("Goats"); 
		//to click next
		
		
		
		
		
		
		
	}
}
