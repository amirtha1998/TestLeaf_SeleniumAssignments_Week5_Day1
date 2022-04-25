package week5.day1.assignment2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads extends BaseClass {

	@Test(priority = 1)
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amirthavalli");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.name("submitButton")).click();

	}
	
	@Test(enabled = false, priority  = 3)
	public void CreateContact() {

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();

		// 6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();

		// 7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Amirthavalli");

		// 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("S");

		// 9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Amirtha");

		// 10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Amirtha");

		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Testing");

		// 12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createContactForm_description")).sendKeys("Selenium Mar 19 Batch");

		// 13. Enter your email in the E-mail address Field using the locator of your
		// choice

		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("amirtha@gmail.com");

		// 14. Select State/Province as NewYork Using Visible Text
		WebElement eleSource = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleSource);
		dd.selectByVisibleText("New York");

		// 15. Click on Create Contact
		driver.findElement(By.name("submitButton")).click();

		// 16. Click on edit button
		driver.findElement(By.linkText("Edit")).click();

		// 17. Clear the Description Field using .clear

		driver.findElement(By.id("updateContactForm_description")).clear();

		// 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Selenium Training");

		// 19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		// 20. Get the Title of Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);

	}

	@Test(invocationCount = 2 , priority = 4)
	public void DuplicateLead() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amirthavalli");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Amirthavalli");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Testing March Batch");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("amirtha98@gmail.com");
		WebElement eleSource = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleSource);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amirtha");
		driver.findElement(By.className("smallSubmit")).click();
		String result = driver.getTitle();
		System.out.println(result);

	}
	
	@Test(enabled = false, priority = 2)
	public void EditLead() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amirthavalli");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Amirthavalli");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Testing March Batch");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("amirtha98@gmail.com");
		WebElement eleSource = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleSource);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium Mar 19 Batch");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 5)
	public void MergeContact() throws InterruptedException {
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();

		// 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
		// 7. Click on Widget of From Contact
		driver.findElement(By.xpath("//a/img[@Alt='Lookup']")).click();
		// 8. Click on First Resulting Contact
		Set<String> allHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(allHandles);

		driver.switchTo().window(listHandles.get(1));

		driver.findElement(By.xpath("//div[@Class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().window(listHandles.get(0));

		// 9. Click on Widget of To Contact
		driver.findElement(By.xpath("//table[@Widgetid='ComboBox_partyIdTo']/following-sibling::a")).click();

		// 10. Click on Second Resulting Contact

		Set<String> allHandle = driver.getWindowHandles();
		List<String> listHandle = new ArrayList<String>(allHandle);

		driver.switchTo().window(listHandle.get(1));
		driver.findElement(By.xpath("//div[@Class='x-grid3-row    x-grid3-row-alt']//a")).click();

		driver.switchTo().window(listHandle.get(0));
		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@Class='buttonDangerous']")).click();
		Thread.sleep(1000);
		// 12. Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// 13. Verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
	}
}
