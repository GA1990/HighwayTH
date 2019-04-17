package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Lesson extends BrowserFactory{
    public static void main(String[] args)throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        // driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.xpath("//*[@id=\"u_0_k\"]/div[1]")).sendKeys("12345678q");
        driver.findElement(By.cssSelector(".uiButton")).sendKeys(Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("[data-testid='left_nav_item_Messenger']")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector("._1htf")).getText());
        driver.quit();
    }
}


