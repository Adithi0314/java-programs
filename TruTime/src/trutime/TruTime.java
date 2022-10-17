package trutime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class TruTime {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2095765\\OneDrive - Cognizant\\Desktop\\workspace\\TruTime\\driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
				
				//launching website
				driver.get("https://onecognizant.cognizant.com/Home?GlobalAppId=2185#.");
				
				Thread.sleep(3000);
	
				
				// maximizing window
				driver.manage().window().maximize();
				
				//enter email id
				driver.findElement(By.id("i0116")).sendKeys("2095765@cognizant.com");
				Thread.sleep(3000);
				
				//click on next
				driver.findElement(By.id("idSIButton9")).click();
				Thread.sleep(3000);
				
				//enter password
				driver.findElement(By.id("i0118")).sendKeys("Adi1109*");
				Thread.sleep(3000);
				
				//click on SignIn
				driver.findElement(By.id("idSIButton9")).submit();
				Thread.sleep(3000);
				
				//Select text
				driver.findElement(By.xpath("//div[@class='table-cell text-left content']/div")).click();
				Thread.sleep(5000);
				
				//click on verify
				driver.findElement(By.id("idSubmit_SAOTCC_Continue")).click();
	            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

				//click on yes 
	            driver.findElement(By.id("idSIButton9")).click();
	            Thread.sleep(5000);

				
				//Scroll down till the bottom of the page
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				
				// switching frames
				driver.switchTo().frame("//iframe[@id='appFrame']");
				
				//click on apply topup
				driver.findElement(By.xpath("applyTopupPlus")).click();
				 Thread.sleep(5000);
				//from time
				driver.findElement(By.xpath("//*[@id=\"input_1\"]/div[1]/input")).sendKeys("09:00AM");
	           Thread.sleep(5000);

	           //totime
	        driver.findElement(By.xpath("//*[@id=\"input_1\"]/div[2]/input")).sendKeys("07:00PM");
	        Thread.sleep(5000);

	        //click on submit
	        driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[5]/div[1]/div[4]/button[1]")).click();
	        Thread.sleep(5000);

		        
		    	//closing web driver
		        driver.close();
				
	}

}
