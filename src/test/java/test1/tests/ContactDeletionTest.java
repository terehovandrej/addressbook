package test1.tests;

import test1.model.TestBase;
import org.testng.annotations.Test;

public class ContactDeletionTest  extends TestBase  {
    @Test
    public void contactDeletionTest (){
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedGroup();
    }
}