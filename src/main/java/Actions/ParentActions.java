package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentActions {
    public static WebDriver driver;
    protected WebDriverWait wait ;

    public ParentActions() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(false);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("window-size=1920,1200");
        System.setProperty("webdriver.chrome.whitelistedIps", "");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
}
