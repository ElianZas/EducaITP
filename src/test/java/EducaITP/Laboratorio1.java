package EducaITP;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Laboratorio1 {

	@Ignore
	public void lab1_test() {
		
		System.out.println("Hola Mundo de Automatización!!");
		
	}
	
	@Test
	public void  lab1_e1() {
	   
		System.setProperty("webdriver.chrome.driver", "..\\EducaITP\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://www.automationpractice.pl/index.php");
		driver.close();
		
	}
	
	@Ignore
	public void lab1_e2() {
		
		System.setProperty("webdriver.gecko.driver", "..\\EducaITP\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.get("http://www.automationpractice.pl/index.php");
		driver.close();			
		
	}
	
	@Test
    public void lab1_e3() {

        System.setProperty("webdriver.chrome.driver", "..\\EducaITP\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();



        try {

        	

        	// Maximize the browser window

            driver.manage().window().maximize();

            

            // Open the URL

            driver.get("http://www.automationpractice.pl/index.php");



            // Find the search input field and clear it

            WebElement txtBuscador = driver.findElement(By.id("search_query_top"));

            txtBuscador.clear();



            // Enter "Blouse" in the search box and press ENTER

            txtBuscador.sendKeys("Blouse");

            txtBuscador.sendKeys(Keys.ENTER);



        } catch (Exception ex) {

            // Print the error message for better debugging

            System.out.println("Se ha producido un error: " + ex.getMessage());

        } finally {

            // Quit the browser to close all windows and end the session

            driver.quit();

        }

    }


	
}
