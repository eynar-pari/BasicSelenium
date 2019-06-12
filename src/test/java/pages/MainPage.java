package pages;

import controls.Imagen;
import org.openqa.selenium.By;

public class MainPage {
    public Imagen loginImage;

    public MainPage(){
        loginImage= new Imagen(By.xpath("//a/img[@src='/Images/design/pagelogin.png']"));
    }
}
