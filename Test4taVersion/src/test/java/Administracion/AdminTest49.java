package Administracion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminTest49 {
	//Prue_0079

		private WebDriver driver;
		By userPerfil = By.xpath("//*[@id=\"formView:j_idt41:j_idt51\"]");		
		By Click = By.xpath("//*[@id=\"formView:j_idt41:j_idt81\"]/span");
		By Respuesta = By.xpath("//*[@id=\"basicDT_data\"]/tr[1]/td[2]");

		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/indicador.xhtml");
			
		}
		@After
		public void tearDown() throws Exception {
			driver.quit();
		}

		@Test
		public void Prue_0079() throws InterruptedException {

			driver.findElement(userPerfil).sendKeys("C_2_10");
			driver.findElement(Click).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(Respuesta).isDisplayed());


		}


	}