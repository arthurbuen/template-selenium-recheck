package poc.core.recheck;

import de.retest.web.selenium.RecheckDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecheckDriverFactory {

    private static RecheckDriver driver;
    private RecheckDriverFactory() {}

    public static RecheckDriver getDriver() {
        if(driver == null) {
            driver = new RecheckDriver( new ChromeDriver() );
            driver.manage().window().maximize();
            return driver;
        }
        return driver;
    }

    static void killDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
