package poc.core.recheck;

import org.testng.annotations.AfterMethod;
import static poc.core.recheck.RecheckDriverFactory.killDriver;

public class RecheckBaseTest {

    @AfterMethod
    public void after() {
        killDriver();
    }
}
