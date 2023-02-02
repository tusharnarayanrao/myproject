package multiplication_without_using_operator;
//Write a script to Handle Date on a web page i.e. select 12 December 2018 from calendar

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDate12Dec2018 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\all selenium setup files\\chromedriver_win32 (3)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true)
		{
		String s=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println("Current Title is:"+s);
		if(!s.equalsIgnoreCase("December 2018"))
		{
		driver.findElement(By.xpath("//a[@title='Prev']")).click();
		}
		 else
		 {
		break;
		 }
		}
		int date=12;
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td//a[text()='"+date+"']")).click();
		//driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td//a[text()='12']")).click();
}
}
