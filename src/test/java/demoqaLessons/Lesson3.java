package demoqaLessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson3 {
    @Test
    void firstTest(){
    int result = 2+2;
        Assertions.assertTrue(result==4);

    }

    @Test
    void secondTest(){
        int result = 2+2;
        Assertions.assertTrue(result==4);

    }
}
