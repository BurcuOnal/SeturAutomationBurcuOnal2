package BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Base {


    protected static WebDriver driver;
    protected static WebDriverWait webDriverWait;
    protected String baseUrl = "https://www.setur.com.tr/";
    DesiredCapabilities capabilities = new DesiredCapabilities();
    ChromeOptions options = new ChromeOptions();



    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        options.setExperimentalOption("w3c", false);
        options.addArguments("--disable-notifications");
        options.addArguments("disable-popup-blocking");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, 45, 150);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @After
    public void close() {
        driver.quit();
    }
}
