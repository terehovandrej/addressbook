package test1.model;

import org.openqa.selenium.remote.BrowserType;
import test1.appmanager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass(alwaysRun = true)
    public void SetUp() {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }
}

