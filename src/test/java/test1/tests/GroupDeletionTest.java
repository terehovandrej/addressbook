package test1.tests;

import org.testng.annotations.*;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testDeleteGroup() {

        app.getNavigationHelper().goToGroupPage();
        app.getGrHelper().selectGroup();
        app.getGrHelper().deleteSelectedGroup();
        app.getGrHelper().returnToGroupPage();
    }
}
