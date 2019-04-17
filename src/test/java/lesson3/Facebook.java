package lesson3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class Facebook {



    public static void main(String[] args)throws InterruptedException {
        //properties for deleting notifications
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put ("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        //System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://facebook.com");
       // driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("testforprom2019@gmail.com");
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("12345678q");
        driver.findElement(By.cssSelector(".uiButton")).sendKeys(Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("[data-testid='left_nav_item_Messenger']")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector("._1htf")).getText());
        driver.quit();
    }
}
