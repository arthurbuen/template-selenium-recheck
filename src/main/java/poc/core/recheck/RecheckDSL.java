package poc.core.recheck;

import org.openqa.selenium.By;
import static poc.core.recheck.RecheckDriverFactory.getDriver;

public class RecheckDSL {

    public void write(String id, String text) {
        getDriver().findElement(By.id(id)).sendKeys(text);
    }

    public void click(String id) {
        getDriver().findElement(By.id(id)).click();
    }
}
