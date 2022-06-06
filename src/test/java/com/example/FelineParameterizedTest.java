package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    Feline feline = new Feline();
    private final int expected;
    private final int actual;

    @Parameterized.Parameters
    public static Object[][] getGender() {
        return new Object[][]{
                {228,228},
                {44,44},
                {10,10},
        };
    }

    public FelineParameterizedTest(int expected, int actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Test
    public void getKittensTestWithParameter() throws Exception {

            Feline feline = new Feline();
            int actual = feline.getKittens(expected);
            assertEquals(expected, actual);
    }
}