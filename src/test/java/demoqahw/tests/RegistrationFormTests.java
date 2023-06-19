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

        String studentName = testData.getRandomFirstName(),
                studentLastName = testData.getRandomLastName(),
                studentEmail = testData.getRandomEmail(),
                gender = testData.getRandomGender(),
                mobileNumber = testData.getRandomPhoneNumber(10),
                dayOfBirth = testData.getRandomNumber(1, 28),
                monthOfBirth = testData.getRandomMonth(),
                yearOfBirth = testData.getRandomNumber(1990, 2000),
                subjects = testData.getRandomSubject(),
                hobby = testData.getRandomHobbies(),
                address = testData.getRandomAddress(),
                state = testData.getRandomState(),
                city = testData.getRandomCity(state),
                fileName = "testfile.png",
                tableTitle = "Student Registration Form";


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
