package demoqahw.tests;

import demoqahw.pages.RegistrationPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

public class RegistrationFormTests extends BaseTests {

    RegistrationPage registrationPage = new RegistrationPage();

    @Owner(value = "Olga Voronkina")
    @Description("Проверка формы Student Registration Form - позитивный кейс")
    @Test
    void successRegistrationFormTest() {

        String studentName = "Olga";
        String studentLastName = "Voronkina";
        String studentEmail = "olya@test.com";
        String gender = "Female";
        String mobileNumber = testData.getRandomNumberBetweenRange();
        String dayOfBirth = "3";
        String monthOfBirth = "May";
        String yearOfBirth = "1995";
        String subjects = "Computer Science";
        String hobby = "Sports";
        String address = testData.generateRandomString(20);
        String state = "Haryana";
        String city = "Karnal";
        String fileName = "testfile.png";
        String tableTitle = "Student Registration Form";


        registrationPage.openPage()
                .checkTableTitle(tableTitle)
                .setFirstName(studentName)
                .setLastName(studentLastName)
                .setUserEmail(studentEmail)
                .setGender(gender)
                .setUserNumber(mobileNumber)
                .setBirthDay(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubject(subjects)
                .setHobby(hobby)
                .addFile(fileName)
                .setCurrentAddress(address)
                .setState(state)
                .setCity(city)
                .submitForm();

        //верификация формы
        registrationPage.verifyResults("Student Name", studentName + " " + studentLastName)
                .verifyResults("Student Email", studentEmail)
                .verifyResults("Gender", gender)
                .verifyResults("Mobile", mobileNumber)
                .verifyResults("Subjects", subjects)
                .verifyResults("Hobbies", hobby)
                .verifyResults("Picture", fileName)
                .verifyResults("Address", address)
                .verifyResults("State and City", state + " " + city);

        registrationPage.closeModalForm();

    }
}
