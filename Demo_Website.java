package demoWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_Website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Selenium Jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
	
		w.get("http://demo.guru99.com/test/newtours/index.php");
		w.findElement(By.name("userName")).sendKeys("test");
		w.findElement(By.name("password")).sendKeys("test");
		w.findElement(By.name("submit")).click();
		System.out.println(w.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]")).getText());
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		w.findElement(By.name("firstName")).sendKeys("Kanchan");
		w.findElement(By.name("lastName")).sendKeys("Bhosale");
		w.findElement(By.name("phone")).sendKeys("0123456789");
		w.findElement(By.name("userName")).sendKeys("kanchan.bhosale85@gmail.com");
		w.findElement(By.name("address1")).sendKeys("vashi");
		Select s1=new Select(w.findElement(By.name("country")));
		s1.selectByIndex(1);
		s1.selectByValue("ALBANIA");
		s1.selectByVisibleText("ALBANIA");
		Thread.sleep(2000);
		w.findElement(By.name("email")).sendKeys("kanchan.bhosale85@gmail.com");
		w.findElement(By.name("password")).sendKeys("ABCD");
		w.findElement(By.name("confirmPassword")).sendKeys("ABCD");
		w.findElement(By.name("submit")).click();
		System.out.println(w.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/p[2]")).getText());
		w.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		w.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Selenium IDE Test')]")).click();
		System.out.println(w.getTitle());
		w.navigate().back();
		w.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
		System.out.println(w.getTitle());
		w.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Select s2=new Select(w.findElement(By.name("title")));
		s2.selectByIndex(1);
		s2.selectByValue("Mrs");
		s2.selectByVisibleText("Mrs");
		w.findElement(By.name("firstname")).sendKeys("ABCD");
		w.findElement(By.name("lastname")).sendKeys("ABCD");
		Select s3 = new Select(w.findElement(By.id("user_dateofbirth_1i")));
		s3.selectByIndex(3);
		s3.selectByValue("1938");
		s3.selectByVisibleText("1938");
		Select s4 = new Select(w.findElement(By.id("user_dateofbirth_2i")));
		s4.selectByIndex(1);
		s4.selectByValue("2");
		s4.selectByVisibleText("February");
		w.findElement(By.id("licencetype_t")).click();
		w.findElement(By.id("licencetype_f")).click();
		w.findElement(By.id("user_user_detail_attributes_email")).sendKeys("kanchan.bhosale85@gmail.com");
		w.findElement(By.id("user_user_detail_attributes_password")).sendKeys("ABCD");
		w.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("ABCD");
		w.findElement(By.name("submit")).click();

		w.findElement(By.id("email")).sendKeys("kanchan.bhosale85@gmail.com");
		w.findElement(By.id("password")).sendKeys("ABCD");
		w.findElement(By.name("submit")).click();
	    System.out.println(w.getTitle());
	    System.out.println(w.findElement(By.xpath("//h2[contains(text(),'Broker Insurance WebPage')]")).getText());
	    w.findElement(By.xpath("//body/div[3]/form[1]/input[1]")).click();
	    w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
	    w.findElement(By.className("dropdown-toggle")).click();
	    w.findElement(By.xpath("//a[contains(text(),'Drag and Drop Action')]")).click();
	    Actions a = new Actions(w);
		
		WebElement bank = w.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement drop1 = w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		a.dragAndDrop(bank, drop1).build().perform();
		
		WebElement amt = w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		WebElement drop2 = w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		a.dragAndDrop(amt, drop2).build().perform();
	
		WebElement sale = w.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement drop3 = w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		a.dragAndDrop(sale, drop3).build().perform();
		
		
		
	}

}
