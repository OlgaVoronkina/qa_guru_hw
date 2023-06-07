package demoqaHW;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;

import java.io.File;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class BaseTests {
    @Owner("Olga Voronkina")
    @BeforeAll
    static void beforeAll() {
//        System.setProperty("webdriver.chrome.driver", "C:/Progs/Chromedriver_win32/chromedriver.exe");
//        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
//        Configuration.browserVersion="100/0";
        Configuration.holdBrowserOpen=true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    /**
     * генерация рандомной строки заданной длины
     */
    public static String generateRandomString(int length) {
        final String characters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    /**
     * генерация рандомной строки (из цифр) в указанном диапазоне
     */
    public static  String getRandomNumberBetweenRange(){
        int min = 111111111;
        int max = 999999999;
        int x = (int) ((Math.random()*((max-min)+1))+min);
        String randomNumber = "7" + String.valueOf(x);
        return randomNumber;
    }

    /**
     * загрузка файла
     * на вход: локатор поля, название файла
     */
    public void uploadFile(String fieldLocator, String fileName){
        File file = new File("src/test/resources/"+fileName+"");
        $(By.xpath(""+fieldLocator+"")).uploadFile(file);
    }
}
