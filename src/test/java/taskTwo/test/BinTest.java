package taskTwo.test;

import taskTwo.driver.DriverSetup;
import taskTwo.page.BinCreationPage;
import taskTwo.page.BinPage;
import taskTwo.utils.PropertyLoader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BinTest extends DriverSetup {

    @Test
    public void createNewBin() throws InterruptedException {
        String defaultColor = PropertyLoader.loadProperty("default.color");
        BinCreationPage binCreationPage = new BinCreationPage(driver);
        String expectedNewPaste = binCreationPage.fillNewPaste()
                .getNewPasteText();
        binCreationPage.selectSyntaxHighlighting();
        String expectedNamePaste = binCreationPage.fillNameTitle()
                .getNamePasteText();
        binCreationPage.selectPasteExpiration()
                .clickCreateNewPaste();
        BinPage binPage = new BinPage(driver);
        Assert.assertEquals(binPage.getActualPaste(), expectedNewPaste, "Expected paste: " + expectedNewPaste + " wasn't found");
        Assert.assertEquals(binPage.getActualTitle(), expectedNamePaste, "Expected title: " + expectedNamePaste + " wasn't found");
        Assert.assertNotEquals(binPage.getColorOfBash(), defaultColor, "Bash has default color: " + defaultColor);
        Thread.sleep(4000);
    }
}
