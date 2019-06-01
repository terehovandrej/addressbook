package test1.tests;

import org.testng.annotations.*;
import test1.model.GroupData;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testDeleteGroup() {

        app.getNavigationHelper().goToGroupPage();
        if (! app.getGrHelper().isThereAGroup()){
            app.getGrHelper().createGroup(new GroupData("test1", null, null));
        }

        app.getGrHelper().selectGroup();
        app.getGrHelper().deleteSelectedGroup();
        app.getGrHelper().returnToGroupPage();
    }
}
