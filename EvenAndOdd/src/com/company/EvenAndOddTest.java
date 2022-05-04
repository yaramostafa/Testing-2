package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EvenAndOddTest {
    @Test
    void equal() {
        String ans = "even";
        String ans2= "odd";
        var equal = new Main();
        assertEquals(ans2,equal.EvenAndOdd(3));
    }

    @Test
    void equal1() {
        String ans = "even";
        String ans2= "odd";
        var equal = new Main();
        assertEquals(ans2,equal.EvenAndOdd(1));
    }

    @Test
    void equal2() {
        String ans = "even";
        String ans2= "odd";
        var equal = new Main();
        assertEquals(ans,equal.EvenAndOdd(0));
    }

    @Test
    void equal3() {
        String ans = "even";
        String ans2= "odd";
        var equal = new Main();
        assertEquals(ans,equal.EvenAndOdd(2));
    }

    @Test
    void equal4() {
        String ans = "even";
        String ans2= "odd";
        var equal = new Main();
        assertEquals(ans,equal.EvenAndOdd(4));
    }


}