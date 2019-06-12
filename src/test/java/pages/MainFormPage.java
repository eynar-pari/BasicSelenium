package pages;

import controls.Label;
import org.openqa.selenium.By;

public class MainFormPage {

    public Label projectNameLabel;

    public MainFormPage(){
        projectNameLabel=new Label(By.id("CurrentProjectTitle"));
    }
}
