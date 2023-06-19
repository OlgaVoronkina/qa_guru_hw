package github;

import demoqahw.tests.BaseTests;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest1 extends BaseTests {
    @Owner(value = "Olga Voronkina")
    @Description("Домашнее задание к уроку Selenide#1")
    @Test
    void checkPageSoftAssertions() {
        open("https://github.com/selenide/selenide"); // Откройте страницу Selenide в Github
        $("#wiki-tab").click();                                     // - Перейдите в раздел Wiki проекта
        $("#wiki-pages-filter").val("SoftAssertions");              // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("div.wiki-rightbar a[href*='SoftAssertions']").shouldHave(text("SoftAssertions")).click();
        $("a[id*=junit5]").closest("h4").shouldHave(text("JUnit5"));  // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("a[id*=junit5]").closest("h4").sibling(0).shouldHave(text
                ("@Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}"));;
    }
}
