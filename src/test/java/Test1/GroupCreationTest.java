package Test1;
import org.testng.annotations.*;
public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation  () {

        goToGroupPage();
        initGroupCreation();
        fillGroupCreation(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
