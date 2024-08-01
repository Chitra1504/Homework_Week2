package week2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("TestLeaf");
		driver.findElement(By.name("lastname")).sendKeys("Shan");
		driver.findElement(By.name("reg_email__")).sendKeys("tl23@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tl23@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc@123");
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		Select dayop=new Select(day);
		dayop.selectByValue("9");
		Select monthop=new Select(month);
		monthop.selectByVisibleText("Apr");
		Select yearop=new Select(year);
		yearop.selectByValue("2000");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.close();
	}

}
