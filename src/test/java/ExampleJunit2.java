import helpers.Session;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.MenuPage;

public class ExampleJunit2 {


    LoginPage loginPage= new LoginPage();
    MainPage mainPage= new MainPage();
    MenuPage menuPage= new MenuPage();

    @Before
    public void init(){
        Session.getInstance().getDriver().get("http://todo.ly/");
    }

    @Test
    public void valid_UserCredential() {

       mainPage.loginImage.click();

       loginPage.emailField.set("eynar.pari@gmail.com");
       loginPage.passwordField.set("Control123!");
       loginPage.loginButton.click();

       // Verificacion
        Assert.assertTrue("ERROR ! logout button no es mostrado",
                menuPage.logoutButton.isDisplayed());

        String actualResult=menuPage.logoutButton.getText();
        String expectedResult="Logout";
        Assert.assertEquals("ERROR !",expectedResult,actualResult);


         // Crear

         // Update

         // Delete
    }
}
