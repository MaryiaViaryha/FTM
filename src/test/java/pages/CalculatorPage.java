package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CalculatorPage extends BasePage {

    String SITE_URL = "https://cloud.google.com/";
    //div[@class='gs-title']//*[@href='https://cloud.google.com/products/calculator']
    private By devSiteSearch = By.className("devsite-search-form");
    private By googleSearch = By.xpath("//input[@class='devsite-search-field devsite-search-query']");
    private By switchToCalculator = By.xpath("//div[@class='gs-title']//*[@href='https://cloud.google.com/products/calculator']");
    //private By switchToCalculator = By.xpath("(//*[text()='Google Cloud Platform Pricing Calculator']/parent::a)[1]");
    private By newFirstFrame = By.xpath("//iframe[contains(@name,'goog_')]");
    private By instancesField = By.xpath("//input[@ng-model='listingCtrl.computeServer.quantity']");
    private By seriesOfMachine = By.xpath("//md-select[@name='series']/parent::md-input-container");
    private By seriesOfMachineModel = By.xpath("//md-option[@value='n1']");
    private By machineType = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    private By computeEngine = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    private By gpusCheckBox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
    private By numberOfGpus = By.xpath("//md-select[@placeholder='Number of GPUs']");
    private By numberOfGpusModel = By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]");
    private By gpuType = By.xpath("//md-select[@placeholder='GPU type']");
    private By gpuTypeModel = By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
    private By localSsd = By.xpath("//md-select[@placeholder='Local SSD']");
    private By localSsdModel = By.cssSelector("md-option[value='2'][ng-repeat='item in listingCtrl.dynamicSsd.computeServer']");
    private By dataCenterLocation = By.xpath("//md-select[@placeholder='Datacenter location']");
    private By dataCenterLocationInFrankfurt = By.cssSelector("md-select-menu[class='md-overflow']" +
            " md-option[value='europe-west3'][ng-repeat*='fullRegionList']");
    private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");
    private By oneYearUsage = By.cssSelector("div[class='md-select-menu-container md-active md-clickable']" +
            " md-option[value='1'][class='md-ink-ripple']");
    private By addToEstimateButton = By.xpath("//button[@aria-label='Add to Estimate']");
    private By informationInVmClassIsRegular = By.xpath("//div[contains (text(),'VM class: regular')]");
    private By InformationInInstanceTypeIncludeN1Standard8 =
            By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");
    private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");
    private By localSsdSpace2x375Gib = By.xpath("//div[contains (text(),'Total available local SSD space 2x375 GiB')]");
    private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");
    private By totalEstimatedCost = By.xpath("//*[contains(text(),'Total Estimated Cost:')]");



    public CalculatorPage (WebDriver driver) {
        super(driver);
    }

    public  CalculatorPage goTo() {
        driver.get(SITE_URL);
        return this;
    }

    public CalculatorPage goToGoogleCloudPlatformPricingCalculatorPage(String keyForCalculatorPageOpening) {
        clickByElement (devSiteSearch);
        clickByElement (googleSearch);
        sendTextWithCheking(googleSearch,keyForCalculatorPageOpening);
        sendEnter(googleSearch);
        clickByElement(switchToCalculator);
        switchToFrame(newFirstFrame);
        return this;
    }


    public CalculatorPage sendKeyInToNumberOfInstancesField(String keyForNumberOfInstances) {
        sendTextWithCheking(instancesField,keyForNumberOfInstances);
        return this;
    }


    public void switchToFrame (By elementBy) {
        WebElement element = driver.findElement(elementBy);
        driver.switchTo().frame(element);
        driver.switchTo().frame("myFrame");

    }

    public CalculatorPage selectSeriesOfMachine() {
        clickByElement(seriesOfMachine);
        clickByElement(seriesOfMachineModel);
        return this;
    }

    public CalculatorPage selectMachineType() {
        clickByElement(machineType);
        clickByElement(computeEngine);
        return this;
    }

    public CalculatorPage clickAddGpusCheckBox() {
        clickByElement(gpusCheckBox);
        return this;
    }

    public CalculatorPage selectNumberOfGpus() {
        clickByElement(numberOfGpus);
        clickByElement(numberOfGpusModel);
        return this;
    }

    public CalculatorPage selectGpuType() {
        clickByElement(gpuType);
        clickByElement(gpuTypeModel);
        return this;
    }

    public CalculatorPage selectLocalSsd() {
        clickByElement(localSsd);
        clickByElement(localSsdModel);
        return this;
    }

    public CalculatorPage selectDataCenterLocation() {
        clickByElement(dataCenterLocation);
        clickByElement(dataCenterLocationInFrankfurt);
        return this;
    }

    public CalculatorPage selectCommittedUsage() {
        clickByElement(committedUsage);
        clickByElement(oneYearUsage);
        return this;
    }

    public CalculatorPage pushAddToEstimate() {
        clickByElement(addToEstimateButton);
        return this;
    }

    public CalculatorPage checkInformationInVmClassIsRegular(){
        isElementDisplayed(informationInVmClassIsRegular);
        return this;
    }

    public CalculatorPage checkInformationInInstanceTypeIncludeN1Standard8(){
        isElementDisplayed(InformationInInstanceTypeIncludeN1Standard8);
        return this;
    }

    public CalculatorPage checkRegionIsFrankfurt(){
        isElementDisplayed(regionIsFrankfurt);
        return this;
    }

    public CalculatorPage checkLocalSsdSpace2x375Gib(){
        isElementDisplayed(localSsdSpace2x375Gib);
        return this;
    }

    public CalculatorPage checkCommitmentTermOneYear(){
        isElementDisplayed(commitmentTermOneYear);
        return this;
    }
    public String checkTotalEstimatedCost () {
        String TotalEstimatedCost = driver.findElement(By.xpath("//*[@id='resultBlock']")).getText();
        return TotalEstimatedCost;
    }


}
