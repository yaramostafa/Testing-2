package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void MaxValue() {
        int[] a = new int[] {6,8,44,6,3,99};
        var equal = new Main();
        assertEquals(99,equal.MaxArr(a));
    }

    @Test
    public void MinValue() {
        int[] a = new int[] {6,8,44,6,3,99};
        var equal = new Main();
        assertEquals(3,equal.MinArr(a));
    }

    @Test
    public void MaxValue2() {
        int[] a = new int[] {93,958,44,22,66,3,3,2,35,6,7,1000,178,15,1346,3};
        var equal = new Main();
        assertEquals(1346,equal.MaxArr(a));
    }

    @Test
    public void MinValue2() {
        int[] a = new int[] {93,958,44,22,66,3,3,2,35,6,7,1000,178,15,1346,3};
        var equal = new Main();
        assertEquals(2,equal.MinArr(a));
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldBeIllegalArgumentException() {
        int[] emptyArray = new int[] {};
        int maxValue = Main.MaxArr(emptyArray);
        int minValue = Main.MinArr(emptyArray);
    }

}