package week2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//*[@id='createLeadForm_companyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//*[@id='createLeadForm_firstName']")).sendKeys("Mithra");
		driver.findElement(By.xpath("//*[@id='createLeadForm_lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//*[@id='createLeadForm_firstNameLocal']")).sendKeys("Mithu");
		driver.findElement(By.name("departmentName")).sendKeys("Audit");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead in TCS");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mk650@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state1=new Select(state);
		state1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//*[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Imp Note");
		driver.findElement(By.xpath("//*[@value='Update']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
