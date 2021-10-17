package Driver;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseDriverStrategy(String strategy){
        switch (strategy){
            case "Chrome" :
                return new Chrome();

            case "FireFox" :
                return new FireFox();

            default:
                return null;

        }
    }
}
