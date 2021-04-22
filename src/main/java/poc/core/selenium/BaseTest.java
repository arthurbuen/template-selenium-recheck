package poc.core.selenium;

import org.testng.annotations.AfterMethod;
import static poc.core.selenium.DriverFactory.killDriver;

public class BaseTest {

    @AfterMethod
    public void after() {
        //killDriver();
    }
}
