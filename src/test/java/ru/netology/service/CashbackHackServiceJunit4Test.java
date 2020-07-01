package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceJunit4Test {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAskAddSumJUnit4() {
        int amount = 890;

        int actual = service.remain(amount);
        int expected = 110;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAskAddSumJUnit4() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackServiceIf0JUnit4() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

}