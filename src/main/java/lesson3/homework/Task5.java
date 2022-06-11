package lesson3.homework;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] newArray = getNewArray(10, 777);
        System.out.println(Arrays.toString(newArray));
    }


    private static int[] getNewArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

}
