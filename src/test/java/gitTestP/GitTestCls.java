package gitTestP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class GitTestCls {  
	
	public void loginTest(){ 
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.google.com");
		System.out.println(wd.getTitle());
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
	}
	
	/*public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.google.com");
		System.out.println(wd.getTitle());
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
	}
	*/

}
