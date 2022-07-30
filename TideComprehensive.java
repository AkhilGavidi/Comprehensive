package Mindtree.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TideComprehensive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://tide.com/en-us");
	//	 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
	//	 driver.manage().window().fullscreen();
		
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\'lilo3746-wrapper\']/div/a")).click();
		  Actions action = new Actions(driver); 
	 		WebElement webdriver = driver.findElement(By.linkText("Shop Products"));
	 		action.moveToElement(webdriver).build().perform();
	 		Thread.sleep(2000);
	 		driver.findElement(By.linkText("Stain Removal")).click();
	 		Thread.sleep(2000);
	 		driver.findElement(By.className("ps-button-label")).click();
		// driver.findElement(By.xpath("//*[@id=\'ember14\']/button/div[2]/p")).click();
		// driver.findElement(By.linkText("Tough stains")).click();
     //     driver.findElement(By.xpath("//div[@class='content content-yg1lCeGi']")).click();

	}

}
