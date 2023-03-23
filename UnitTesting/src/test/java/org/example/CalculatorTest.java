package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();
    @DisplayName("Checks if sum is correct.")
    @Test
    void sum() {
        assertEquals(5, calculator.sum(2, 3), "2 + 3 != 5");
    }

    @DisplayName("Checks if subtraction is correct.")
    @Test
    void subtraction() {
        assertEquals(0, calculator.subtraction(3, 3), "3 - 3 != 0");
    }

    @DisplayName("Checks if multiplication is correct.")
    @Test
    void multiplication() {
        assertEquals(0, calculator.multiplication(8, 0), "8 * 0 != 0");
    }


    @DisplayName("Checks if division is correct.")
    @Test
    void division() {
        assertEquals(0, calculator.division(10, 0), "10 / 0 != 0");
    }

    @DisplayName("Checks if matrix sum is correct.")
    @Test
    void sumMatrix() {
        int[][] a = {{1 ,2} , {2, 3}};
        int[][] b = {{0, 0}, {0, 0}};
        int[][] result = {{1 ,2} , {2, 3}};
        assertArrayEquals(result, calculator.sumMatrix(a, b), "Matrix sum is not correct");
    }

    @DisplayName("Checks if matrix subtraction is correct.")
    @Test
    void subtractMatrix() {
        int[][] a = {{1 ,2} , {2, 3}};
        int[][] b = {{1, 2}, {2, 3}};
        int[][] result = {{0 ,0} , {0, 0}};
        assertArrayEquals(result, calculator.subtractMatrix(a, b), "Matrix subtraction is not correct");
    }

    @DisplayName("Checks if matrix multiply is correct.")
    @Test
    void multiplyMatrix() {
        int[][] a = {{1, 2}, {2, 3}};
        int[][] b = {{1 ,0} , {0, 1}};
        int[][] result = {{1, 2}, {2, 3}};
        assertArrayEquals(result, calculator.multiplyMatrix(a, b), "Matrix multiply is not correct");
    }
}