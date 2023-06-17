package demoqahw.tests;

import java.util.Random;

public class TestData {

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
    public static String getRandomNumberBetweenRange() {
        int min = 111111111;
        int max = 999999999;
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);
        String randomNumber = "7" + String.valueOf(x);
        return randomNumber;
    }
}
