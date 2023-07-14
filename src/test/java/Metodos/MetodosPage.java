package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosPage {
	
	WebDriver driver;
	
	public void abrirnavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ellbe\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get(url);

		 
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	
	public void preencher(By elemento,String valor)  {
		WebElement campo = driver.findElement(elemento);
		campo.sendKeys(valor);
		
	}
	

	  public void imagens(By elemento) {
	        WebElement imageUpload = driver.findElement(elemento);
	        imageUpload.sendKeys("C:\\\\Users\\\\ellbe\\\\Desktop\\\\imagens\\\\download.png");
	
	  }
	  

	    public void fecharNavegador() {
	        driver.quit();
	  
	}

}
	

