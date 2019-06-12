package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Session {
    private static Session ourInstance = null;
    private WebDriver driver;

    public static Session getInstance() {

        if (ourInstance == null)
            ourInstance= new Session();

        return ourInstance;
    }

    public WebDriver getDriver(){
        return driver;
    }

    private Session() {
        String PATH_PROJECT = new File(".").getAbsolutePath().replace(".", "");

        System.setProperty("webdriver.chrome.driver", (PATH_PROJECT+"src+test+java+drivers+windows+chromedriver.exe").replace("+",File.separator));
        Map<String, Object> prefs = new HashMap<String, Object>();

        prefs.put("credentials_enable_service", false);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-memory-info");
        options.addArguments("--no-sandbox");
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
