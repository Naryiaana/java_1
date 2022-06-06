package lesson3.homework;

import java.util.Arrays;

public class Task4 {

    private static final int SIZE = 15;

    public static void main(String[] args) {
        int[][] array = new int[SIZE][SIZE];
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = array[i][lastIndex - i] = 1;
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
//        https://skr.sh/sE5CHKjfAhB.png
    }
}
