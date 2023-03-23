package org.example;

public class Calculator {

    double sum(int a, int b) {
        return a + b;
    }

    double subtraction(int a, int b) {
        return a - b;
    }

    double multiplication(int a, int b) {
        return a * b;
    }

    double division(double a, double b) {
        return a / b;
    }

    int[][] sumMatrix(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        var result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    int[][] subtractMatrix(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        var result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    int[][] multiplyMatrix(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        var result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] * b[i][j];
            }
        }
        return result;
    }
}
