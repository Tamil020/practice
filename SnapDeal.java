package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement men = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions build=new Actions(driver);
		build.moveToElement(men).perform();
		driver.findElement(By.xpath("//span[@class='linkTest'][1]")).click();
		String shoes=driver.findElement(By.xpath("//span[contains(text(),'Items')]")).getText();
		System.out.println("shoes count:"+shoes);
		string title2=driver.getTitle();
		system.out.println(title2);
	}

}
