package pages;

import net.serenitybdd.core.pages.PageObject;

public class BaseClass extends PageObject {

    public void InitialiseBroser(){
        getDriver().get("https://www.facebook.com/");
    }
}
