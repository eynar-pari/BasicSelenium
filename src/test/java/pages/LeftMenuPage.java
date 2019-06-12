package pages;

import controls.Button;
import controls.Icon;
import controls.Link;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftMenuPage {


    public Button addNewProjectButton;
    public Button addButton;
    public TextBox nameProjectText;
    public TextBox editNameProjectText;
    public Icon menuIcon;
    public Button deleteButton;
    public Button editButton;
    public Button saveButton;
    public LeftMenuPage(){
        addNewProjectButton= new Button(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]"));
        addButton= new Button(By.id("NewProjNameButton"));
        nameProjectText= new TextBox(By.id("NewProjNameInput"));
        menuIcon = new Icon(By.xpath("//div[contains(@style,'block')]/img[@src='/Images/dropdown.png']"));
        deleteButton = new Button(By.xpath("//*[@id=\"ProjShareMenuDel\"]"));
        editButton=new Button(By.xpath("//*[@id=\"projectContextMenu\"]/li[@class='edit']/a"));
        editNameProjectText=new TextBox(By.id("ItemEditTextbox"));
        saveButton=new Button( By.id("ItemEditSubmit"));


    }

    public void selectProject(String nameProj){

        String locator ="//li/div/table/tbody/tr/td[contains(.,\""+nameProj+"\")]";
        Link nameProjectLink = new Link(By.xpath(locator));
        nameProjectLink.click();
    }

    public boolean isDisplayedProj(String nameProj){
        String locator ="//li/div/table/tbody/tr/td[contains(.,\""+nameProj+"\")]";
        Link nameProjectLink = new Link(By.xpath(locator));
        return nameProjectLink.isDisplayed();
    }
}
