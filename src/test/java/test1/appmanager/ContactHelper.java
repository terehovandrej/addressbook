package test1.appmanager;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import test1.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContactCreation(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getName());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("email"), contactData.getEmail());

        if(creation){
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }
            else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }


    public void submitContactCreation(){
        click(By.name("submit"));
    }
    public void returnToHomePage(){
        click(By.linkText("home page"));
    }


    public void selectContact() {
        click(By.name("selected[]"));

    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value=\"Delete\"]"));
        driver.switchTo().alert().accept();
    }

    public void initContactModification() {
        click(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a/img"));
    }
    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactData contactData, boolean creation) {
        fillContactCreation(contactData, creation);
        submitContactCreation();
        returnToHomePage();
    }
}
