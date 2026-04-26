import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondtest {
	
	WebDriver driver = new EdgeDriver();
	Random Rand = new Random();

	
	@BeforeTest
	public void mysetup() {
		driver.get("https://codenboxautomationlab.com/practice/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void autocompleteInputfield() throws InterruptedException {
		
		WebElement autocompleteInputfield = driver.findElement(By.id("autocomplete"));
		String[] countris = {"jo","sy","ja"};
		
		int indexcoun = Rand.nextInt(countris.length);
		autocompleteInputfield.sendKeys(countris[indexcoun]);
		Thread.sleep(1000);
		autocompleteInputfield.sendKeys(Keys.chord(Keys.ARROW_DOWN , Keys.ENTER));
	}
	
	@Test(priority = 2)
	public void Dropdown() {
		
		WebElement Thselector = driver.findElement(By.id("dropdown-class-example"));
		Select myselect = new Select(Thselector);
		
		//myselect.selectByVisibleText("Selenium");
		//myselect.selectByIndex(2);
		myselect.selectByValue("option3");
		
	}
	
	@Test(priority = 3)
	public void checkbox() {
		WebElement Divcheckbox = driver.findElement(By.id("checkbox-example"));
		List<WebElement> allcheckboxs = Divcheckbox.findElements(By.tagName("input"));
		//int randomindex = Rand.nextInt(allcheckboxs.size());
		//allcheckboxs.get(randomindex).click();
		for(int i=0 ; i< allcheckboxs.size() ; i++ ) {
			
			allcheckboxs.get(i).click();

		}
		
	}

}



























