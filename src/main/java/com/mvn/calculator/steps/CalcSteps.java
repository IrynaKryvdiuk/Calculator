package com.mvn.calculator.steps;

import com.mvn.calculator.pages.GoogleCalcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

public class CalcSteps extends ScenarioSteps {

    GoogleCalcPage googleCalcPage;
            
    @Step
    public void openGooglePage() {
        googleCalcPage.open();
    }

    @Step
    public void openGoogleCalcPage() {
        googleCalcPage.searchCalc();
    }
    
    @Step
    public void checkGoogleCalcPage() {
        googleCalcPage.checkCalcPage();
        googleCalcPage.clearInputline ();
    }

    @Step
    public void enterNumbersToCalc(String numbers) {
        googleCalcPage.enterNumbers (numbers);
    }
    
    @Step
    public void pressNumbersToCalc(String onlineButtons) {
        googleCalcPage.pressNumbers (onlineButtons);
    }
    
    @Step
    public void checkResult(String result) {
        assertEquals(result, googleCalcPage.getResult());
        googleCalcPage.clearInputline ();
    }     
}
