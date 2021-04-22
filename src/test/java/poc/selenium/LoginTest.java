package poc.selenium;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import poc.core.selenium.BaseTest;
import poc.page.selenium.LoginPage;
import java.nio.file.Paths;
import static org.awaitility.Awaitility.await;
import static poc.core.selenium.DriverFactory.getDriver;

public class LoginTest extends BaseTest {

    private LoginPage login;
    static private String SUCESS_MESSAGE_WELCOME = "PROVA DE CONCEITO";
    static private String ERROR_MESSAGE_REQUIRED_FIELD = "Required fields.";
    static private String ERROR_MESSAGE_INVALID_USER = "Invalid username or password.";

    @BeforeMethod
    public void setUp() throws Exception {
        login = new LoginPage();
        String url = Paths.get( System.getProperty("user.dir") + "/Login/index.html" ).toUri().toURL().toString();
        getDriver().get(url);
    }

    @Test
    public void sucessLoginTest() {
        login.setUsername("sicredi");
        login.setPassword("teste123");
        login.actionLogin();
        await().untilAsserted(() -> Assert.assertEquals(login.getSucessMessage(), SUCESS_MESSAGE_WELCOME));
    }
    @Test
    public void requiredFieldsTest() {
        login.setUsername("");
        login.setPassword("");
        login.actionLogin();
        await().untilAsserted(() -> Assert.assertEquals(login.getErrorMessage(), ERROR_MESSAGE_REQUIRED_FIELD));
    }
    @Test
    public void invalidLoginTest() {
        login.setUsername("teste123");
        login.setPassword("sicredi");
        login.actionLogin();
        await().untilAsserted(() -> Assert.assertEquals(login.getErrorMessage(), ERROR_MESSAGE_INVALID_USER));
    }
}
