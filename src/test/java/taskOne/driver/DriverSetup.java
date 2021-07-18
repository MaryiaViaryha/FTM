package taskOne.driver;

import taskOne.utils.PropertyLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverSetup {

    protected static final String TARGET_URL = PropertyLoader.loadProperty("target.url");

    protected WebDriver driver;

    @BeforeMethod
    public void setUpBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(TARGET_URL);
    }

    @AfterMethod
    public void tearDownBrowser() {
        driver.close();
        driver = null;
    }
}