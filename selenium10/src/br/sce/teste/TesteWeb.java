package br.sce.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		// Procura o elemento html de entrada de texto pelo nome
		WebElement element = driver.findElement(By.name("q"));
		// Entra o texto de pesquisa
		element.sendKeys("Selenium webdriver");
		// Submete o form. WebDriver encontra o form do objeto element
		element.submit();
		System.out.println("O titulo da página é: " + driver.getTitle());
		assertEquals("Selenium webdriver - Pesquisa Google",driver.getTitle());
		// Fecha o browser
		//driver.quit();
	}

}
