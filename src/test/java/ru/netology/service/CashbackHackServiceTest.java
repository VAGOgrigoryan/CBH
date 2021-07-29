package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldShowRemain(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainEqualBoundary(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainMoreBoundary(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1001;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainLessBoundary(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 999;

        int actual = cashback.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

}