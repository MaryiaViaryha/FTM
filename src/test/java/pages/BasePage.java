package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

   public class BasePage {
       protected WebDriver driver;
       protected WebDriverWait wait;

       public BasePage(WebDriver driver) {
           this.driver = driver;
           this.wait = new WebDriverWait(driver, 30L);
       }

       public void waitVisibility(By elementBy) {
           this.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
       }

       public void clickByElement(By elementBy) {
           this.waitVisibility(elementBy);
           this.driver.findElement(elementBy).click();
       }

       public void isElementDisplayed(By elementBy) {
           this.waitVisibility(elementBy);

           assert this.driver.findElement(elementBy).isDisplayed();

       }

       public void sendTextWithCheking(By elementBy, String TextToField) {
           this.waitVisibility(elementBy);
           this.driver.findElement(elementBy).clear();
           this.driver.findElement(elementBy).sendKeys(new CharSequence[]{TextToField});
       }

       public void sendEnter(By elementBy) {
           this.waitVisibility(elementBy);
           this.driver.findElement(elementBy).sendKeys(new CharSequence[]{Keys.ENTER});
       }

       public void selectItemFromDropdown(String dropDownItem) {
           List<WebElement> dropDownOptions = this.driver.findElements(By.xpath("//li[@role='option']"));
           dropDownOptions.stream().filter((opt) -> {
               return opt.getText().equals(dropDownItem);
           }).findFirst().ifPresent(WebElement::click);
       }

       public void checkBox(By elementBy) {
           this.waitVisibility(elementBy);
           this.driver.findElement(elementBy).click();
       }

       public String getTextFromElement(By elementBy) {
           this.waitVisibility(elementBy);
           String Totalresult = this.driver.findElement(elementBy).getText();
           return Totalresult;
       }

   }
