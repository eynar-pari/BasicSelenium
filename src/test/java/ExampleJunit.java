import helpers.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExampleJunit {



    @Before
    public void openBrowser() {

    }

    @Test
    public void valid_UserCredential() {
        Session.getInstance().getDriver().get("http://todo.ly/");
        Session.getInstance().getDriver().findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img")).click();

        Session.getInstance().getDriver().findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("eynar.pari@gmail.com");
        Session.getInstance().getDriver().findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]")).sendKeys("Control123!");
        Session.getInstance().getDriver().findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]")).click();

        Session.getInstance().getDriver().findElement(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]")).click();
        Session.getInstance().getDriver().findElement(By.xpath("//*[@id=\"NewProjNameInput\"]")).sendKeys("MySeleniumProject");
        Session.getInstance().getDriver().findElement(By.xpath("//*[@id=\"NewProjNameButton\"]")).click();



    }

    @After
    public void closeBrowser() {
     //  Session.getInstance().getDriver().quit();
    }
}
