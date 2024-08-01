package week2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']/parent::button")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		WebElement disableButton=driver.findElement(By.xpath("//span[text()='Disabled']/parent::button"));
		if(disableButton.isEnabled())
			System.out.println("The button is not disabled");
		else
			System.out.println("The button is disabled");
		WebElement positionButton=driver.findElement(By.xpath("//span[text()='Submit']/parent::button"));
		System.out.println("The position of the button is "+positionButton.getLocation());
		WebElement colorButton=driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
		System.out.println("The color of the button is "+colorButton.getCssValue("background-color"));
		WebElement sizeButton=driver.findElement(By.xpath("(//span[text()='Submit'])[2]/parent::button"));
		Dimension dimension=sizeButton.getSize();
		System.out.println("The height of the button is "+dimension.height+" and the width of the button is "+dimension.width);
		driver.close();
		
	}

}
