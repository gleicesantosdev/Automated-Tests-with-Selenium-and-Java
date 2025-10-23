package automatizado.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(name = "gsan")
    public WebElement inputPesquisa;

    /**
     * construtor para pagina do google
     * @param driver driver da pagina do google
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }
}
