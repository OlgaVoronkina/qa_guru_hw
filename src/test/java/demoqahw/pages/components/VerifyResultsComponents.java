package demoqahw.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class VerifyResultsComponents {

    SelenideElement table = $(".table-responsive");

    public void verifyResult(String key, String value) {
        table.$(byText(key)).sibling(0).shouldHave(text(value));
    }
}
