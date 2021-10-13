package com.selenium.examples;

/**
* 
*/

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import com.wordpress.Pages.LoginPage;
 
/**
* @author Mukesh_50
*
*/
public class VerifyWordpressLogin 
{
 
 
@Test
public void verifyValidLogin()
{
 
WebDriver driver=new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.get("http://demosite.center/wordpress/wp-login.php");
 
LoginPage login=new LoginPage(driver);
 
 
 
login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
}