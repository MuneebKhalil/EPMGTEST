package Pages;

import Driver.DriverSingleton;
import Utils.Contants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;

    public HomePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#__next > div > header > div.navbar_navbarMegaMenu__2hOq4 > div > div > div > button")
    private WebElement allCategories;

    @FindBy(css = "#__next > div > header > div.navbar_navbarMegaMenu__2hOq4 > div > div > div > div > div > ul > li:nth-child(2) > a > div > span")
    private WebElement mobileAndTablets;

    @FindBy(css = "#__next > div > header > div.navbar_navbarMegaMenu__2hOq4 > div > div > div > div > ul:nth-child(2) > li.mega-menu_active__1Gny0 > a > span")
    private WebElement mobiles;


    public void clickAllCategories(){
        WebDriverWait wait = new WebDriverWait(driver, Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(allCategories));
        allCategories.click();
    }
    public void clickMobileAndTablets() {
        WebDriverWait wait = new WebDriverWait(driver, Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(mobileAndTablets));
        mobileAndTablets.click();
    }
    public void clickMobiles() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(mobiles));
        mobiles.click();
    }
}
