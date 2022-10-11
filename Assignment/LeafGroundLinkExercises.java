package week2.Day2.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLinkExercises 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open the URL
		driver.get("https://www.leafground.com/link.xhtml");
		
		//Take me to Dashboard
		WebElement gotoDashboard = driver.findElement(By.linkText("Go to Dashboard"));
		gotoDashboard.click();
		driver.navigate().back();
		
		//Find my Destination
		WebElement gotoPage = driver.findElement(By.linkText("Find the URL without clicking me."));
		String gotoPagehref = gotoPage.getAttribute("href");
		System.out.println("If click on Link it will naviagte to the page ---->> "+gotoPagehref);
		
		//Am I Broken Link?
		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		String linkTitle = driver.getTitle();
		System.out.println(" ");
		if(linkTitle.contains("404"));
		System.out.println("The link is Broken Link");
		driver.navigate().back();
		Thread.sleep(2000); 
		
		//Duplicate Link
		List <WebElement> duplicateLink = driver.findElements(By.xpath("//div[@class='layout-main-content']//a[text()='Go to Dashboard']"));
		int countOfDuplicateLink = duplicateLink.size();
		System.out.println(" ");
		System.out.println("Count of Go to DashBoard Link ---->"+countOfDuplicateLink);
		System.out.println(" ");
		if(countOfDuplicateLink>1)
		{
			System.out.println("The Link is Duplicate Link");
		}
		
		//Count Links
		List <WebElement> countLinks = driver.findElements(By.tagName("a"));
		int linkCount = countLinks.size();
		System.out.println(" ");
		System.out.println("The number of links in this page is ---> "+linkCount);
		
		//Count Layout Links
		List <WebElement> countLayoutLinks = driver.findElements(By.xpath("//div[@class='layout-main-content']//a"));
		int layoutLinksCount = countLayoutLinks.size();
		System.out.println(" ");
		System.out.println("The number of links in the layout is ----> "+layoutLinksCount);
		
		
		
	}

}
