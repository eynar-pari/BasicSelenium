package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
     public TextBox emailField;
     public TextBox passwordField;
     public Button loginButton;

     public LoginPage(){
         emailField=new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
         passwordField=new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]"));
         loginButton=new Button(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]"));
     }



}
