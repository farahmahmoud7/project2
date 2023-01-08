package aut;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XYZ {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver ;
		driver= new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("farah");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("aljazarah");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("777");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
	Thread.sleep(3000);
driver.switchTo().alert().accept();
driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).sendKeys("farah");
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();

	}

}
