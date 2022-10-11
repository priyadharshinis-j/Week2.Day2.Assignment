package week2.Day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBoxExercises
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		//Basic CheckBox
		WebElement basicCheckBox = driver.findElement(By.xpath("//div[contains(@class,'ui-state-default')]/following-sibling::span[text()='Basic']"));
		basicCheckBox.click();
		
		//Notification CheckBox
		WebElement notificationCheckBox = driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[contains(@class,'state-default')]"));
		notificationCheckBox.click();
		Thread.sleep(2000);
		
		//Choose favorite languages
		WebElement selectJava = driver.findElement(By.xpath("//label[text()='Java']"));
		selectJava.click();
		
		WebElement selectPython = driver.findElement(By.xpath("//label[text()='Python']"));
		selectPython.click();
		
		
		//Tri State CheckBox
		WebElement triStateCheckBox = driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]//div[2]"));
		triStateCheckBox.click();
		Thread.sleep(2000);
		
		WebElement triStateCheckBox_ = driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]//div[2]"));
		triStateCheckBox_.click();
		Thread.sleep(2000);

		
		WebElement triStateCheckBox_1 = driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]//div[2]"));
		triStateCheckBox_1.click();
		Thread.sleep(2000);

		
		//Toggle Switch
		WebElement toggleSwitch = driver.findElement(By.xpath("//div[contains(@class,'slider')]"));
		toggleSwitch.click();
		
		//verify if checkbox is disabled
		WebElement disabledCheckBox = driver.findElement(By.xpath("//div[contains(@class,'ui-state-disabled')]"));
		boolean result = disabledCheckBox.isSelected();
		
		if(result) 
		{ 
			System.out.println("The checkbox is Enabled"); 
		} 
		else 
		{
		  System.out.println("The checkbox is disabled"); 
		}
		Thread.sleep(2000);
		
		//Select Multiple
		WebElement multipleCheckBox = driver.findElement(By.xpath("//label[text()='Amsterdam']/following::span"));
		multipleCheckBox.click();
		Thread.sleep(2000);
		
		WebElement selectLondon = driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div"));
		selectLondon.click();
		Thread.sleep(2000);
		
		WebElement selectRome = driver.findElement(By.xpath("//label[text()='Rome']/preceding-sibling::div"));
		selectRome.click();
		Thread.sleep(2000);
		
		WebElement selectBerlin = driver.findElement(By.xpath("//label[text()='Berlin']/preceding-sibling::div"));
		selectBerlin.click();
		Thread.sleep(2000);

		WebElement clickClose = driver.findElement(By.xpath("//span[contains(@class,'circle-close')]/parent::a"));
		clickClose.click();
		 
	}

}
