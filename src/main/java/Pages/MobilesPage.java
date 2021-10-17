package Pages;

import Driver.DriverSingleton;
import Utils.Contants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobilesPage {
    private WebDriver driver;

    public MobilesPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "minPrice")
    private WebElement minPrice;

    @FindBy(id = "maxPrice")
    private WebElement maxPrice;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(1) > div.card_productWrapper__3EWiT > span > img")
    private WebElement firstProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.embla.breadcrumbs_breadcrumbs__6t7Rv.breadcrumb > div > div > div:nth-child(4) > a")
    private WebElement categoryConfirmation;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(2) > div.card_productWrapper__3EWiT > span > img")
    private WebElement secondProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(3) > div.card_productWrapper__3EWiT > span > img")
    private WebElement thirdProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(4) > div.card_productWrapper__3EWiT > span > img")
    private WebElement fourthProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(5) > div.card_productWrapper__3EWiT > span > img")
    private WebElement fifthProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(6) > div.card_productWrapper__3EWiT > span > img")
    private WebElement sixthProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(7) > div.card_productWrapper__3EWiT > span > img")
    private WebElement seventhProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(8) > div.card_productWrapper__3EWiT > span > img")
    private WebElement eightProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(9) > div.card_productWrapper__3EWiT > span > img")
    private WebElement ninthProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.layoutSidebar.grid > div:nth-child(2) > div > div:nth-child(2) > div.card-listing_gridCards__2Q-ZR.layout-grid_layoutGrid__lo7JX > a:nth-child(10) > div.card_productWrapper__3EWiT > span > img")
    private WebElement tenthProduct;

    @FindBy(css = "#__next > div > main > div > div.grid > div.pdp_gridCols__2n1ey.u-mb48 > div.grid > div:nth-child(1) > div > div.product-price_productPrice__1KrKT.u-spbwy8 > div.product-price_productPrice__1KrKT > span")
    private WebElement mobilePrice;

    public void addMinPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(minPrice));
        minPrice.sendKeys("40000");
    }
    public void addMaxPrice(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(maxPrice));
        maxPrice.clear();
        maxPrice.sendKeys("120000");
    }
    public void openFirstProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct));
        firstProduct.click();
    }
    public void openSecondProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(secondProduct));
        secondProduct.click();
    }
    public void openThirdProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(thirdProduct));
        thirdProduct.click();
    }
    public void openFourthProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(fourthProduct));
        fourthProduct.click();
    }
    public void openFifthProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(fifthProduct));
        fifthProduct.click();
    }
    public void openSixthProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(sixthProduct));
        sixthProduct.click();
    }
    public void openSeventhProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(seventhProduct));
        seventhProduct.click();
    }
    public void openEigthProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(eightProduct));
        eightProduct.click();
    }
    public void openNinthProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(ninthProduct));
        ninthProduct.click();
    }
    public void openTenthProduct(){
        WebDriverWait wait = new WebDriverWait(driver,Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(tenthProduct));
        tenthProduct.click();
    }
    public boolean checkMobileCategory() {
        WebDriverWait wait = new WebDriverWait(driver, Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(categoryConfirmation));
        return categoryConfirmation.getText().contains(Contants.MOBILE);
    }
    public boolean checkMobilePrice(){
        WebDriverWait wait = new WebDriverWait(driver, Contants.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(mobilePrice));
        String price = mobilePrice.getText();
        int pric = Integer.parseInt(price.replaceAll("[^0-9]","").toString());

        if (pric >= 40000 && pric <= 120000){
            System.out.println("Price of mobile is " + price + " and it is in given price range" );
            return true;

        }
        else  {
            System.out.println("Price of mobile is " + price + " and it is not in given price range");
            return false;

        }

    }
    public void navigateBack(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.navigate().back();
    }


}

