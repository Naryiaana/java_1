package lesson2;

public class Homework {
    public static void main(String[] args) {
        boolean isSumBetween10And20 = checkSum(15,0);
        System.out.println("Сумма лежит от 10 до 20 (включительно)? " + isSumBetween10And20);
        isNumberPositiveOrNegative(-25);
        boolean isNumberPositiveOrNegative = checkNumber(404);
        System.out.println("Число отрицательное? " + isNumberPositiveOrNegative);
        printThisLineNTimes("I'M LEARNING JAVA",15);
        boolean isYearLeap = checkYear(1996);
        System.out.println("Год високосный? " + isYearLeap);
    }

    private static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    private static void isNumberPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean checkNumber(int a) {
        if (a >= 0) {
            return false;
        }
        return true;
    }

    private static void printThisLineNTimes(String line, int n) {
        while (n > 0) {
            System.out.println(line);
            n--;
        }
    }

    private static boolean checkYear(int a) {
        if (a % 4 == 0 || a % 400 == 0 && a % 100 != 0) {
            return true;
        }
        return false;
    }



}
