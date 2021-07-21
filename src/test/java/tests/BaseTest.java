package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CalculatorPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public CalculatorPage calculatorPage;

    @BeforeMethod
    public void start(){
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        calculatorPage = new CalculatorPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver(){
        driver.quit();
    }
}
