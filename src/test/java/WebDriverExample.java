import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.*;

public class WebDriverExample {
    public static WebDriver getDriver() {
        System.setProperty("webdriver.edge.driver", "src/main/resources/Edge/msedgedriver.exe");
        return new EdgeDriver();
    }

    public static void main(String[] args) throws InterruptedException {
    }
}
