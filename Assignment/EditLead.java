package week2.Day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		    
		
			//http://leaftaps.com/opentaps/control/main
			
			// 1.Launch the browser
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			// 2.Enter the username
			WebElement userNameTextBox = driver.findElement(By.id("username"));
		    userNameTextBox.sendKeys("demosalesManager");
		    
			// 3.Enter the password
		    WebElement passwordTextBox = driver.findElement(By.id("password"));
			passwordTextBox.sendKeys("crmsfa");
			
			//4.Click Login
			WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
			loginButton.click();
			
			//5.Click crm/sfa link
			WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
			linkText.click();
			
		    //6.Click Leads link
			WebElement leadsButton = driver.findElement(By.linkText("Leads"));
			leadsButton.click();
			
			//7.Click Find leads
			WebElement clickFindLeads = driver.findElement(By.linkText("Find Leads"));
			clickFindLeads.click();
			
			//8.Enter first name
			WebElement firstNameField = driver.findElement(By.xpath("(//div[@class='x-form-element']/child::input[@name='firstName'])[3]"));
			firstNameField.sendKeys("Priyadharshini");
			
			//9.Click Find leads button
			WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
			findLeadsButton.click();
			Thread.sleep(3000);
			
			//10.Click on first resulting lead
			WebElement clickFirstResultingLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a[@class='linktext'])[1]"));
			clickFirstResultingLead.click();
					
			//11.Verify title of the page
			String title = driver.getTitle();
			System.out.println("Title of the page is "+title);
			
			//12.Click Edit
			WebElement clickEdit = driver.findElement(By.xpath("//a[text()='Edit']"));
			clickEdit.click();
			
			//13.Change the company name
			WebElement updateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
			updateCompanyName.clear();
			updateCompanyName.sendKeys("Test_Leaf");
			
			//14.Click Update
			WebElement clickUpdateButton = driver.findElement(By.xpath("//input[@type='submit']"));
			clickUpdateButton.click();
			
			//15.Confirm the changed name appears
			WebElement confirmChanges = driver.findElement(By.id("viewLead_companyName_sp"));
			String updatedCompanyName = confirmChanges.getText();
			System.out.println("Updated Company Name "+updatedCompanyName);
			
			//16.Close the browser (Do not log out)
			driver.close();

	}
	
}	
