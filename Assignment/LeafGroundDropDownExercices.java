package week2.Day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDownExercices 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open URL
		driver.get("https://www.leafground.com/select.xhtml");
		
		//Which is your favorite UI Automation tool?
		WebElement selectFavorite = driver.findElement(By.xpath("//div[@class='grid formgrid']//select"));
		Select selectTool = new Select(selectFavorite);
		selectTool.selectByIndex(1);
		Thread.sleep(1000);
		
		//Choose your preferred country
		
		WebElement selectCountryDropdown = driver.findElement(By.xpath("//label[text()='Select Country']"));
		selectCountryDropdown.click();
		WebElement selectIndia = driver.findElement(By.xpath("//li[text()='India']")); 
		selectIndia.click();
		Thread.sleep(2000);
		 	 
		
		//Confirm Cities belongs to Country is loaded
		
		WebElement selectCity = driver.findElement(By.xpath("//label[text()='Select City']"));
		selectCity.click();
		Thread.sleep(2000);
		
		WebElement selectCountryDropdown_ = driver.findElement(By.xpath("//label[text()='India']"));
		selectCountryDropdown_.click();
		Thread.sleep(2000);
		
		WebElement selectUSA = driver.findElement(By.xpath("//li[text()='India']/following-sibling::li[text()='USA']"));
		selectUSA.click();
		Thread.sleep(2000);
		

		WebElement selectCity_ = driver.findElement(By.xpath("//label[text()='Select City']"));
		selectCity_.click();
		Thread.sleep(2000);
		
		//Choose the Course
		WebElement chooseCourse = driver.findElement(By.xpath("//div[@class='card']//button"));
		chooseCourse.click();
		
		WebElement chooseSeleniumWebDriver = driver.findElement(By.xpath("//li[text()='Selenium WebDriver']"));
		chooseSeleniumWebDriver.click();
		
		WebElement chooseCourse_ = driver.findElement(By.xpath("//div[@class='card']//button"));
		chooseCourse_.click();
		Thread.sleep(2000);
		
		WebElement chooseAppium = driver.findElement(By.xpath("//li[text()='AWS']/following-sibling::li"));
		chooseAppium.click();
		
		//Select Language
		
		WebElement selectLanguage = driver.findElement(By.xpath(("//label[text()='Select Language']")));
		selectLanguage.click();
		
		WebElement selectEnglish = driver.findElement(By.xpath("//li[text()='English']"));
		selectEnglish.click();
		Thread.sleep(2000);

		//Select Values
		WebElement selectValues = driver.findElement(By.xpath("//label[text()='Select Values']/following-sibling::div"));
		selectValues.click();
		
		WebElement selectTwo = driver.findElement(By.xpath("//li[text()='Two']"));
		selectTwo.click();

	}

}
