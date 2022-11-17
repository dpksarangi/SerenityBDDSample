package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.googleStep;

public class GoogleStepDef {

        @Steps
        googleStep gs;

        @When("I search wikipedia")
        public void iSearchWikipedia() {


        }

        @Given("I am at google")
        public void iAmAtGoogle() {
                gs.openGoogle();
        }

}
