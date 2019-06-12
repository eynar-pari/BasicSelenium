import helpers.Session;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LeftMenuPage;
import pages.LoginPage;
import pages.MainPage;
import pages.MenuPage;

public class ExampleJunit3 {


    LoginPage loginPage= new LoginPage();
    MainPage mainPage= new MainPage();
    MenuPage menuPage= new MenuPage();
    LeftMenuPage leftMenuPage= new LeftMenuPage();

    @Before
    public void init(){
        Session.getInstance().getDriver().get("http://todo.ly/");
    }

    @Test
    public void valid_UserCredential() {
        String expectedResultName="TEST50";

       mainPage.loginImage.click();

       loginPage.emailField.set("eynar.pari@gmail.com");
       loginPage.passwordField.set("Control123!");
       loginPage.loginButton.click();

        leftMenuPage.addNewProjectButton.click();
        leftMenuPage.nameProjectText.set(expectedResultName+"ABC");
        leftMenuPage.addButton.click();

        this.waitTimeSeconds(2);
        leftMenuPage.selectProject(expectedResultName+"ABC");
        leftMenuPage.menuIcon.click();
        leftMenuPage.editButton.click();
        leftMenuPage.editNameProjectText.set(expectedResultName);
        leftMenuPage.saveButton.click();

        this.waitTimeSeconds(2);
        leftMenuPage.selectProject(expectedResultName);
        leftMenuPage.menuIcon.click();
        leftMenuPage.deleteButton.click();

        // manejo de alertas
        Session.getInstance().getDriver().switchTo().alert().accept();

        this.waitTimeSeconds(2);
        // verificaion delete
        Assert.assertFalse("Projecto no fue borrado",leftMenuPage.isDisplayedProj(expectedResultName));

    }

    public void waitTimeSeconds(int number){
        try {
            Thread.sleep(number*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
