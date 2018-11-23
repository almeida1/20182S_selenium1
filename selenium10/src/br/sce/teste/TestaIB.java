package br.sce.teste;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaIB {
	

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://banco.bradesco/html/classic/index.shtm");
		// Procura o elemento html de entrada de texto pelo nome
		WebElement element = driver.findElement(By.id("AGN"));
		// Digita as informações solicitadas de acordo com o ct
		element.sendKeys("1111");
		element = driver.findElement(By.id("CTA"));
		element.sendKeys("111111");
		element = driver.findElement(By.linkText("OK"));
		element.click();
		
		System.out.println("Page title is: " + driver.getTitle());
		
		element.submit();
		System.out.println("Page title is: " + driver.getTitle());
		assertEquals("Banco Bradesco | Pessoa Física, Exclusive, Prime e Private",driver.getTitle());
		// Close the browser
		//driver.quit();
	}

}
