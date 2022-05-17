package lesson1;

public class HomeWorkAppFromTimofei {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.print("Banana\n");
        System.out.println("Apple");

        System.out.println("Orange\nBanana\nApple");

        System.out.print("""
                         Orange
                         Banana
                         Apple
                         """);

        String pattern = """
                         1) %s
                         2) %s
                         3) %s
                         """;
//        System.out.println(String.format(pattern, "Orange", "Banana", "Apple"));
        System.out.printf(pattern, "Orange", "Banana", "Apple");
    }

    private static void checkSumSign() {
        int a = -1;

        if (a >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 99;

        if (value <= 0) {
            System.out.println("Красный");
        } /*else if(value <= 100 && value > 0) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }*/
        else if(value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    private static void compareNumbers() {
        int a = 4;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
