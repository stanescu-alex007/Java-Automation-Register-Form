package tests;

import Utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class BaseUITest {
    WebDriver driver;
    String url;
    String signUpPath;
    String browser;
    String signupPageUrl;

    @BeforeClass
    public void setUp() throws IOException {
        Properties properties = SeleniumUtils.readProperties("src\\test\\resources\\application.properties");
        url = properties.getProperty("url");
        signUpPath = properties.getProperty("signUpPath");
        browser = properties.getProperty("browser");
        signupPageUrl = url + signUpPath;

        System.out.println("Default browser: " + browser);
        System.out.println("Page under test: " + signupPageUrl);

    }

    @Test
    public void demoTest(){

    }

}
