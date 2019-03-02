package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;

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
