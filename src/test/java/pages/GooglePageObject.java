package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class GooglePageObject extends PageObject {

    WebDriver driver;

    public String openHome(){
        getDriver().get("https://google.com");
        return getDriver().getTitle();

    }
}
