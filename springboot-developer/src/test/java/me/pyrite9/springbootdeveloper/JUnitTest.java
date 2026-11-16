package me.pyrite9.springbootdeveloper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @Test
    @DisplayName("1 + 2 는 3이다.")
    public void junittest() {
        int a = 1;
        int b = 2;
        int sum = 3;
        Assertions.assertEquals(sum, a+b); // 값이 같은지 확인
    }

}
