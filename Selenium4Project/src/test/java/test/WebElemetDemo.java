package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElemetDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver = new ChromeDriver();
		/*
		 // find elements
		 
		 driver.get("https://google.com/");
		 
		 WebElement searchBox = driver.findElement(By.name("q"));
		 searchBox.sendKeys("selenium"+ Keys.ENTER);
		 //driver.findElement(By.name("btnk")).click();*/
		/*
		
		 // find elements
		 driver.get("https://trytestingthis.netlify.app/");
		// Get all the elements available with tag name 'select'
		 List<WebElement> elements = driver.findElements(By.tagName("select"));
		 for (WebElement element : elements) {
             System.out.println("Paragraph text:" + element.getText());
         }*/
		/*
		 // find element within element 
		 driver.get("http://www.google.com");
		 WebElement form = driver.findElement(By.tagName("form"));
		 form.findElement(By.name("q")).sendKeys("ABCD"+ Keys.ENTER);
		 */
		 
		 /*
		 // get active element 
		 driver.get("http://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("selenium");
		 String title = driver.switchTo().activeElement().getAttribute("title");
		 System.out.println(title);*/
		
		/*
		 // get tagname, text, css etc...
		 driver.get("http://www.google.com");
		 WebElement searchBox = driver.findElement(By.name("q"));
		 String tagName = searchBox.getTagName();
		 String text = searchBox.getText();
		 //font
		 String cssValue =searchBox.getCssValue("font");
		 System.out.println(tagName+" / "+text+" / "+cssValue);*/
	
	
		 //check element is enabled, is selected, etc ...
		 driver.get("https://the-internet.herokuapp.com/checkboxes");
		 //change 1 to 2
		 WebElement chekbox = driver.findElement(By.xpath("(//input[@type= 'checkbox'])[2]"));
		 System.out.println(chekbox.isEnabled());
		 System.out.println(chekbox.isSelected());

		 Thread.sleep(1000);
		 driver.quit();

	}

}
