package week2.Day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0
public class LeafGroundInputPractices {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open Url
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");

		// Type your Name
		WebElement inputName = driver
				.findElement(By.xpath("(//h5[text()='Type your name']/following-sibling::div)//input"));
		inputName.sendKeys("Priyadharshini");

		// Append Country to this City.
		WebElement inputAppendCountry = driver
				.findElement(By.xpath("(//h5[text()='Append Country to this City.']/following-sibling::div)//input"));
		inputAppendCountry.sendKeys(" India");

		// Verify if text box is disabled
		WebElement checkTextBoxDisabled = driver
				.findElement(By.xpath("(//h5[text()='Verify if text box is disabled']/following-sibling::div)//input"));
		boolean checkDisabled = checkTextBoxDisabled.isDisplayed();

		if (checkDisabled) {
			System.out.println("The TextBox is disabled");
		} else {
			System.out.println("The TextBox is enabled");
		}

		// Clear the typed text.
		WebElement clearTextBox = driver
				.findElement(By.xpath("(//h5[text()='Clear the typed text.']/following-sibling::div)//input"));
		clearTextBox.clear();

		// Retrieve the typed text.
		WebElement retrieveTextBox = driver
				.findElement(By.xpath("(//h5[text()='Retrieve the typed text.']/following-sibling::div)//input"));
		String retrievedText = retrieveTextBox.getAttribute("value");
		System.out.println("The retrieved Text is --->  " + retrievedText);

		// Type email and Tab. Confirm control moved to next element.
		WebElement typeEmail = driver
				.findElement(By.xpath("(//h5[contains(text(),'Type email and Tab.')]/following-sibling::div)//input"));
		typeEmail.sendKeys("priyadharshini.ceg@gmail.com");
		typeEmail.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		WebElement typeYourself = driver
				.findElement(By.xpath("(//h5[text()='Type about yourself']/following-sibling::div)//textarea"));
		typeYourself.sendKeys("Selenium Automation Learner");

		// Text Editor
		WebElement textEditor = driver.findElement(By.xpath("//div[contains(@class,'ql-editor')]"));
		textEditor.sendKeys("TestLeaf Learner");
		textEditor.sendKeys(Keys.ENTER);
		textEditor.sendKeys("Selenium Automtion Tool");
		Thread.sleep(2000);

		textEditor.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_UP));
		textEditor.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_UP));
		Thread.sleep(2000);

		WebElement boldText = driver
				.findElement(By.xpath("//span[contains(@class,'ql-formats')]/button[contains(@class,'bold')]"));
		boldText.click();
		Thread.sleep(2000);

		WebElement italicText = driver
				.findElement(By.xpath("//span[contains(@class,'ql-formats')]/button[contains(@class,'italic')]"));
		italicText.click();
		Thread.sleep(2000);

		WebElement underLineText = driver
				.findElement(By.xpath("//span[contains(@class,'ql-formats')]/button[contains(@class,'underline')]"));
		underLineText.click();
		Thread.sleep(2000);

		WebElement numberList = driver
				.findElement(By.xpath("//span[contains(@class,'ql-formats')]/button[contains(@value,'ordered')]"));
		numberList.click();
		Thread.sleep(2000);

		WebElement bulletinList = driver
				.findElement(By.xpath("//span[contains(@class,'ql-formats')]/button[contains(@value,'bullet')]"));
		bulletinList.click();
		Thread.sleep(2000);

		WebElement h1Header = driver
				.findElement(By.xpath("//span[contains(@class,'ql-formats')]/button[contains(@class,'ql-header')]"));
		h1Header.click();
		Thread.sleep(2000);

		WebElement indentText = driver.findElement(
				By.xpath("(//span[contains(@class,'ql-formats')]/button[contains(@class,'ql-indent')])[2]"));
		indentText.click();
		Thread.sleep(1000);

		// Just Press Enter and confirm error message*
		WebElement pressEnter = driver.findElement(
				By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following-sibling::div)//input"));
		pressEnter.sendKeys(Keys.ENTER);

		// Click and Confirm Label Position Changes
		WebElement labelPosition = driver.findElement(
				By.xpath("(//h5[text()='Click and Confirm Label Position Changes']/following-sibling::span)//input"));
		labelPosition.click();

		// Type your name and choose the third option
		WebElement typeName = driver
				.findElement(By.xpath("(//h5[contains(text(),'choose the third option')]/following-sibling::div)/ul"));

		Actions actions = new Actions(driver);
		actions.moveToElement(typeName);
		actions.click();
		actions.sendKeys("Priyadharshini");
		actions.build().perform();
		Thread.sleep(2000);

		WebElement thirdOption = driver.findElement(By.xpath("/html/body/span/ul/li[3]"));
		thirdOption.click();

		// Type your DOB (mm/dd/yyyy) and confirm date chosen
		WebElement enterDOB = driver
				.findElement(By.xpath("(//h5[contains(text(),'confirm date chosen')]/following-sibling::span)/input"));
		enterDOB.sendKeys("22/11/1985");

		// Type number and spin to confirm value changed
		WebElement spinValue = driver
				.findElement(By.xpath("(//h5[contains(text(),'number and spin')]/following-sibling::span)/input"));
		spinValue.sendKeys("6");
		Thread.sleep(2000);

		WebElement upperSpinValue = driver.findElement(By.xpath(
				"(((//h5[contains(text(),'number and spin')]/following-sibling::span)/input)/following-sibling::a)/span"));
		upperSpinValue.click();
		Thread.sleep(2000);

		WebElement lowerSpinValue = driver.findElement(By.xpath(
				"(((//h5[contains(text(),'number and spin')]/following-sibling::span)/input)/following-sibling::a[2])/span"));
		lowerSpinValue.click();
		Thread.sleep(2000);

		// Type random number (1-100) and confirm slider moves correctly
		WebElement sliderMove = driver
				.findElement(By.xpath("//h5[contains(text(),'random number')]/following-sibling::input"));
		sliderMove.sendKeys("50");
		Thread.sleep(2000);

		// Click and Confirm Keyboard appears
		WebElement confirmKeyBoard = driver
				.findElement(By.xpath("//h5[contains(text(),'Keyboard appears')]/following-sibling::input"));
		confirmKeyBoard.click();

		// Custom Toolbar
		WebElement customToolBar = driver.findElement(By.xpath("(//div[contains(@class,'ql-editor')])[2]"));
		customToolBar.sendKeys("Welcome to Selenium Automation");
		Thread.sleep(1000);
		customToolBar.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_UP));
		Thread.sleep(1000);

		WebElement fontStyle = driver
				.findElement(By.xpath("(//span[@class='ql-formats']/span[@class='ql-font ql-picker'])[2]"));
		fontStyle.click();
		Thread.sleep(1000);

		WebElement sherifFontStyle = driver
				.findElement(By.xpath("(//span[@class='ql-picker-options']/span[@data-value='serif'])[2]"));
		sherifFontStyle.click();
		Thread.sleep(1000);

		WebElement fontSize = driver.findElement(By.xpath("(//span[@class='ql-size ql-picker'])[2]"));
		fontSize.click();
		Thread.sleep(1000);

		WebElement largeFontSize = driver
				.findElement(By.xpath("(//span[@class='ql-picker-options']/span[@data-value='large'])[2]"));
		largeFontSize.click();

	}

}
