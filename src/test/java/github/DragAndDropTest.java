package github;

import com.codeborne.selenide.SelenideElement;
import demoqahw.tests.BaseTests;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest extends BaseTests {
    @Owner("Olga Voronkina")
    @DisplayName("Домашнее задание к уроку Selenide#2 - (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()")
    @Test
    void dragAndDropTest() {
        SelenideElement a = $("#column-a");
        SelenideElement b = $("#column-b");
//        - Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        a.shouldHave(text("A"));
        b.shouldHave(text("B"));

//        - Перенесите прямоугольник А на место В

// 1 Способ - by dragAndDropTo - работает
        a.dragAndDropTo(b);
// 2 Способ - by dragAndDropTo - работает
//        a.dragAndDrop(DragAndDropOptions.to(b));
// 3 Способ - by actions -не работает!
//        actions().dragAndDrop(a,b).perform();
// 4 способ - by actions - не работает!
//        actions().clickAndHold(a).moveToElement(b).perform();

//        - Проверьте, что прямоугольники действительно поменялись
        a.shouldHave(text("B"));
        b.shouldHave(text("A"));
    }
}
