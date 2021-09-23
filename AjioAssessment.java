package week3day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioAssessment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		WebElement enter = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		enter.click();
		enter.sendKeys("Bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		WebElement mensBags = driver.findElement(By.xpath("//div[@id='products']"));
		ArrayList<String> mensBag = new ArrayList<String>();
		Dimension size = mensBags.getSize();
		System.out.println(size);
		Set<String> bags = new LinkedHashSet<String>();
		System.out.println(bags);
		
			
		}
			
			
		}
		



