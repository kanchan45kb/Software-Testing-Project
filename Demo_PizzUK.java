package demoWebsite;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_PizzUK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Desktop\\\\Selenium Jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		Thread.sleep(1000); // add some delay
		w.get("https://www.pizzahut.co.uk/");
	    w.manage().window().maximize();
	  /*  Alert A = w.switchTo().alert();
	    A.accept();*/
	w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
	  //  w.manage().getCookies();
	    JavascriptExecutor jp =(JavascriptExecutor) w;
		w.manage().window();
		jp.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(3000);
		
		WebElement Find_Resaturant = w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[7]/a[1]/div[1]/div[1]/div[1]/button[1]"));
		Find_Resaturant.click();
		Thread.sleep(2000);
		
        Set<String> windows = w.getWindowHandles();
		Iterator <String> it = windows.iterator();
		String parent_windows =it.next();
		String child_windows1=it.next();
		w.switchTo().window(child_windows1);
		w.findElement(By.xpath("/html/body/form/div[2]/header/aside/div/div[2]/a[1]")).click();
		WebElement Location = w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"));
	    Location.submit();
		//Location.sendKeys("Amesbury,Wiltshire");
	  //  Location.click();
		//Select s1 = new Select(w.findElement(By.xpath("//body/form[@id='frm']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")));
		//s1.selectByValue("Amesbury, Wiltshire");*/
	   

	}

}
