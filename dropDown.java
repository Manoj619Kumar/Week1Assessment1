package week2.day2;

import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropDown = driver.findElement(By.id("dropdown1"));
		Select drop = new Select(dropDown);
		drop.selectByVisibleText("UFT/QTP");
		WebElement findElement = driver.findElement(By.name("dropdown2"));
		Select drop1 = new Select(findElement);
		drop1.selectByVisibleText("Selenium");
		WebElement findElement2 = driver.findElement(By.id("dropdown3"));
		Select drop2 = new Select(findElement2);
		drop2.selectByVisibleText("Loadrunner");

	}

}
