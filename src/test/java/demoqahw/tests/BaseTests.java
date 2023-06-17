package demoqahw.tests;

import com.codeborne.selenide.Configuration;
import demoqahw.tests.testdata.TestData;
import org.junit.jupiter.api.BeforeAll;

public class BaseTests {
    TestData testData = new TestData();

    @BeforeAll
    static void beforeAll() {
//        System.setProperty("webdriver.chrome.driver", "C:/Progs/Chromedriver_win32/chromedriver.exe");
//        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
//        Configuration.browserVersion="100/0";
//        Configuration.holdBrowserOpen=true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }


}
