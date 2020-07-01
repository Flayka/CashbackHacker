package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJupiterTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldAskAddSum() {
        int actual = service.remain(890);
        int expected = 110;

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotAskAddSum() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldCashbackServiceIf0() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}
