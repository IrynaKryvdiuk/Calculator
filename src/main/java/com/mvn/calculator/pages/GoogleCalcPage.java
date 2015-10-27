package com.mvn.calculator.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("https://www.google.com.ua")

public class GoogleCalcPage extends PageObject {

    private WebElementFacade q; //searchBox

    private WebElementFacade btnG; //Search button

    @FindBy(id = "cwos")
    WebElementFacade inputline;   
    
    @FindBy (id = "cwbt06")
    WebElementFacade clearButton;
    
    @FindBy (css = "#cwmcwd")
    WebElementFacade calculator;


    public void searchCalc () {
        q.sendKeys ("калькулятор");
        btnG.click();        
    }        

    
    public void checkCalcPage () {
        WebDriverWait wait = new WebDriverWait(getDriver (), 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(inputline));
    }
    
    
    public void enterNumbers (String numbers) {                      
        clearButton.click ();
        inputline.click();      
        
        Actions builder = new Actions(getDriver ());       
        builder.sendKeys(inputline, numbers).perform();      
    }
    
    
    public void pressNumbers (String numbers) {
        List<WebElement> buttons = calculator.findElements(By.xpath("//*[starts-with(@id, 'cwbt') and 'cwbt' = translate(@id, '0123456789', '')]"));
                
        String separateNumbers[] = numbers.split("");
        for (int i = 0; i < separateNumbers.length; i++){            
            for (WebElement we: buttons) {             
                if (separateNumbers [i].contains(we.getText()))
                we.click();
            }
        }        
    }              
      

    public String getResult () {
        WebDriverWait wait1 = new WebDriverWait(getDriver (), 10);
        wait1.until (ExpectedConditions.not (ExpectedConditions.textToBePresentInElement(By.id("cwles"),"Ans")));
        return inputline.getText();        
    }
    
    
    public void clearInputline () { 
        clearButton.click();
    }
}