package poc.core.selenium;

import org.openqa.selenium.By;
import static poc.core.selenium.DriverFactory.getDriver;

public class SeleniumDSL {

    public void write(String id, String text) {
        getDriver().findElement(By.id(id)).sendKeys(text);
    }

    public void click(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public String getElement(String id){
        return getDriver().findElement(By.id(id)).getText();
    }
}
