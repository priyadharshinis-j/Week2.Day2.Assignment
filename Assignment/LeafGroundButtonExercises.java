package week2.Day2.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButtonExercises 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Open the URL
		driver.get("https://www.leafground.com/button.xhtml");
		
		//Click and Confirm Title
		WebElement clickButton = driver.findElement(By.xpath("//span[text()='Click']"));
		clickButton.click();
		String Title = driver.getTitle();
		System.out.println("Title of the page to confirm "+Title);
		
		//Navigate Window
		driver.navigate().back();
		
		//Confirm if the button is disabled
		WebElement disabledButton = driver.findElement(By.xpath("//h5[contains(text(),'button is disabled')]/following-sibling::button"));
		boolean isEnabled = disabledButton.isEnabled();
		System.out.println("Confirmation message to check whether the button is Enabled :---> "+isEnabled);
		
		//Find the Position of the Button
		WebElement findPositionOfButton = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following-sibling::button"));
		int xPositionOfButton = findPositionOfButton.getLocation().getX();
		int yPositionOfButton = findPositionOfButton.getLocation().getY();
		
		System.out.println("X position of the button is "+xPositionOfButton);
		System.out.println("Y position of the button is "+yPositionOfButton);
		
		//Find the color of the save button
		WebElement findTheColorOfButton = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button"));
		String colorOfTheButton =  findTheColorOfButton.getCssValue("background-color");
		System.out.println("Color of the save button is --->" +colorOfTheButton);
		
		
		//Find the Height and Width of the button
		WebElement findHeightWidth = driver.findElement(By.xpath("//h5[contains(text(),'Find the height')]/following-sibling::button"));
		int heightOfTheButton = findHeightWidth.getSize().getHeight();
		int widthOfTheButton = findHeightWidth.getSize().getWidth();
		
		System.out.println("Height of the Button is ---> "+heightOfTheButton);
		System.out.println("Width of the Button is ---> "+widthOfTheButton);
		
		//Mouse over and confirm the color changed
		WebElement confirmColorChange = driver.findElement(By.xpath("//h5[contains(text(),'color changed')]/following-sibling::button"));
		String beforeColor = confirmColorChange.getCssValue("background-color");
		System.out.println("Before Mouse Hover Color of the Button ---> "+beforeColor);
		
		//Performing MouseHover
		Actions action =new Actions(driver);
		action.moveToElement(confirmColorChange).perform();
		
		//Finding color of the button when performing MouseHover
		WebElement confirmColorChanging = driver.findElement(By.xpath("//h5[contains(text(),'color changed')]/following-sibling::button"));
		String changedColor = confirmColorChanging.getCssValue("background-color");
		System.out.println("After Mouse Hover Color of the Button ---> " +changedColor);
		
		//Click Image Button and Click on any hidden button
		WebElement imageButton = driver.findElement(By.xpath("//span[text()='Image']/parent::button"));
		imageButton.click();
		
		WebElement hiddenImage = driver.findElement(By.xpath("//div[contains(@class,'overlaypanel')]/child::img"));
		hiddenImage.click();
		Thread.sleep(2000);
		
		WebElement image_Button = driver.findElement(By.xpath("//span[text()='Image']/parent::button"));
		image_Button.click();
		
		//How many rounded Buttons are there?
		List<WebElement> roundedButtons = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following-sibling::button"));
		System.out.println("Count of the Buttons ---> " +roundedButtons.size());

		
	}

}
