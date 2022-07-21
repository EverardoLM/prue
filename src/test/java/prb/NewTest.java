package prb;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class NewTest {
	ConfiDriver cd = new ConfiDriver();
	Casos ca = new Casos();
 
  @BeforeTest
  public void beforeTest() {
	  cd.iniciaChrome();
  }

  @AfterTest
  public void afterTest() {
	  cd.driver.quit();
  }
  
  @Test(enabled = true,  priority = 1)
	public void casoPrueba() throws InterruptedException, IOException {
		System.out.println("INICIANDO caso1");
		ca.prueba();
		System.out.println("FINALIZADO caso1");
	}
  

}
