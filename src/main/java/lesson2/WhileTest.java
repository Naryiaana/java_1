package lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class WhileTest {
    public static void main(String[] args) {

        int countApple = 0;

       /* while (countApple > 0) {
            countApple = eatApple(countApple);

            System.out.println("Яблок стало мнеьше. Осталось: " + countApple);
        }*/
        // Отличие: do while сначала что-то делает и только потом думаем а нужно ли было

        do {
            countApple = eatApple(countApple);

            System.out.println("Яблок стало мнеьше. Осталось: " + countApple);
        } while (countApple > 0);
    }

    private static int eatApple(int countApple) {
        return countApple - ThreadLocalRandom.current().nextInt(5);
    }
}
