package week2.homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::div")).click();
		WebElement selectCityButton=driver.findElement(By.xpath("//input[@value='Bengaluru']"));
		WebElement selectCity=driver.findElement(By.xpath("//input[@value='Bengaluru']/parent::div/following-sibling::div"));
		selectCity.click();
		if(selectCityButton.isSelected())
			System.out.println("The radio button is selected");
		selectCity.click();
		if(selectCityButton.isSelected()==false)
			System.out.println("The radio button is unselected");
		List<WebElement> browsers=driver.findElements(By.xpath("(//div[@class='card'])[3]//div[contains(@class,'ui-radiobutton ui-widget')]//input"));
		List<WebElement> browsersName=driver.findElements(By.xpath("((//div[@class='card'])[3]//label)"));
		for(int i=0;i<browsers.size();i++)
		{
			if(browsers.get(i).isSelected())
			{
				String browserDefault=browsersName.get(i).getText();
				System.out.println("The browser selected by default is "+browserDefault);
				break;
		}
		}
		WebElement ageGroup=driver.findElement(By.xpath("//input[@value='21-40 Years']"));
		if(ageGroup.isSelected()==false)
			ageGroup.click();
		driver.close();
	}

}
