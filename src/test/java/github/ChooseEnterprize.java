package github;

import com.codeborne.selenide.Condition;
import demoqaHW.BaseTests;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ChooseEnterprize extends BaseTests {
    @Owner("Olga Voronkina")
    @DisplayName("Домашнее задание к уроку Selenide#2 - hover")
    @Test
    void chooseEnterprize() {
//        На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $("a[href='/enterprise']").click();
//        Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
        $(byText("Build like the best")).shouldBe(Condition.visible);
    }
}
