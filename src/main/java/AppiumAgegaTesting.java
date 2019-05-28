import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAgegaTesting {
    public static void main(String[] args) throws MalformedURLException {

        String searchText = "iPhone";

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");

        desiredCapabilities.setCapability("deviceName", "Samsung_Oleg");

        desiredCapabilities.setCapability("appPackage", "ua.slando");

        desiredCapabilities.setCapability("appActivity", "pl.tablica2.app.startup.activity.StartupActivity");

        //if set app capability application will be reinstalled each run

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);

        driver.findElement(By.id("com.android.packageinstaller:id/continue_button")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageButton")).click();
        driver.findElement(By.id("ua.slando:id/search_src_text")).sendKeys(searchText);


    }
}
