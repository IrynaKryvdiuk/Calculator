package com.mvn.calculator.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.BeforeScenario;

import com.mvn.calculator.steps.CalcSteps;


public class CalcJBSteps {

    @Steps
    CalcSteps calcSteps;
    
    @BeforeScenario
    public void beforeScenarios() {
        calcSteps.openGooglePage();
        calcSteps.openGoogleCalcPage();
    }
    
    @Given("the user is on a Google Calculator webpage")
    public void givenTheUserOpenGoogleCalc() {
        calcSteps.checkGoogleCalcPage ();        
    }

    @When ("the user enter numbers: \"numbers\"")
    public void whenTheUserEnterNumbers (String numbers) {
        calcSteps.enterNumbersToCalc(numbers);
    }
    
    @When ("the user press buttons: \"onlineButtons\"")
    public void whenTheUserPressButtons (String onlineButtons) {
        calcSteps.pressNumbersToCalc(onlineButtons);
    }
    
    @Then ("the user should see a result \"result\"")
    public void thenTheUserSeeResult (String result) {
        calcSteps.checkResult(result);
    }
    
    @Then ("the user should see a result \"resultForButtons\"")
    public void thenTheUserSeeResultForButtons (String resultForButtons) {
        calcSteps.checkResult(resultForButtons);
    }
}
