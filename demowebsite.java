package Seleniumweb;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.servlet.http.Cookie;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
public class demowebsite {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium Jar\\chromedriver_win32_1\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
	 /* Page landing and Login page*/
		w.get("http://demo.guru99.com/test/newtours/index.php");
		w.manage().window().maximize();
	    Thread.sleep(2000);
		WebElement username = w.findElement(By.name("userName"));
		username.sendKeys("test");
		WebElement password =  w.findElement(By.name("password"));
		password.sendKeys("test");
		WebElement submitTab = w.findElement(By.name("submit"));
		submitTab.click();
		String Text1 = w.findElement(By.xpath("//tbody//tr//td//h3")).getText();
	    System.out.println(Text1);
		
	   // Log out page//
	    Thread.sleep(2000);
		
		WebElement SignOff = w.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]"));
		SignOff.click();
		Thread.sleep(2000);
		// Registration form //
		WebElement Register = w.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
		Register.click();
		Thread.sleep(1000);
		WebElement FirstName = w.findElement(By.name("firstName"));
		FirstName.sendKeys("Kanchan");
		Thread.sleep(1000);
		WebElement LastName = w.findElement(By.name("lastName"));
		LastName.sendKeys("Bhosale");
		Thread.sleep(1000);
		WebElement Phone = w.findElement(By.name("phone"));
		Phone.sendKeys("0123456789");
		Thread.sleep(1000);
		WebElement Email = w.findElement(By.name("userName"));
		Email.sendKeys("kanchan85.bhosale@gmail.com");
		Thread.sleep(1000);
		w.findElement(By.name("address1")).sendKeys("vashi");
		Thread.sleep(1000);
		WebElement city = w.findElement(By.name("city"));
		city.sendKeys("Navi Mumbai");
		Thread.sleep(1000);
		WebElement State = w.findElement(By.name("state"));
		State.sendKeys("Maharashtra");
		Thread.sleep(1000);
		Select s1=new Select(w.findElement(By.name("country")));
		WebElement Postalcode = w.findElement(By.name("postalCode"));
		Postalcode.sendKeys("123456");
		Thread.sleep(1000);
		//s1.selectByIndex(1);
		s1.selectByValue("INDIA");
		s1.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		
		WebElement email = w.findElement(By.name("email"));
		email.sendKeys("kanchan.bhosale85@gmail.com");
		Thread.sleep(1000);
		WebElement Password1 = w.findElement(By.name("password"));
		Password1.sendKeys("ABCD");
		Thread.sleep(1000);
		WebElement confirm = w.findElement(By.name("confirmPassword"));
		confirm.sendKeys("ABCD");
		Thread.sleep(1000);
		WebElement Submit = w.findElement(By.name("submit"));
		Submit.click();
		System.out.println(w.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/p[2]")).getText());
		
		WebElement Home = w.findElement(By.xpath("//a[contains(text(),'Home')]"));
		Home.click();
		WebElement Salenium = w.findElement(By.className("dropdown-toggle"));
		Salenium.click();
		Thread.sleep(2000);
		
		WebElement SeleniumIDE = w.findElement(By.xpath("//a[contains(text(),'Selenium IDE Test')]"));
		SeleniumIDE.click();
		String Texttitle = w.findElement(By.xpath("//center[contains(text(),'This is DEMO site for TESTING purpose')]")).getText();
		System.out.println(Texttitle);
		//System.out.println(w.getTitle());
		// Check Radio Button //
		Thread.sleep(2000);
		WebElement Salenium1 = w.findElement(By.className("dropdown-toggle"));
		Salenium1.click();
		WebElement RadioButton = w.findElement(By.xpath("//a[contains(text(),'Radio & Checkbox Demo')]"));
		RadioButton.click();
		WebElement option1 = w.findElement(By.id("vfb-7-1"));
		option1.click();
		Thread.sleep(1000);
		WebElement option2 = w.findElement(By.id("vfb-7-2"));
		option2.click();
		Thread.sleep(1000);
		WebElement option3 = w.findElement(By.id("vfb-7-3"));
		option3.click();
		Thread.sleep(1000);
		WebElement checkbox1 = w.findElement(By.id("vfb-6-0"));
		checkbox1.click();
		Thread.sleep(1000);
		WebElement checkbox2 = w.findElement(By.id("vfb-6-1"));
		checkbox2.click();
		Thread.sleep(1000);
		WebElement checkbox3 = w.findElement(By.id("vfb-6-2"));
		checkbox3.click();
		Thread.sleep(1000);
		w.navigate().back();
		// Table containt 
		Thread.sleep(2000);
		WebElement Salenium2 = w.findElement(By.className("dropdown-toggle"));
		Salenium2.click();
	    WebElement Table = w.findElement(By.xpath("//a[contains(text(),'Table Demo')]"));
	    Table.click();
	    List < WebElement > rows_table = w.findElements(By.tagName("tr"));
	    int rows_count = rows_table.size();
	    System.out.println(rows_count);
   	    for (int row = 0; row < rows_count; row++) {
    	    //To locate columns(cells) of that specific row.
    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
    	    //To calculate no of columns (cells). In that specific row.
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	    //Loop will execute till the last cell of that specific row.
    	    for (int column = 0; column < columns_count; column++) {
    	        // To retrieve text from that specific cell.
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
   	    }
   	    //Cookies handling and file creation
   	 WebElement Salenium3 = w.findElement(By.className("dropdown-toggle"));
	Salenium3.click();   
	WebElement cookies = w.findElement(By.xpath("//a[contains(text(),'Cookie Handling Demo')]"));
	cookies.click();
   	 WebElement user1 = w.findElement(By.name("username"));
   	 user1.sendKeys("xyz345");		
   	 Thread.sleep(1000);
   	 WebElement pass1 = w.findElement(By.name("password"));
   	 pass1.sendKeys("xyz345");							
     WebElement Submit1 = w.findElement(By.name("submit"));
     Submit1.click();	
     File file = new File("Cookies.data");							
     try		
     {	  
         // Delete old file if exists
			file.delete();		
         file.createNewFile();			
         FileWriter fileWrite = new FileWriter(file);							
         BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
                	
                  for(org.openqa.selenium.Cookie cook : w.manage().getCookies())							
         {			
             Bwrite.write((cook.getName()+";"+cook.getValue()+";"+cook.getDomain()+";"+cook.getPath()+";"+cook.getExpiry()+";"+cook.isSecure()));																									
             Bwrite.newLine();             
         }			
         Bwrite.close();			
         fileWrite.close();	
         
     }
     catch(Exception ex)					
     {		
         ex.printStackTrace();			
     }	
     
     w.navigate().back();
     WebElement Salenium4 = w.findElement(By.className("dropdown-toggle"));
 	Salenium4.click();
 	// File Upload //
 	WebElement upload = w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[10]/a[1]"));
 	upload.click();
 	WebElement choosefile = w.findElement(By.name("uploadfile_0"));
 	choosefile.sendKeys("D:\\Images\\Screenshot 2021-09-21 122313.png");
 	WebElement termcheck = w.findElement(By.id("terms"));
 	termcheck.click();
 	WebElement sendbutton = w.findElement(By.name("send"));
 	sendbutton.click();
 	Thread.sleep(2000);
 	
 	// Alert function to deleat customer form//
 	
 	 WebElement Salenium5 = w.findElement(By.className("dropdown-toggle"));
 	 Salenium5.click(); 
 	 Thread.sleep(1000);
 	 WebElement customerDeletform = w.findElement(By.xpath("//a[contains(text(),'Delete Customer Form')]"));
 	 customerDeletform.click();
 	 WebElement CustomerID = w.findElement(By.name("cusid"));
 	 CustomerID.sendKeys("123");;
 	 WebElement submit1 = w.findElement(By.name("submit"));
 	 submit1.click();
 	 Thread.sleep(2000);
 	 Alert A = w.switchTo().alert();
 	 System.out.println(A.getText());
 	 A.accept();
 	 Thread.sleep(2000);
 	 Alert A1 = w.switchTo().alert();
 	 System.out.println(A1.getText());
 	 A1.accept();
 	 Thread.sleep(2000);
 	 WebElement CustomerID1 = w.findElement(By.name("cusid"));
 	 CustomerID1.sendKeys("123");;
 	 WebElement submit2 = w.findElement(By.name("submit"));
 	 submit2.click();
 	 Thread.sleep(2000);
 	 Alert A2 = w.switchTo().alert();
	 System.out.println(A2.getText());
	 Thread.sleep(1000);
	 A2.dismiss();
	 Thread.sleep(2000);
	  // Scroll upto right option
	 WebElement Salenium6 = w.findElement(By.className("dropdown-toggle"));
 	 Salenium6.click(); 
 	 WebElement scroll =w.findElement(By.xpath("//a[contains(text(),'Scrollbar Demo')]"));
 	 scroll.click();
	  WebElement Element = w.findElement(By.linkText("VBScript"));
	  JavascriptExecutor js =(JavascriptExecutor) w;		
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  Thread.sleep(1000);
	  WebElement VBclick = w.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	  VBclick.click();
	  Thread.sleep(2000);
	  w.navigate().back();
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
		
		// Telecomproject module to test//
		
		WebElement telecomproject = w.findElement(By.xpath("//a[contains(text(),'Telecom Project')]"));
		telecomproject.click();
		Thread.sleep(1000);
		WebElement addcustomer = w.findElement(By.linkText("Add Customer"));
		addcustomer.click();
		Thread.sleep(1000);
		WebElement background = w.findElement(By.xpath("//label[contains(text(),'Done')]"));
		background.click();
		Thread.sleep(1000);
		WebElement firstname = w.findElement(By.id("fname"));
		firstname.sendKeys("Kanchan");
		Thread.sleep(1000);
		WebElement lastname = w.findElement(By.id("lname"));
	    lastname.sendKeys("Bhosale");
	    Thread.sleep(1000);
	    WebElement email1 = w.findElement(By.id("email"));
	    email1.sendKeys("xyz@gmail.com");
	    Thread.sleep(1000);
	    JavascriptExecutor js3 =(JavascriptExecutor) w;
		js3.executeScript("window.scrollBy(0,2000)");
	    WebElement address = w.findElement(By.name("addr"));
	    address.sendKeys("Navi mumbai");	    
	    WebElement telephone = w.findElement(By.id("telephoneno"));
	    telephone.sendKeys("1234567890");
	    Thread.sleep(1000);
	    WebElement Submit2 = w.findElement(By.name("submit"));
	    Submit2.click();
	    Thread.sleep(3000);
	    String number = w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/h3[1]")).getText();
        WebElement HomeTab = w.findElement(By.xpath("//body/section[@id='main']/div[1]/div[1]/ul[1]/li[1]/a[1]"));
        System.out.println(number);
        HomeTab.click();
        JavascriptExecutor js5 =(JavascriptExecutor) w;
		js5.executeScript("window.scrollBy(0,2000)");
        WebElement paymentmode = w.findElement(By.xpath("//body/section[@id='one']/div[1]/div[3]/div[2]/h3[1]/a[1]"));
        paymentmode.click();
        Thread.sleep(1000);       
        WebElement IDpayment = w.findElement(By.xpath("//input[@id='customer_id']"));
        IDpayment.sendKeys(number);
        Thread.sleep(1000);
        WebElement Submit6 = w.findElement(By.name("submit"));
        Submit6.click();
        Thread.sleep(1000);
        JavascriptExecutor js1 =(JavascriptExecutor) w;
		js1.executeScript("window.scrollBy(0,1000)");
		
        TakesScreenshot t = (TakesScreenshot) w;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, new File("D:\\Project\\batch2.png"));
        Thread.sleep(2000);
        // Payment Gateway option
		WebElement Paymentgateway = w.findElement(By.xpath("//a[contains(text(),'Payment Gateway Project')]"));
		Paymentgateway.click();
		Thread.sleep(1000);
		JavascriptExecutor js7 =(JavascriptExecutor) w;
		js7.executeScript("window.scrollBy(0,1000)");
		Select sel = new Select(w.findElement(By.name("quantity")));
		sel.selectByIndex(3);
		Thread.sleep(1000);
       WebElement Buy = w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/form[1]/div[1]/div[8]/ul[1]/li[1]/input[1]"));
       Buy.click();
       
       WebElement Cardnumber = w.findElement(By.id("card_nmuber"));
       Cardnumber.sendKeys("1234567890123456");
       Thread.sleep(1000);
       Select sel1 = new Select(w.findElement(By.id("month")));
       sel1.selectByIndex(1);
       Select sel2 = new Select(w.findElement(By.id("year")));
       sel2.selectByValue("2023");
       WebElement CVV = w.findElement(By.id("cvv_code"));
       CVV.sendKeys("123");
       
       WebElement Pay = w.findElement(By.name("submit"));
       Pay.click();
       
        
        
	    
		
		
	}

}
