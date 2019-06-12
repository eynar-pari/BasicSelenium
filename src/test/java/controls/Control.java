package controls;

import helpers.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Control {

       private WebElement control;
       private By locator;

       public Control(By locator){
           this.locator=locator;
       }

       private WebElement find(){
//           WebDriverWait wait = new WebDriverWait(Session.getInstance().getDriver(),
//                   10);
//           wait.until(ExpectedConditions.elementToBeClickable(this.locator)); //  Explicit wait
//           wait.until(ExpectedConditions.textToBe(this.locator,""));

           control=Session.getInstance().getDriver().findElement(locator);
           return control;
       }

      public void click(){
           find();
           control.click();
        }
      public void set (String value){
           find();
           control.clear();
           control.sendKeys(value);
      }

      public boolean isDisplayed(){
          try {
              control = Session.getInstance().getDriver().findElement(locator);
              return control.isDisplayed();
          }catch (Exception e){
              return false;
          }
      }

      public String getText(){
           find();
           return control.getText();
      }

      public String getTextAttribute(String attribute){
           find();
            return control.getAttribute(attribute);
      }

      public void doubleClick(){
          Actions actions = new Actions(Session.getInstance().getDriver());
          actions.doubleClick();
      }

}
