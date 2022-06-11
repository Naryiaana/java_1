package lesson7.string;

import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";
        String str3 = new String("Cat"); //хранится в куче heap

        System.out.println("str1 == str2: " + str1 == str2); //falseб приоритет операторов никто не отменял, сначала складываем строки и только потом сравниваем с стр2, поэтому надпись войдет в состав для сравнения
        System.out.println("str1 == str3: " + str1 == str3); //false

        System.out.println("str1 == str2: " + (str1 == str2)); //хранятся в string pool
        System.out.println("str1 == str3: " + (str1 == str3)); //мы сравниваем не значения, а ссылки

        System.out.println("str1 == str2: " + str1.equals(str2)); //сравнивает уже сами значение
        System.out.println("str1 == str3: " + Objects.equals(str1, str3)); //сравнивает уже сами значение, через обджекст даже лучше
        System.out.println("str1 == str3: " + Objects.equals(null, null)); //сравнивает уже сами значение, через обджекст даже лучше

        System.gc(); // мы не вызываем, а просто просим сборщика мусора включиться и скорее всего он нас проигнорирует

        final int[] testArr = {1, 1, 1, 1, 1, 1};
        //int[] testArr = {1, 1, 1, 1, 1, 1};
        //int[] copyArr = testArr;
        //testLinkArray(testArr);
        //testLinkArray(testArr.clone());не самое хорошее решение

        int[] copyArr = new int[(int)(testArr.length * 1.5)];
        System.arraycopy(testArr, 0, copyArr, 0,testArr.length);
       // System.arraycopy(testArr, 1, copyArr, 0,1); это если мы хотим конкретный элемент
        testLinkArray(copyArr); //таким образом исходный массив не поменяется

        System.out.println(Arrays.toString(Arrays.copyOf(testArr, testArr.length))); //еще один способ копирования

        System.out.println(Arrays.toString(testArr));
    }

    private static void testLinkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
