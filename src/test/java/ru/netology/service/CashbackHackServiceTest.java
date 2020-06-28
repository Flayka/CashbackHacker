package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldAskAddSum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 890;

        int actual = service.remain(amount);
        int expected = 110;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAskAddSum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashbackServiceIf0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}