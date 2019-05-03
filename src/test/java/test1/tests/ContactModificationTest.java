package test1.tests;

import test1.model.TestBase;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
    @Test
    public void contactModificationTest(){
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactCreation(new ContactData("Андрей", "Терехов", "Петрович", "te@mail.ru"));

    }
}
