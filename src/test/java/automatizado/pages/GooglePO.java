package automatizado.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    /**
     * construtor para pagina do google
     * @param driver driver da pagina do google
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }

    public void pesquisar(String termo){
        inputPesquisa.sendKeys(termo);
        inputPesquisa.sendKeys(Keys.ENTER);
    }

    //verifica se tem captcha na tela
    public boolean temCaptcha(){
        return driver.getPageSource().contains("Captcha");
    }
}
