package steps;

import pages.GooglePageObject;

public class googleStep {

    GooglePageObject gpo= new GooglePageObject();
    public void openGoogle(){
        gpo.openHome();

    }
}
