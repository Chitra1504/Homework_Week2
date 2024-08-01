package week2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
		String message=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(message.equals("Checked"))
			System.out.println("Expected Message");
		else
			System.out.println("Message is not expected");
		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div")).click();
		WebElement triState=driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]"));
		triState.click();
		String state=driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p")).getText();
		if(state.equals("State = 1"))
			System.out.println("Tri State is Chosen");
		else
			System.out.println("Tri State is not chosen");

		WebElement toogle=driver.findElement(By.className("ui-toggleswitch-slider"));
		toogle.click();
		String message1=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(message1.equals("Checked"))
			System.out.println("Expected Message");
		else
			System.out.println("Message is not expected");
		WebElement dsCheck=driver.findElement(By.xpath("//div[contains(@class,'ui-state-disabled')]"));
		if(dsCheck.isSelected())
			System.out.println("Checkbox is not disabled");
		else
			System.out.println("Checkbox is disabled");
		driver.findElement(By.xpath("//*[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='London']/label")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Paris']/label")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Amsterdam']/label")).click();
		String city1=driver.findElement(By.xpath("//li[@data-item-value='London']/div/div[2]")).getAttribute("class");
		String city2=driver.findElement(By.xpath("//li[@data-item-value='Paris']/div/div[2]")).getAttribute("class");
		String city3=driver.findElement(By.xpath("//li[@data-item-value='Amsterdam']/div/div[2]")).getAttribute("class");
		String expected="ui-state-active";
		if(city1.contains(expected)&city2.contains(expected)&city3.contains(expected))
			System.out.println("The cities are selected as expected");
		else
			System.out.println("The cities are not getting selected");
		driver.close();
	}

}
