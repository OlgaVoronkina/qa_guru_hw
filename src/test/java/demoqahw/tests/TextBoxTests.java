package demoqahw.tests;

import demoqahw.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends BaseTests {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void successTest() {

        String fullName = "Olga Voronkina";
        String email = "olga@test.com";
        String currentAddress = testData.generateRandomString(20);
        String permanentAddress = testData.generateRandomString(20);

        textBoxPage.openPage()
                .setFullName(fullName)
                .setEmail(email)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .submitForm();

        //верификация формы
        textBoxPage.verifyResults("name", fullName)
                .verifyResults("email", email)
                .verifyResults("currentAddress", currentAddress)
                .verifyResults("permanentAddress", permanentAddress);
    }
}
