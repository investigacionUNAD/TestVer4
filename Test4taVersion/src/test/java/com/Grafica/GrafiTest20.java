package com.Grafica;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrafiTest20 {
	//Prue_0165

	private WebDriver driver;

	By Click = By.xpath("//*[@id=\"formTab:j_idt41:j_idt114\"]/span");
	By Respuesta = By.xpath("//*[@id=\"form:basicDT\"]/tr/td");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/indicadorGralConsolida.xhtml");

	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0165() throws InterruptedException {

		driver.findElement(Click).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(Respuesta).isDisplayed());


	}


}