import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_log {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "E:\\Projects\\SoftDev\\Automations\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();

    }

    @Test
    public void testLogin(){
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("gethacked@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("themostsecretpassword");
        driver.findElement(By.id("u_0_2")).click();
        driver.navigate().back();
    }

    @After
    public void tearDown(){
        driver.quit();

    }

}
