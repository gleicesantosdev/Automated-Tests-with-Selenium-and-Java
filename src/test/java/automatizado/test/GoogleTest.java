package automatizado.test;

import automatizado.pages.GooglePO;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class GoogleTest extends BaseTest {

    private static GooglePO googlePage;
    @BeforeClass
    public static void prepararTestes() {
      googlePage = new GooglePO(driver);
    };

    @Test
    public void TesteDriver() {
        //WebElement inputPesquisa = driver.findElement(By.name("q"));
        googlePage.inputPesquisa.sendKeys("gsan" + Keys.ENTER);

         String resultado = driver.findElement(By.id("infoDiv")).getText();
               assertTrue(resultado, resultado.contains("resultados"));

               if(googlePage.temCaptcha()) {
                   System.out.println("Captcha");
                   System.out.println(" Resolva manualmente e pressione enter no console");
                   new Scanner(System.in).nextLine(); //pausa o teste
               }
    }


}


