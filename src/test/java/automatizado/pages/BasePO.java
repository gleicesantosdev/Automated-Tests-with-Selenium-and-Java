package automatizado.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * classe base para criacao das novas pagesObjects.
 * todas as pages devem ser herdadas desta classe.
 */

public abstract class BasePO {
    /**
     * driver base que sera utilizado pelas pages
     */
    protected WebDriver driver;

    /**
     * construtor base para criacao da fabrica de elementos (pagefFactory)
     * @param driver Driver da pagina atual
     */
    protected BasePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
