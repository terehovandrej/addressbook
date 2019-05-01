package Test1.tests;

import Test1.model.TestBase;
import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase {

  @Test
    public void contactCreationTest(){
        app.getNavigationHelper().goToNewContactPage();
        app.getContactHelper().fillContactCreation(new ContactData("Андрей", "Терехов", "Сергеевич", "terehov@gmail.com"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
