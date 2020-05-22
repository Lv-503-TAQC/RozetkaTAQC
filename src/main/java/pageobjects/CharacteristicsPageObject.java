package pageobjects;

import org.openqa.selenium.WebDriver;

import pageelements.HyperLink;

import static locators.CharacteristicsLocators.*;


public class CharacteristicsPageObject extends BasePageObject {
    private HyperLink screenSizeLink;
    private HyperLink processorValueLink;
    private HyperLink screenRefreshingRateLink;
    private HyperLink ramSizeValueLink;
    private HyperLink osTypeLink;
    private HyperLink colorLink;
    private HyperLink processorGenerationLink;
    private HyperLink keyboardValueLink;
    private HyperLink hddSizeLink;
    private HyperLink batteryLink;
    private HyperLink extraRamSlotsLink;
    private HyperLink producingCountryLink;
    private HyperLink brandCountryLink;
    private HyperLink guaranteeLink;



    public CharacteristicsPageObject(WebDriver driver) {
        super(driver);
    }

    public CharacteristicsPageObject screenSize() {
        screenSizeLink = new HyperLink(driver, SCREEN_SIZE_VALUE);
        return this;
    }

    public CharacteristicsPageObject processorValue() {
        processorValueLink = new HyperLink(driver, PROCESSOR_VALUE);
        return this;
    }

    public CharacteristicsPageObject screenRefreshingRate() {
        screenRefreshingRateLink = new HyperLink(driver, SCREEN_REFRESHING_RATE_VALUE);
        return this;
    }

    public CharacteristicsPageObject ramSizeValue() {
        ramSizeValueLink = new HyperLink(driver, RAM_SIZE_VALUE);
        return this;
    }

    public CharacteristicsPageObject osType() {
        osTypeLink = new HyperLink(driver, OS_TYPE_VALUE);
        return this;
    }

    public CharacteristicsPageObject color() {
        colorLink = new HyperLink(driver, COLOR_VALUE);
        return this;
    }

    public CharacteristicsPageObject processorGeneration() {
        processorGenerationLink = new HyperLink(driver, PROCESSOR_GENERATION_VALUE);
        return this;
    }

    public CharacteristicsPageObject keyboardValue() {
        keyboardValueLink = new HyperLink(driver, KEYBOARD_VALUE);
        return this;
    }

    public CharacteristicsPageObject hddSize() {
        hddSizeLink = new HyperLink(driver, HDD_SIZE_VALUE);
        return this;
    }

    public CharacteristicsPageObject battery() {
        batteryLink = new HyperLink(driver, BATTERY_VALUE);
        return this;
    }

    public CharacteristicsPageObject extraRamSlots() {
        extraRamSlotsLink = new HyperLink(driver, EXTRA_RAM_SLOTS);
        return this;
    }

    public CharacteristicsPageObject producingCountry() {
        producingCountryLink = new HyperLink(driver, PRODUCING_COUNTRY_VALUE);
        return this;
    }

    public CharacteristicsPageObject brandCountry() {
        brandCountryLink = new HyperLink(driver, BRAND_COUNTRY_VALUE);
        return this;
    }

    public CharacteristicsPageObject guarantee() {
        guaranteeLink = new HyperLink(driver, GUARANTEE);
        return this;
    }


}
