import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_site_funct {

    public class test_functions{

        private WebDriver driver;

        @Before
        public void setUp(){
            System.setProperty("webdriver.gecko.driver", "E:\\Projects\\SoftDev\\Automations\\geckodriver-v0.21.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();

        }

        @Test
        public void testFunctions(){
            driver.manage().window().maximize();
            driver.get("http://www.facebook.com");

        }

        @After       public void tearDown(){
//            driver.quit();

        }

    }

}
