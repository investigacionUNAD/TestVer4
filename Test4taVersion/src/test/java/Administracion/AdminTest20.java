package Administracion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminTest20 {

	//Prue_0050
		private WebDriver driver;	
		By Click = By.xpath("//*[@id=\"formView:j_idt41:Limpiar\"]/span");
		By Respuesta = By.xpath("//*[@id=\"formView:j_idt41:j_idt47\"]");

		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/programa.xhtml");

		}
		@After
		public void tearDown() throws Exception {
			driver.quit();
		}

		@Test
		public void Prue_0050() throws InterruptedException {
			driver.findElement(Click).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(Respuesta).isDisplayed());


		}


	}

