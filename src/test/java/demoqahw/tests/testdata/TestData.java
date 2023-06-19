package demoqahw.tests.testdata;

import com.github.javafaker.Faker;

import java.util.Random;

public class TestData {

    Faker faker = new Faker();

    /**
     * генерация рандомной строки заданной длины
     */
    public static String generateRandomString(int length) {
        final String characters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    /**
     * генерация рандомной строки (из цифр) в указанном диапазоне
     */
    public static String getRandomNumberBetweenRange(int min, int max) {
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);
        String randomNumber = String.valueOf(x);
        return randomNumber;
    }

    public String getRandomFirstName() {
        return faker.name().firstName();
    }

    public String getRandomLastName() {
        return faker.name().lastName();
    }

    public String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public  String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
//        return getRandomItemFromArray(genders);
    }

    public String getRandomPhoneNumber(int len) {
        return faker.phoneNumber().subscriberNumber(len);
    }

    public  String getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return faker.options().option(months);
    }

    public int getRandomInt(int min, int max) {
        return faker.number().numberBetween(min, max);
    }

    public String getRandomNumber(int min, int max) {
        return String.valueOf(faker.number().numberBetween(min, max));
    }

    public  String getRandomSubject() {
        String[] subjects = {"Hindi", "English", "Maths", "Physics", "Chemistry", "History", "Computer Science", "Biology",  "Social Studies"};
        return faker.options().option(subjects);
    }

    public  String getRandomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }

    public  String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }

    public  String getRandomCity(String state) {
        if (state.equals("NCR")) {
            String[] cities = {"Delhi", "Gurgaon", "Noida"};
            return faker.options().option(cities);
        } else if (state.equals("Uttar Pradesh")) {
            String[] cities = {"Agra", "Lucknow", "Merrut"};
            return faker.options().option(cities);
        } else if (state.equals("Haryana")) {
            String[] cities = {"Karnal", "Panipat"};
            return faker.options().option(cities);
        } else if (state.equals("Rajasthan")) {
            String[] cities = {"Jaipur", "Jaiselmer"};
            return faker.options().option(cities);
        }
        return null;
    }


//    private  String getRandomItemFromArray(String[] values) {
//        int index = getRandomInt(0, values.length - 1);
//        return values[index];
//    }

}
