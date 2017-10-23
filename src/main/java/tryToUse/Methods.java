package tryToUse;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SChubuk on 20.10.2017.
 */
public class Methods {
    //private static final Logger log = Logger.getLogger(Log4J.class);
    private static final Logger log = Logger.getLogger("devpinoyLogger");
    public static void method(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.quit();
        log.warn("END");
    }
}
