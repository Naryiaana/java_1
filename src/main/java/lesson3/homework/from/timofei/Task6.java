package lesson3.homework.from.timofei;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        int[] array = {5, 2, 7, 1, 10, 8, 3};
        int min = array[0];
        int max = array[0];

/*        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
//            max = Math.max(array[i], max);
//            min = Math.min(array[i], min);

        }*/

        Arrays.sort(array);
        min = array[0];
        max = array[array.length - 1];

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }


}
