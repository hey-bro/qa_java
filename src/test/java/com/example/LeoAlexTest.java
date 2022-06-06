package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LeoAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensAmountTest() throws Exception {
        LeoAlex leo = new LeoAlex(feline);
        int expected = 0;
        int actual = leo.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LeoAlex leo = new LeoAlex(feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = leo.getPlaceOfLiving();
        assertEquals(expected,actual);
    }

    @Test
    public void getFriendsTest() throws Exception {

        Feline feline = new Feline();
        LeoAlex leo = new LeoAlex(feline);
        List<String> expected = List.of("Мартин", "Глория", "Мелман");
        List<String> actual = leo.getFriends();
        assertEquals(expected, actual);
    }

}
