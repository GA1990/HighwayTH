package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ImdbExampl {


    public WebDriver driver;

    @BeforeTest

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Test
    public void myTest() {
        driver.get("https://www.imdb.com/chart/top");
//*[@class='titleColumn']//a
        List<WebElement> titles = driver.findElements(By.xpath("//*[@class='titleColumn']//a"));
        for (WebElement we : titles) {
            System.out.println(we.getText());
        }

        List<WebElement> titles2 = driver.findElements(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody"));
        for (WebElement we : titles2) {
            System.out.println(we.getText());

        }

        }

        /*@AfterTest
        public void tearDown(){
            driver.quit();
        }*/
        }


