package lesson9_junit5;

import org.junit.jupiter.api.*;

public class SimpleTest {


    @DisplayName("Email должен отправляться после регистрации пользователя") //выводится в Allure Report
    @Test
    @Tag("WEB") // для того чтобы можно было запускать тесты по тегу
    void sendEmailTest(){
        Assertions.assertTrue(3>2);
        System.out.println("1");
    }

    //@Disabled("bug-1111") // не будет запускаться, в комментарии можно указать номер бага который сломал тест
    @Test
    @Tags({
            @Tag("SMOKE"),
            @Tag("WEB")
    })
        void simpleTest(){
        Assertions.assertTrue(3>2);
        System.out.println("2");
    }
    //.\gradlew --info clean test -Dtags=smoke  --для запуска тестов по тегам ????
}
