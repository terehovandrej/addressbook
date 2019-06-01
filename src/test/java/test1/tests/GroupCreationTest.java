package test1.tests;
import test1.model.GroupData;
import org.testng.annotations.*;
public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation  () {

        app.getNavigationHelper().goToGroupPage();
        app.getGrHelper().createGroup(new GroupData("test1", null, null));

    }

}
