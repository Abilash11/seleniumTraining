package com.selenium.examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		

		class seleniumExample {

			public void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
//				WebDriveManager.firefoxdriver()
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\abilashs\\eclipse-Selenium\\FirstProject\\drivers\\chromedriver.exe ");
//				WebDriver driver=new ChromeDriver();
//				driver.get("https://google.com" );
//				Thread.sleep(3000);
//				driver.quit();
				import org.openqa.selenium.By;
				import org.openqa.selenium.WebDriver;
				import org.openqa.selenium.chrome.ChromeDriver;

	`System.setProperty("webdriver.chrome.driver","add your path");
							WebDriver driver=new ChromeDriver();
							driver.get("https://opensource-demo.orangehrmlive.com/");
							Thread.sleep(3000);
							driver.findElement(By.id("txtUsername")).sendKeys("Admin");
							Thread.sleep(1000);
							driver.findElement(By.id("txtPassword")).sendKeys("admin123");
							Thread.sleep(1000);
							driver.findElement(By.id("btnLogin")).click();
							Thread.sleep(3000);
							driver.findElement(By.id("welcome")).click();
							Thread.sleep(1000);
							driver.findElement(By.linkText("Logout")).click();
							Thread.sleep(3000);
							driver.quit();
							
					}

				}

				
				
				
			}

		}

	}

}
