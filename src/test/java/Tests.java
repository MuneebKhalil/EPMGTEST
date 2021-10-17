import Driver.DriverSingleton;
import Pages.HomePage;
import Pages.MobilesPage;
import Utils.Contants;
import Utils.FrameworkProperties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests {
   static FrameworkProperties frameworkProperties;
   static WebDriver driver;
   static HomePage homePage;
   static MobilesPage mobilesPage;

   @BeforeClass
   public static void initializeObjects(){
        frameworkProperties = new FrameworkProperties();
        DriverSingleton.getInstance(frameworkProperties.getProperty(Contants.BROWSER));
        homePage = new HomePage();
        mobilesPage = new MobilesPage();
        driver = DriverSingleton.getDriver();
   }

   @Test
   public  void test01TestingNavigation(){
      driver.get(Contants.URL);
      homePage.clickAllCategories();
      homePage.clickMobileAndTablets();
      homePage.clickMobiles();
   }
   @Test
   public void test02TestingFirstProduct(){
      mobilesPage.addMinPrice();
      mobilesPage.addMaxPrice();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openFirstProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());
   }
   @Test
   public void test03TestingSecondProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openSecondProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @Test
   public void test04TestingThirdProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openThirdProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @Test
   public void test05TestingFourthProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openFourthProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @Test
   public void test06TestingFifthProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openFifthProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @Test
   public void test07TestingSixthProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openSixthProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @Test
   public void test08TestingSeventhProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openSeventhProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @Test
   public void test09TestingEighthProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openEigthProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @Test
   public void test10TestingNinthProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openNinthProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @Test
   public void test11TestingTenthProduct(){
      mobilesPage.navigateBack();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      mobilesPage.openTenthProduct();
      assertEquals(true,mobilesPage.checkMobileCategory());
      assertEquals(true,mobilesPage.checkMobilePrice());

   }
   @AfterClass
   public static void closeObjects(){
      driver.quit();
   }

}
