package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver drive=new ChromeDriver();
	drive.get("https://www.nykaa.com/");
    drive.manage().window().maximize();
    drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement brands = drive.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
    Actions builder=new Actions(drive);
    builder.moveToElement(brands).perform();
    drive.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris\r\n");
    drive.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[1]")).click();
    String text1="Buy L'Oreal Paris products online at best price on Nykaa | Nykaa";
    String text2=drive.getTitle();
    { 
    	if(text1.equals(text2))
    		System.out.println("true");
    	else
    	{
    		System.out.println("false");
    		
    	}
    	
    }
}

}
