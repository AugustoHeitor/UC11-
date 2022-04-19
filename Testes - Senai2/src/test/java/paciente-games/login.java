package cordeiroplay;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLoginCordeiroPlay {
	private WebDriver driver;
	
	@Before
	
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
	}
	  
	@Test
	public void TesteNavegador() {
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement inputSenha = driver.findElement(By.id("password"));
		WebElement botaoLogin = driver.findElement(By.id("verificar"));
		
		String[] listaSenhas = {"1234", "heitor12345", "augusto222", "fontes213"};
		for(int tentativa = 0; tentativa < listadeSenhas.length; tentativa++) {
			
			try {
				inputEmail.clear();
				inputSenha.clear();
				
				inputEmail.sendKeys("auuheitor@hotmail.com");
				inputSenha.sendKeys(listadeSenhas[tentativa]);
				botaoLogin.click();
			
				Thread.sleep(3000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		}
	}
