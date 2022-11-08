package org.example.MoneyTests;

import org.example.Money.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MoneyIAETest {
    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";

    private static Stream<Integer> getInvalidAmount(){
        return Stream.of(-45,-5,-1);
    }

    @ParameterizedTest
    @MethodSource("getInvalidAmount")
    public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Money(invalidAmount, VALID_CURRENCY);
        });
    }

    private static Stream<String> getInvalidCurrency(){
        return Stream.of(
                null, ""
        );
    }

    @ParameterizedTest
    @MethodSource("getInvalidCurrency")
    public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Money(VALID_AMOUNT, invalidCurrency);
        });
    }
}
