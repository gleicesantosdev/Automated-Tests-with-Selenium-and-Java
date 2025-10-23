package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    //nao pode ser instanciada, somente herdada

    protected static WebDriver driver;
    private static final String URL_BASE = "http://www.google.com";


    @BeforeClass //chamada antes de qualquer outro metodo de teste
    public static void iniciar() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass //roda depois de todos os testes
    public static void finalizar(){
        driver.quit();
    }


}