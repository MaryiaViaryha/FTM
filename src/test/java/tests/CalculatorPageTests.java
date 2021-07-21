package tests;

import org.testng.annotations.Test;

public class CalculatorPageTests extends BaseTest{
    @Test

    public void calculatorTestCheckInformationInVmClassIsRegular(){

        calculatorPage.goTo()
                .goToGoogleCloudPlatformPricingCalculatorPage(Constanta.KEYFOROPENEDCALCULATOR)
                .sendKeyInToNumberOfInstancesField(Constanta.NUMBEROFINSTANCES)
                .selectSeriesOfMachine()
                .selectMachineType()
                .clickAddGpusCheckBox()
                .selectNumberOfGpus()
                .selectGpuType()
                .selectLocalSsd()
                .selectDataCenterLocation()
                .selectCommittedUsage()
                .pushAddToEstimate()
                .checkInformationInVmClassIsRegular();



    }

    @Test

    public void calculatorTestCheckInformationInInstanceTypeIncludeN1Standard8(){

        calculatorPage.goTo()
                .goToGoogleCloudPlatformPricingCalculatorPage(Constanta.KEYFOROPENEDCALCULATOR)
                .sendKeyInToNumberOfInstancesField(Constanta.NUMBEROFINSTANCES)
                .selectSeriesOfMachine()
                .selectMachineType()
                .clickAddGpusCheckBox()
                .selectNumberOfGpus()
                .selectGpuType()
                .selectLocalSsd()
                .selectDataCenterLocation()
                .selectCommittedUsage()
                .pushAddToEstimate()
                .checkInformationInInstanceTypeIncludeN1Standard8();



    }

    @Test

    public void calculatorTestCheckLocalSsdSpace2x375Gib(){

        calculatorPage.goTo()
                .goToGoogleCloudPlatformPricingCalculatorPage(Constanta.KEYFOROPENEDCALCULATOR)
                .sendKeyInToNumberOfInstancesField(Constanta.NUMBEROFINSTANCES)
                .selectSeriesOfMachine()
                .selectMachineType()
                .clickAddGpusCheckBox()
                .selectNumberOfGpus()
                .selectGpuType()
                .selectLocalSsd()
                .selectDataCenterLocation()
                .selectCommittedUsage()
                .pushAddToEstimate()
                .checkLocalSsdSpace2x375Gib();



    }

    @Test

    public void calculatorTestCheckRegionIsFrankfurt(){

        calculatorPage.goTo()
                .goToGoogleCloudPlatformPricingCalculatorPage(Constanta.KEYFOROPENEDCALCULATOR)
                .sendKeyInToNumberOfInstancesField(Constanta.NUMBEROFINSTANCES)
                .selectSeriesOfMachine()
                .selectMachineType()
                .clickAddGpusCheckBox()
                .selectNumberOfGpus()
                .selectGpuType()
                .selectLocalSsd()
                .selectDataCenterLocation()
                .selectCommittedUsage()
                .pushAddToEstimate()
                .checkRegionIsFrankfurt();



    }

    @Test

    public void calculatorTestCheckCommitmentTermOneYear(){

        calculatorPage.goTo()
                .goToGoogleCloudPlatformPricingCalculatorPage(Constanta.KEYFOROPENEDCALCULATOR)
                .sendKeyInToNumberOfInstancesField(Constanta.NUMBEROFINSTANCES)
                .selectSeriesOfMachine()
                .selectMachineType()
                .clickAddGpusCheckBox()
                .selectNumberOfGpus()
                .selectGpuType()
                .selectLocalSsd()
                .selectDataCenterLocation()
                .selectCommittedUsage()
                .pushAddToEstimate()
                .checkCommitmentTermOneYear();



    }

    @Test

    public void calculatorTestCheckTotalEstimatedCost(){

        calculatorPage.goTo()
                .goToGoogleCloudPlatformPricingCalculatorPage(Constanta.KEYFOROPENEDCALCULATOR)
                .sendKeyInToNumberOfInstancesField(Constanta.NUMBEROFINSTANCES)
                .selectSeriesOfMachine()
                .selectMachineType()
                .clickAddGpusCheckBox()
                .selectNumberOfGpus()
                .selectGpuType()
                .selectLocalSsd()
                .selectDataCenterLocation()
                .selectCommittedUsage()
                .pushAddToEstimate()
                .checkTotalEstimatedCost();



    }


}
