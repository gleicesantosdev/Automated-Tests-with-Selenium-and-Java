package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

public class GoogleTest extends BaseTest {

    @Test
    public void TesteDriver() {

        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("gsan" + Keys.ENTER);

        String resultado = driver.findElement(By.id("infoDiv")).getText();
        assertTrue(resultado, resultado.contains("resultados"));

    }
}


