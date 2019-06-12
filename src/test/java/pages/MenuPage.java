package pages;

import controls.Button;
import org.openqa.selenium.By;

public class MenuPage {

    public Button logoutButton;

    public MenuPage(){
        logoutButton=new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    }
}
