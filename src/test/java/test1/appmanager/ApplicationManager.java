package test1.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private SessionHelper sessionHelper;
    private WebDriver driver;
    private NavigationHelper navigationHelper;
    private GrHelper grHelper;
    private ContactHelper contactHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() {

        if (browser.equals(BrowserType.FIREFOX)){
            System.setProperty("webdriver.chrome.driver", "C:\\java\\addressbook/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if(browser.equals(BrowserType.IE)) {
            driver = new InternetExplorerDriver();
            System.setProperty("webdriver.chrome.driver", "C:\\java\\addressbook/IEDriverServer.exe");
        } else if (browser.equals(BrowserType.CHROME)){
            System.setProperty("webdriver.chrome.driver", "C:\\java\\addressbook/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        grHelper = new GrHelper(driver);
        contactHelper = new ContactHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("user", "secret");
    }


    public void stop() {
        navigationHelper.driver.quit();
    }


    public GrHelper getGrHelper() {
        return grHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
