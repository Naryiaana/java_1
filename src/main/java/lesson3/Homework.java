package lesson3;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        
        arrayOne();
        arrayFromOneToHundred();
        arrayLessThanSixMultiplyByTwo();
        arraySquareWithOnesAndZeros();
        arrayWithInitialValue(5,5);
        arrayTheBiggestAndSmallestValue();
        int[] data = {1, 2, 3, 3, 1, 10};
        System.out.println(checkBalance(data));
        shiftArray(new int[] {1, 2, 3, 4, 5, 6}, 9872);

    }

    private static void arrayOne() {
        int[] data = {0, 1, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                data[i] = 1;
            } else {
                data[i] = 0;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void arrayFromOneToHundred() {
        int[] data = new int[100];
        int n = 1;
        for (int i = 0; i < data.length; i++) {
            data[i] = n++;
        }
        System.out.println(Arrays.toString(data));
    }

    private static void arrayLessThanSixMultiplyByTwo() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6) {
                data[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void arraySquareWithOnesAndZeros() {
        int[][] deepData = new int[5][5];
        int n = deepData.length - 1;
        for (int i = 0; i < deepData.length; i++) {
           deepData[i][i] = 1;
           deepData[i][n - i] = 1;
        }

        for (int[] deepDatum : deepData) {
            for (int num : deepDatum) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }

    private static int[] arrayWithInitialValue(int len, int initialValue) {
        int[] data = new int[len];
        for (int i = 0; i < data.length; i++) {
            data[i] = initialValue;
        }
        System.out.println(Arrays.toString(data));
        return data;
    }

    private static void arrayTheBiggestAndSmallestValue() {
        int[] data = {1, 0, 25, 404, 96, 69, 11, 5};
        Arrays.sort(data);
        System.out.println("Минимальный элемент это " + data[0]);
        System.out.println("Максимальный элемент это " + data[7]);
    }

    private static boolean checkBalance(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int n = 0;
            for (int j = 0; j < i; j++) {
                n = n + data[j];
            }
            for (int j = i; j < data.length; j++) {
                n = n - data[j];
            }
            if (n == 0)
                return true;
        }
        return false;
    }

    private static void shiftArray(int[] array, int n) {
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftLeft(array, shiftNumber);
        } else {
            shiftRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + "; shiftNumber = " + n);
    }

    private static void shiftRight(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }

    private static void shiftLeft(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstValue;
        }
    }
}

