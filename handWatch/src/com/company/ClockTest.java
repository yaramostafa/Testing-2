package com.company;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

    class clockTest {
        @Nested
        class EdgeCoverage {
            Main x;
            @BeforeEach
            public void setup() {
                x = new Main();
            }
            //suite = "aacbabababababad"
            @Test
            public void ec1() {
                String[] t = x.clock('a');
                System.out.println("Edge Coverage Testing");
                assertEquals("NORMAL", t[0]);
                assertEquals("DATE", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 0", t[3]);
            }

            @Test
            public void ec2() {
                x.clock('a');
                String[] t = x.clock('a');
                assertEquals("NORMAL", t[0]);
                assertEquals("TIME", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 0", t[3]);
            }

            @Test
            public void ec3() {
                x.clock('a');
                x.clock('a');
                String[] t = x.clock('c');
                assertEquals("UPDATE", t[0]);
                assertEquals("min", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 0", t[3]);
            }

            @Test
            public void ec4() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("min", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 1", t[3]);
            }

            @Test
            public void ec5() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("UPDATE", t[0]);
                assertEquals("hour", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 1", t[3]);
            }

            @Test
            public void ec6() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("hour", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec7() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("UPDATE", t[0]);
                assertEquals("day", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec8() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("day", t[1]);
                assertEquals("2 / 1 / 2000", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec9() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("UPDATE", t[0]);
                assertEquals("month", t[1]);
                assertEquals("2 / 1 / 2000", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec10() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("month", t[1]);
                assertEquals("2 / 2 / 2000", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec11() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("UPDATE", t[0]);
                assertEquals("year", t[1]);
                assertEquals("2 / 2 / 2000", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec12() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("year", t[1]);
                assertEquals("2 / 2 / 2001", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec13() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("NORMAL", t[0]);
                assertEquals("TIME", t[1]);
                assertEquals("2 / 2 / 2001", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec14() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('c');
                assertEquals("UPDATE", t[0]);
                assertEquals("min", t[1]);
                assertEquals("2 / 2 / 2001", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec15() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('c');
                String[] t = x.clock('d');
                assertEquals("NORMAL", t[0]);
                assertEquals("TIME", t[1]);
                assertEquals("2 / 2 / 2001", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec16() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('c');
                x.clock('d');
                String[] t = x.clock('b');
                assertEquals("ALARM", t[0]);
                assertEquals("Alarm", t[1]);
                assertEquals("2 / 2 / 2001", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec17() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('c');
                x.clock('d');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("ALARM", t[0]);
                assertEquals("Chime", t[1]);
                assertEquals("2 / 2 / 2001", t[2]);
                assertEquals("1 : 1", t[3]);
            }

            @Test
            public void ec18() {
                x.clock('a');
                x.clock('a');
                x.clock('c');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('a');
                x.clock('c');
                x.clock('d');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('d');
                assertEquals("NORMAL", t[0]);
                assertEquals("TIME", t[1]);
                assertEquals("2 / 2 / 2001", t[2]);
                assertEquals("1 : 1", t[3]);
            }

        }
        @Nested
        class ADUP{

            Main x;
            //suite = "cbbabbabbabbabb"
            @BeforeEach
            public void setup(){
                x = new  Main();
            }

            @Test
            public void ADUPtest1(){
                String[] t = x.clock('c');
                assertEquals("UPDATE", t[0]);
                assertEquals("min", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 0", t[3]);
            }

            @Test
            public void ADUPtest2(){
                x.clock('c');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("min", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 1", t[3]);
            }

            @Test
            public void ADUPtest3(){
                x.clock('c');
                x.clock('b');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("min", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 2", t[3]);
            }

            @Test
            public void ADUPtest4(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("UPDATE", t[0]);
                assertEquals("hour", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("0 : 2", t[3]);
            }

            @Test
            public void ADUPtest5(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("hour", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("1 : 2", t[3]);
            }

            @Test
            public void ADUPtest6(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("hour", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest7(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("UPDATE", t[0]);
                assertEquals("day", t[1]);
                assertEquals("1 / 1 / 2000", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest8(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("day", t[1]);
                assertEquals("2 / 1 / 2000", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest9(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("day", t[1]);
                assertEquals("3 / 1 / 2000", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest10(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("UPDATE", t[0]);
                assertEquals("month", t[1]);
                assertEquals("3 / 1 / 2000", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest11(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("month", t[1]);
                assertEquals("3 / 2 / 2000", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest12(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("month", t[1]);
                assertEquals("3 / 3 / 2000", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest13(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                String[] t = x.clock('a');
                assertEquals("UPDATE",t[0]);
                assertEquals("year", t[1]);
                assertEquals("3 / 3 / 2000", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest14(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                String[] t = x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("year", t[1]);
                assertEquals("3 / 3 / 2001", t[2]);
                assertEquals("2 : 2", t[3]);
            }

            @Test
            public void ADUPtest15(){
                x.clock('c');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                x.clock('b');
                x.clock('a');
                x.clock('b');
                String[] t= x.clock('b');
                assertEquals("UPDATE", t[0]);
                assertEquals("year", t[1]);
                assertEquals("3 / 3 / 2002", t[2]);
                assertEquals("2 : 2", t[3]);
            }


        }
    }
