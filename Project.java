package demoWebsite;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Desktop\\\\Selenium Jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		Thread.sleep(1000); // add some delay
		w.get("https://www.pizzahut.co.in/");
	    w.manage().window().maximize();  // maximize windows 
	   System.out.println(w.getTitle());  // Print Title of tab in console window		
		
    	w.findElement(By.xpath("//body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
		WebElement textbox = w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		textbox.sendKeys("123");
		textbox.sendKeys(Keys.ENTER);
		String s = textbox.findElement(By.xpath("//span[contains(text(),'No Hut found for that address. Please try again.')]")).getText();
		System.out.println(s);
		Thread.sleep(2000);
		
		w.navigate().refresh();
		JavascriptExecutor js =(JavascriptExecutor) w;
		js.executeScript("window.scrollBy(0,3000)", ""); //scroll down window to bottom of webpage
		Thread.sleep(2000);
		
		WebElement pizza = w.findElement(By.xpath("//body[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]/span[1]"));
		pizza.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js00 =(JavascriptExecutor) w;
		js00.executeScript("window.scrollBy(0,3500)", ""); //scroll down window to bottom of webpage
		Thread.sleep(2000);
		JavascriptExecutor js01 =(JavascriptExecutor) w;
		js01.executeScript("window.scrollBy(0,-4000)", ""); //scroll down window to up of webpage
		Thread.sleep(2000);
		
		WebElement Double_Paneer_Supreme = w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/ol[1]/li[4]/a[1]/div[2]/p[1]"));
		Double_Paneer_Supreme.click();                              
		System.out.println(w.findElement(By.xpath("//p[contains(text(),'Spiced Paneer, Herbed Onion & Green Capsicum, Red ')]")).getText());		
		//WebElement Pizza_ViewMore = w.findElement(By.xpath("//p[contains(text(),'View more')]"));
		//Pizza_ViewMore.click();
		Thread.sleep(2000);
		
		WebElement Side = w.findElement(By.xpath("//*[@id=\"__next\"]/section/nav/ol/li[2]/a"));
		Side.click();
		Thread.sleep(2000);		
		
		JavascriptExecutor jp =(JavascriptExecutor) w;
		w.manage().window();
		jp.executeScript("window.scrollBy(0,500)", "");
		
		WebElement Pottato_Paper = w.findElement(By.xpath("//h2[contains(text(),'Potato Poppers')]"));
		Pottato_Paper.click();
		WebElement Pottato = w.findElement(By.xpath("//p[contains(text(),'Potato Poppers')]"));
		String n = Pottato.getText();
		System.out.println(n);
		
		WebElement Give_FeedBack = w.findElement(By.xpath("//a[contains(text(),'Give Feedback')]"));
		Give_FeedBack.click();
		Thread.sleep(2000);
		String k = w.getTitle();
		System.out.println(k);
		
		WebElement Delivery_Feedback = w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/button[1]/span[1]"));
		Delivery_Feedback.click();
		Thread.sleep(2000);
		
		WebElement unsatisfactory = w.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/input[1]"));
		unsatisfactory.click();
		Thread.sleep(2000);
		
		WebElement satisfactory = w.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/input[1]"));
		satisfactory.click();
		Thread.sleep(2000);
		
		Select s1 = new Select(w.findElement(By.xpath("//select[@id='city_id']")));
		s1.selectByIndex(77);
		Thread.sleep(2000);
				
		Select s2 = new Select(w.findElement(By.name("store_id")));
		s2.selectByIndex(4);
		s2.selectByVisibleText("Panvel");
		
		w.findElement(By.name("next")).click();
		
		Select s3 = new Select(w.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/form[1]/ul[1]/li[1]/select[1]")));
		s3.selectByIndex(4);
		Thread.sleep(2000);
		
		Select s4 = new Select(w.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/form[1]/ul[1]/li[2]/select[1]")));
		s4.selectByIndex(2);
		
	    w.findElement(By.xpath("//textarea[@id='tell_us_more']")).sendKeys("Hello Quality is to good!");
	    System.out.println(w);
	    Thread.sleep(1000);
	    
	    w.findElement(By.xpath("//input[@id='name']")).sendKeys("abcdef");
	    w.findElement(By.xpath("//input[@id='email_address']")).sendKeys("abcd@gamil.com");
	    w.findElement(By.xpath("//input[@id='mobile_no']")).sendKeys("1234567890");
	    w.findElement(By.xpath("//input[@id='date_of_visit']")).click();
	    w.findElement(By.xpath("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")).click();
	    w.findElement(By.xpath("//input[@id='image1']")).sendKeys("E:\\edubridge\\ScreanShot\\batch4.png");
	    Thread.sleep(1000);
		w.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/form[1]/ul[2]/li[8]/input[1]")).sendKeys("3");
		Thread.sleep(2000);
		
		w.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/form[1]/ul[2]/li[9]/input[1]")).click();
		System.out.println( w.findElement(By.xpath("//p[contains(text(),'Error: The upload path does not appear to be valid')]")).getText());
        TakesScreenshot Defect = (TakesScreenshot) w;
		
		File src2 = Defect.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		Files.copy(src2, new File("E:\\edubridge\\ScreanShot\\defect.png"));		
		JavascriptExecutor jend =(JavascriptExecutor) w;
		jend.executeScript("window.scrollBy(0,2700)", ""); //scroll down window to bottom of webpage
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//a[contains(text(),'LOCATE US')]")).click();
		
		JavascriptExecutor jp2 =(JavascriptExecutor) w;
		w.manage().window();
		jp2.executeScript("window.scrollBy(0,3000)", "");
		
		WebElement Contactless_Delivery = w.findElement(By.xpath("//span[contains(text(),'Contactless delivery')]"));
		Contactless_Delivery.click();
		
		String a = w.findElement(By.xpath("//span[contains(text(),'Helping to keep our customers and colleagues safe')]")).getText();
		System.out.println(a);
		
		JavascriptExecutor jp3 =(JavascriptExecutor) w;
		w.manage().window();
		jp3.executeScript("window.scrollBy(0,1500)", "");
		
        TakesScreenshot t = (TakesScreenshot) w;
		
		File src1 = t.getScreenshotAs(OutputType.FILE);
		
		Files.copy(src1, new File("E:\\edubridge\\ScreanShot\\pizza1.png"));
		
	    WebElement Get_Started = w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/section[1]/section[2]/a[1]/button[1]/span[1]"));
		Get_Started.click();
		
		/*WebElement Locate_store = w.findElement(By.xpath("//span[contains(text(),'Locate a store')]"));
		Locate_store.click();
		
		// Window handler second window will open
		
        Set<String> windows = w.getWindowHandles();
		
		Iterator <String> it = windows.iterator();
		
		String parent_windows =it.next();
		
		String child_windows1=it.next();
		w.switchTo().window(child_windows1);
		System.out.println(w.getTitle());
		
		//WebElement Search = w.findElement(By.linkText("Search Nearby"));
		//Search.click();
	    
	  //  WebElement A = w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
	  //  A.sendKeys("400703");
	  //  A.sendKeys(Keys.ENTER);
	    
	 //   w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]/span[2]")).click();
	   JavascriptExecutor Geo_pic =(JavascriptExecutor) w;
		w.manage().window();
		Geo_pic.executeScript("window.scrollBy(0,2300)", "");
		
        
		w.manage().window().maximize();
		w.switchTo().window(parent_windows);
		
		//Thread.sleep(3000);*/
		
		//JavascriptExecutor jp4 =(JavascriptExecutor) w;
		//w.manage().window();
		//jp4.executeScript("window.scrollBy(0,3000)", "");
		
		w.findElement(By.xpath("//span[contains(text(),'Global Blog')]")).click();

        Set<String> windows1 = w.getWindowHandles();
		
		Iterator <String> it1 = windows1.iterator();
		
		String parent_windows1 =it1.next();
		
		String child_windows=it1.next();
		w.switchTo().window(child_windows);
		JavascriptExecutor jp5 =(JavascriptExecutor) w;
		w.manage().window();
		jp5.executeScript("window.scrollBy(0,2500)", "");
		
		w.findElement(By.xpath("//body/div[2]/footer[1]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(5000);
		w.switchTo().window(child_windows);
	    Thread.sleep(2000);
		
	    w.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
	     w.findElement(By.xpath("//button[@id='cookiebtn']")).click();
		
	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")).click();
	//	w.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[2]")).click();
	    
	//	//w.switchTo().window(parent_windows1 );
		
		
		
		
}
}
