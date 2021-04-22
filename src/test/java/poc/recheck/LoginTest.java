package poc.recheck;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import poc.core.recheck.RecheckBaseTest;
import poc.page.recheck.RecheckLoginPage;
import java.nio.file.Paths;
import static poc.core.recheck.RecheckDriverFactory.getDriver;

public class LoginTest extends RecheckBaseTest {

    private RecheckLoginPage login;

    @BeforeMethod
    public void setUp() throws Exception {
        login = new RecheckLoginPage();
        String url = Paths.get( System.getProperty("user.dir") + "/Login/index.html" ).toUri().toURL().toString();
        getDriver().get(url);
    }

    @Test
    public void sucessLoginTest() {
        getDriver().startTest("sucessLoginTest");
        login.setUsername("sicredi");
        login.setPassword("teste123");
        login.actionLogin();
    }

    @Test
    public void requiredFieldsTest() {
        getDriver().startTest("requiredFieldsTest");
        login.setUsername("");
        login.setPassword("");
        login.actionLogin();
    }

    @Test
    public void invalidLoginTest() {
        getDriver().startTest("invalidLoginTest");
        login.setUsername("teste123");
        login.setPassword("sicredi");
        login.actionLogin();
    }
}
