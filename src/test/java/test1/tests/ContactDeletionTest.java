package test1.tests;

import org.testng.annotations.Test;
import test1.model.ContactData;

public class ContactDeletionTest  extends TestBase  {
    @Test
    public void contactDeletionTest (){
        //предусловие
        app.getNavigationHelper().goToContactPage();
            if(! app.getContactHelper().isThereAContact()){
                app.getNavigationHelper().goToNewContactPage();
                app.getContactHelper().createContact(new ContactData("Андрей", "Терехов", "Сергеевич", "terehov@gmail.com", "test1"), true);
            }
        //тест
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
    }
}
