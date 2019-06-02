package test1.tests;

import test1.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void groupModificationTest() {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGrHelper().isThereAGroup()){
            app.getGrHelper().createGroup(new GroupData("test1", null, null));
        }
        app.getGrHelper().selectGroup();
        app.getGrHelper().initGroupModification();
        app.getGrHelper().fillGroupCreation(new GroupData("тестапдейт1", "тестапдейт2", "тестапдейт3"));
        app.getGrHelper().submitGroupModification();
        app.getGrHelper().returnToGroupPage();
    }
}
