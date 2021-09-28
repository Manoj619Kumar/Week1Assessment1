package week4day1;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3SchoolHomework {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		WebElement okie = driver.findElement(By.xpath("//button[text()='Try it']"));
		okie.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if (text.contains("You pressed OK!")) {
			System.out.println("You have pressed Ok");
		} else

			System.out.println("You Pressed Cancel");

	}

}
