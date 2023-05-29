package demoqaLessons;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll(){
        System.setProperty("webdriver.chrome.driver", "C:/Progs/Chromedriver_win32/chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.browserSize="1920x1080";
//        Configuration.browserVersion="100/0";
//        Configuration.holdBrowserOpen=true;
        Configuration.baseUrl="https://demoqa.com";

    }

    @Test
    void successTest(){
        open("/text-box");
        $("#userName").setValue("Olga Voronkina");
        $("#userEmail").setValue("olga@test.com");
        $("#currentAddress").setValue("current address");
        $("#permanentAddress").setValue("permanent address");
        $("#submit").click();

        $("#output #name").shouldHave(Condition.text("Olga Voronkina"));
        $("#output #email").shouldHave(Condition.text("olga@test.com"));
        $("#output #currentAddress").shouldHave(Condition.text("current address"));
        $("#output #permanentAddress").shouldHave(Condition.text("permanent address"));


    }

}
