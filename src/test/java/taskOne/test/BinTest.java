package taskOne.test;

import taskOne.driver.DriverSetup;
import taskOne.page.BinCreationPage;
import org.testng.annotations.Test;

public class BinTest extends DriverSetup {

    @Test
    public void createNewBin() throws InterruptedException {

        BinCreationPage binCreationPage = new BinCreationPage(driver);
        binCreationPage.fillNewPaste()
                .selectPasteExpiration()
                .fillNameTitle()
                .clickCreateNewPaste();
        Thread.sleep(3000);
    }
}
