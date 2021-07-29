package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldShowRemain(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainEqualBoundary(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainMoreBoundary(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1001;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainLessBoundary(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 999;

        int actual = cashback.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

}