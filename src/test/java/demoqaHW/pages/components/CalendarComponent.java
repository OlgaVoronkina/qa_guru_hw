package demoqaHW.pages.components;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class CalendarComponent {

    public void setDate(String day, String month, String year) {
        $(By.xpath("//select[contains(@class,'month-select')]")).click();
        $(By.xpath(String.format("//option[.='%s']",month))).click();
        $(By.xpath("//select[contains(@class,'year-select')]")).click();
        $(By.xpath(String.format("//option[.='%s']",year))).click();
        $(By.xpath(String.format("//div[contains(@aria-label,'"+month+"')and contains(@aria-label,'"+day+"')]"))).click();
    }
}
