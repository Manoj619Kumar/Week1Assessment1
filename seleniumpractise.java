package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumpractise {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement CRMSFALink = driver.findElement(By.linkText("CRM/SFA"));
		CRMSFALink.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Siemens");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manoj");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("mano");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("My First Coding");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mass");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("250000");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am in the Paradise");
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("100");

	}

}
