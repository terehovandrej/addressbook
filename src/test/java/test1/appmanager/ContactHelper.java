package test1.appmanager;

import test1.tests.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }
    public void fillContactCreation(ContactData contactData){
        type(By.name("firstname"), contactData.getName());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("email"), contactData.getEmail());

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

    public void deleteSelectedGroup() {
        click(By.xpath("//input[@value=\"Delete\"]"));
        driver.switchTo().alert().accept();
    }

    public void initContactModification() {
        click(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a/img"));
    }
}
