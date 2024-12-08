package ru.condition;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class X2Test {

    @ParameterizedTest
    @CsvSource({
            "1,1,1,1,3",
            "0,1,1,1,2",
            "1,1,0,1,2",
            "1,1,1,0,1",
    })
    void calc(int a, int b, int c, int x, int expected) {
        int out = X2.calc(a, b, c, x);
        assertThat(out).isEqualTo(expected);
    }
}