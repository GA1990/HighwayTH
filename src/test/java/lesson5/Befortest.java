package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Befortest {
    public WebDriver driver;
    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

}