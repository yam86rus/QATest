package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver86\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Start");
    }

    @After
    public void close() {
        System.out.println("Test close");
        driver.quit();
    }
}
