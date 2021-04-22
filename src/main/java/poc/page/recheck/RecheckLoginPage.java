package poc.page.recheck;

import poc.core.recheck.RecheckBasePage;

public class RecheckLoginPage extends RecheckBasePage {

    public void setUsername(String s){
        dsl.write("login-user", s);
    }

    public void setPassword(String s){
        dsl.write("login-pass", s);
    }

    public void actionLogin(){
        dsl.click("login-submit");
    }
}
