package test1.appmanager;

import test1.tests.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GrHelper extends HelperBase {

    public GrHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupCreation(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroup() {

        click(By.name("delete"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }


    public void submitGroupModification() {
        click(By.name("update"));
    }
}
