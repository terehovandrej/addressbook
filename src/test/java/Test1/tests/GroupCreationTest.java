package Test1.tests;
import Test1.model.TestBase;
        import org.testng.annotations.*;
public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation  () {

        app.getNavigationHelper().goToGroupPage();
        app.getGrHelper().initGroupCreation();
        app.getGrHelper().fillGroupCreation(new GroupData("test1", "test2", "test3"));
        app.getGrHelper().submitGroupCreation();
        app.getGrHelper().returnToGroupPage();
    }

}
