package Driver;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;

    public DriverSingleton(String driver){
        instantiate(driver);

    }
    public WebDriver instantiate(String strategy){
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseDriverStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;

    }
    public static DriverSingleton getInstance(String driver) {
        if(instance == null){
            instance = new DriverSingleton(driver);
        }
        return instance;
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
