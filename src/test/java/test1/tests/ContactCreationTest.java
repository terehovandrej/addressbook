package test1.tests;

import test1.model.ContactData;
import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase {

  @Test
    public void contactCreationTest(){
        app.getNavigationHelper().goToNewContactPage();
        app.getContactHelper().fillContactCreation(new ContactData("Андрей", "Терехов", "Сергеевич", "terehov@gmail.com", "test1"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
