package week3day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		checkBox.click();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		WebElement from = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		from.sendKeys("Chennai Egmore");
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		WebElement to = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		to.sendKeys("Madurai Jn");
		List<WebElement> trainNumbers = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		int size = trainNumbers.size();
		System.out.println("No of trains is:" + size);
		for (int i = 0; i < size; i++) {
			String trainNum = trainNumbers.get(i).getText();
			System.out.println(trainNum);
			//using foreach
			for (WebElement webElement : trainNumbers) {
				System.out.println(webElement.getText());
			}
		}
	}

}
