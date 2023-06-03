package github;

import com.codeborne.selenide.Condition;
import demoqaHW.BaseTests;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest1 extends BaseTests {
    @Owner(value = "Olga Voronkina")
    @Description("Домашнее задание к уроку Selenide#1")
    @Test
    void checkPageSoftAssertions() {
        open("https://github.com/selenide/selenide"); // Откройте страницу Selenide в Github
        $("#wiki-tab").click();                                     // - Перейдите в раздел Wiki проекта
        $("#wiki-pages-filter").val("SoftAssertions");              // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("div.wiki-rightbar a[href*='SoftAssertions']").shouldHave(Condition.text("SoftAssertions")).click();
        $("a[id*=junit5]").closest("h4").shouldHave(Condition.text("JUnit5"));  // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $$(By.xpath("//a[contains(@id, 'junit5')]/ancestor::h4/following-sibling::div[1]//span")).findBy(Condition.text("Test")).shouldBe(Condition.visible);
    }
}
