package demoqaHW;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormTests extends BaseTests {
    @Owner(value = "Olga Voronkina")
    @Description("Проверка формы Student Registration Form - позитивный кейс")
    @Test
    void successRegistrationFormTest() {
        String firstName = "Olga";
        String lastName = "Voronkina";
        String userEmail = "olya@test.com";
        String gender = "Female";
        String mobileNumber = getRandomNumberBetweenRange();
        String dayOfBirth = "3";
        String monthOfBirth = "May";
        String yearOfBirth = "1995";
        String subjects = "Computer Science";
        String hobbies = "Sports";
        String currentAddress = generateRandomString(20);
        String state = "Haryana";
        String city = "Karnal";
        String fileName="testfile.png";

        open("/automation-practice-form");

        $(By.xpath("//*[@id='firstName']")).setValue(firstName);
        $(By.xpath("//*[@id='lastName']")).setValue(lastName);
        $(By.xpath("//*[@id='userEmail']")).setValue(userEmail);
        $(By.xpath("//label[.='"+gender+"']")).click();
        $(By.xpath("//*[@id='userNumber']")).setValue(mobileNumber);
        this.inputDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth);
        $(By.xpath("//*[@id='subjectsInput']")).setValue(subjects).pressEnter();
        $(By.xpath("//label[.='"+hobbies+"']")).click();
        uploadFile("//*[@id='uploadPicture']", fileName);
        $(By.xpath("//*[@id='currentAddress']")).setValue(currentAddress);
        $(By.xpath("//*[@id='state']")).click();
        $(By.xpath("//*[.='"+state+"']")).click();
        $(By.xpath("//*[@id='city']")).click();
        $(By.xpath("//*[.='"+city+"']")).click();

        $(By.xpath("//button[@id='submit']")).click();

        $(By.xpath("//div[@class='table-responsive']//td[text()='Student Name']/following-sibling::td")).shouldHave(text(firstName + " " + lastName));
        $(By.xpath("//div[@class='table-responsive']//td[text()='Student Email']/following-sibling::td")).shouldHave(text(userEmail));
        $(By.xpath("//div[@class='table-responsive']//td[text()='Gender']/following-sibling::td")).shouldHave(text(gender));
        $(By.xpath("//div[@class='table-responsive']//td[text()='Mobile']/following-sibling::td")).shouldHave(text(mobileNumber));
        $(By.xpath("//div[@class='table-responsive']//td[text()='Date of Birth']/following-sibling::td")).shouldHave(text(dayOfBirth +" "+monthOfBirth+","+yearOfBirth));
        $(By.xpath("//div[@class='table-responsive']//td[text()='Subjects']/following-sibling::td")).shouldHave(text(subjects));
        $(By.xpath("//div[@class='table-responsive']//td[text()='Hobbies']/following-sibling::td")).shouldHave(text(hobbies));
        $(By.xpath("//div[@class='table-responsive']//td[text()='Picture']/following-sibling::td")).shouldHave(text(fileName));
        $(By.xpath("//div[@class='table-responsive']//td[text()='Address']/following-sibling::td")).shouldHave(text(currentAddress));
        $(By.xpath("//div[@class='table-responsive']//td[text()='State and City']/following-sibling::td")).shouldHave(text(state +" "+city));
    }

    public void inputDateOfBirth(String day, String month, String year){
        $(By.xpath("//*[@id='dateOfBirthInput']")).click();
        $(By.xpath("//select[contains(@class,'month-select')]")).click();
        $(By.xpath(String.format("//option[.='%s']",month))).click();
        $(By.xpath("//select[contains(@class,'year-select')]")).click();
        $(By.xpath(String.format("//option[.='%s']",year))).click();
        $(By.xpath(String.format("//div[contains(@aria-label,'"+month+"')and contains(@aria-label,'"+day+"')]"))).click();
    }

}
