package ru.converter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @ParameterizedTest
    @CsvSource({
            "140, 100, 1.4",
            "120, 100, 1.2",
            "180, 90, 2",
    })
    void convert(float in, float exchangeValue, float expected) {
        float out = Converter.convert(in, exchangeValue);
        float epsilon = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(epsilon));
    }
}