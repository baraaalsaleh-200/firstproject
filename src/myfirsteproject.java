

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myfirsteproject {
	WebDriver driver = new EdgeDriver();
	
	String url = "https://www.saucedemo.com"; 
	
	String UserName = "standard_user";
	String Password = "secret_sauce";


	@BeforeTest
	
	public void mysetup () {
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(priority = 1)
	public void mytest () throws InterruptedException {
	WebElement UsernmeInput =  driver.findElement(By.id("user-name"));
	WebElement passwordInput = driver.findElement(By.id("password"));
	WebElement LoginButton =  driver.findElement(By.id("login-button"));
	UsernmeInput.sendKeys(UserName);
	passwordInput.sendKeys(Password);
	LoginButton.click();
		
	}
	
	@Test (priority = 2, enabled = false)
	public void additem() {
	WebElement addpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	addpack.click();
	}
	
	@Test(priority = 3, enabled = false)
	public void removeitem() {
	WebElement removepack = driver.findElement(By.id("remove-sauce-labs-backpack"));
	removepack.click();
	}
	
	@Test (priority = 4, enabled = false)
	
	public void logout() throws InterruptedException {
	WebElement burgermenu = driver.findElement(By.id("react-burger-menu-btn"));
	burgermenu.click();
		Thread.sleep(2000);
	WebElement logout =	driver.findElement(By.id("logout_sidebar_link"));
	logout.click();
	}
	
	@Test (priority = 5, enabled = false)
	
	public void logo() {
		WebElement printlogo = driver.findElement(By.className("login_logo"));
		System.out.println(printlogo.getText());
	}
	
	@Test (priority = 6)
	public void addallitem() {
		
		List <WebElement> Addallitems = driver.findElements(By.className("btn"));
		for(int i= 0; i<Addallitems.size();i++) {
			Addallitems.get(i).click();}
	}
	
	@Test(priority = 7)
	public void removeallitems() throws InterruptedException {
		List <WebElement> removeallitems = driver.findElements(By.className("btn_secondary"));
		for(int i= 0; i<removeallitems.size();i++) {
			removeallitems.get(i).click();
			}
		
	}
	
//	@Test(priority = 8)
//	public void printchar() {
//		List <WebElement> printallchars = driver.findElements(By.className("inventory_item_name"));
//		for(int i=0 ; i<printallchars.size();i++) {
//			String name = printallchars.get(i).getText();
//			//char fistchar = name.charAt(0);
//			System.out.println(name.charAt(0));}
//		
//	}
//	
//	@Test (priority = 9)
//	public void printname() {
//		
//		List <WebElement> printnamea = driver.findElements(By.className("inventory_item_name"));
//		
//		for(int i=0 ; i<printnamea.size();i++) {
//			
//			if(printnamea.get(i).getText().equals("Sauce Labs Fleece Jacket")) {
//				
//				break;
//			}
//			System.out.println(printnamea.get(i).getText());
//		}}
		
		@Test(priority = 10)
		
		public void printlastname() {
			List <WebElement> printlastnamea = driver.findElements(By.className("inventory_item_name"));
			for(int i=0; i<printlastnamea.size();i++) {
				
				String names = printlastnamea.get(i).getText();
				if(names.endsWith("t")) {
					
					continue;
				}
				System.out.println(printlastnamea.get(i).getText());
				
			}
		}
	@AfterTest
	public void myaftertest () {}
	
}
