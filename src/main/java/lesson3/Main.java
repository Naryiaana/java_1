package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        testRandom();
        testConsoleInput();
    }


    private static void testConsoleInput() {
        int a = getNumFromScanner();
        int b = getNumFromScanner();
        TestMethods.multiply(a, b);
    }

    private static int getNumFromScanner() {
        while (true) {
            System.out.print("Введите целое число: ");
            if (in.hasNextInt()) {
                return in.nextInt();
            }
            System.out.println(in.next() + " - это не целое число");
        }
    }

        private static void testRandom() {
            int[] data = new int[40];
            Random random = new Random();

            for (int i = 0; i < data.length; i++) {
                data[i] = random.nextInt(); //-2147kk - +2147kk
                data[i] = random.nextInt(10); //0 - 9, каждая строка перекрывает предыдущую кстати
                data[i] = random.nextInt(8) + 3; //3 - 10
                data[i] = random.nextInt(3, 11); //3 - 10
                data[i] = random.nextInt(13) - 5; //-5 - 7
                data[i] = random.nextInt(-5, 8); //-5 - 7

                //мир до сих пор не сошелся что лучше либо первые два способа либо этот
                data[i] = (int) (Math.random() * 10); //0 - 9
                data[i] = (int) (Math.random() * 8) + 3; //3 - 10
                data[i] = (int) (Math.random() * 13) - 5; //3 - 10

            }

            System.out.println(Arrays.toString(data));
        }
    }


