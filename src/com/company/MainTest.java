package com.company;

import org.junit.*;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void additionUnitTestTrue() {
        try {
            assertTrue(Main.addition(5, 5) == 10);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test

        public void additionUnitTestFalse () {
            try {
            assertFalse(Main.addition(5, 5) == 7);
        }
        catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
        }

    }

    @Test
    public void subtractionUnitTestTrue() {
        try {
            assertTrue(Main.subtraction(5, 5) == 0);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test

    public void subtractionUnitTestFalse () {
        try {
            assertFalse(Main.subtraction(5, 5) == 7);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
    @Test
    public void multiplicationUnitTestTrue() {
        try {
            assertTrue(Main.multiplication(10, 5) == 50);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test

    public void multiplicationUnitTestFalse () {
        try {
            assertFalse(Main.multiplication(10, 5) == 7);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
    @Test
    public void divisionUnitTestTrue() {
        try {
            assertTrue(Main.division(10, 5) == 2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test

    public void divisionUnitTestFalse () {
        try {
            assertFalse(Main.division(10, 5) == 5);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}

