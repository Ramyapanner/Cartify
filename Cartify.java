package roughWorking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cartify {

	public static void main(String[] args) {

		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cartify.pk/");
		
		driver.findElement(By.xpath("//span[text()='Shop By Categories']")).click();
		driver.findElement(By.xpath("//div[contains (@class,'collection-grid-item__title h3')] [3]")).click();
		WebElement element = driver.findElement(By.xpath("//a[@class='grid-view-item__link grid-view-item__image-container full-width-link']"));
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//button[@name='add']")).click();
		driver.findElement(By.xpath("//a[@class='cart-popup__cta-link btn btn--secondary-accent']")).click();
		String text = driver.findElement(By.xpath("//span[text()='Rs.10,500.00 PKR']")).getText();
		System.out.println(text);
		
		
		
		
		
		
		driver.quit();
		
		
	
	
		
	
	}

}
