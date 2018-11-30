package gmail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mail1 extends base {

	public static void findmail() {
		/*
		 * List<WebElement> unreademail =
		 * driver.findElements(By.xpath("//span[@class='zF']"));
		 * System.out.println(unreademail.size()); String MyMailer =
		 * "Jinal Patel"; for(int i=0;i<unreademail.size();i++){ String MyMailer
		 * = "Jinal Patel"; if(unreademail.get(i).isDisplayed()==true){
		 * if(unreademail.get(i).getText().equals(MyMailer)){
		 * unreademail.get(i).click();
		 * System.out.println("Yes we have got mail from " + MyMailer); break; }
		 * else { System.out.println("No mail from " + MyMailer); } } }
		 */
		//List<WebElement> RadioNamelist = driver.findElements(By.xpath("//div[@class='yW']//span[@email='monali.p@latitudetechnolabs.com'][contains(text(),'Islamhub')]"));
		List<WebElement> RadioNamelist = driver.findElements(By.xpath("//tr[@class='zA yO']"));//bqe = subject     //zF = un read
		System.out.println(RadioNamelist.size());
		
//email = monali.p@latitudetechnolabs.com
// class = zF
// name = Islamhub
// get text = //span[@class='bqe'] = Religion Forgot Password
		for (int i = 0; i < RadioNamelist.size(); i++) {
			//System.out.println(RadioNamelist.get(i).getAttribute("text"));//email//name//class
		String	anObject = "Religion Forgot Password";
			if(RadioNamelist.get(i).getText().contains(anObject)){
				System.out.println("found text:  "+anObject);
			}else{
				System.out.println("text not match");
			}
			//System.out.println(RadioNamelist.get(i).getText());
			//System.out.println("found text:  "+anObject);
			
			RadioNamelist.get(i).getAttribute("email");
			RadioNamelist.get(i).getAttribute("class");
			RadioNamelist.get(i).getAttribute("name");
		}//div[@class='yW']//span[@name='Islamhub'][contains(text(),'Islamhub')]
	}//div[@class='yW']//span[@email='monali.p@latitudetechnolabs.com'][contains(text(),'Islamhub')]
}//span[@id=':1ga'][contains(text(),'Religion Forgot Password')]
//a[normalize-space(text())='Thomas Cook (I)']
//*[@class='featured-box']//*[text()='Testing']
//*[contains(@id, 'ctl00_btnAircraftMapCell')]//*[contains(@title, 'Select Seat')]
//div[@class='yW']//span[@class='bA4']//span[@email='monali.p@latitudetechnolabs.com']//span[@name='Islamhub']
//div[@id=':3m']//span[@name='Islamhub'][contains(text(),'Islamhub')]

//working xpath  :- //div[@class='yW']//span[@class='bA4']//span[@email='monali.p@latitudetechnolabs.com'][@name='Islamhub']

// read :- //span[@class='yP']
// unread mail :- //span[@class='zF']//span[@email='monali.p@latitudetechnolabs.com'][@name='Islamhub']

//span[@class='zF']//span[@email='monali.p@latitudetechnolabs.com']//span[@name='Islamhub']

//working1 //span[@class='zF'][@name='Islamhub'] 