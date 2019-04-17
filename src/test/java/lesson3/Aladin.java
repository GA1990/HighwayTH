package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aladin {
    public WebDriver driver;

    @BeforeTest

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void myTest() {

        driver.get("http://liniakino.com/showtimes/aladdin/");
        driver.findElement(By.xpath("//*[@id=\"content-inner\"]/div/ul/li[3]/div[2]/div[1]/div/ul/li[5]/a")).click();
        WebElement iframeElem = driver.findElement(By.xpath("/html/body/div[4]"));
        driver.switchTo().frame(iframeElem);
        WebElement iframeElem2 = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div"));
        driver.switchTo().frame(iframeElem2);
        driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div/div")).click();

        List<WebElement> titles = driver.findElements(By.xpath("//*[@id=\"hall-scheme-container\"]/div"));
        for (WebElement we : titles) {
            System.out.println(we.getText());
        }
    }
}