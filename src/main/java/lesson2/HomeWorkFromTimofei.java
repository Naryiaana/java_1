package lesson2;

public class HomeWorkFromTimofei {

    public static void main(String[] args) {
        System.out.println("ex1. 1 + 10 => " + isSumBetween10and20(10, 0));
        System.out.println("ex1. 7 + 8 => " + isSumBetween10and20(7, 8));
        System.out.println("ex1. 11 + 10 => " + isSumBetween10and20(11, 10));

        printPositiveOrNegativeNum(5);
        printPositiveOrNegativeNum(-5);
        printPositiveOrNegativeNum(0);

        System.out.println("ex3. num 5 => " + isNumberPositive(5));
        System.out.println("ex3. num 0 => " + isNumberPositive(0));
        System.out.println("ex3. num -5 => " + isNumberPositive(-5));

        printStringCycle("Задание 4", 3);

        printLeapYear(4);
        printLeapYear(99);
        printLeapYear(300);
        printLeapYear(400);
        printLeapYear(2000);
        printLeapYear(2021);
    }

    private static boolean isSumBetween10and20(int a, int b) {

/*        if (a + b == 1) {
            return 1;
        } else if(a + b == 2) {
            return 2;
        } else if(a + b == 3) {
            return 3;
        }
        else if(a + b == 4) {
            return 4;
        }
        else if(a + b == 5) {
            return 5;
        }
        else if(a + b == 6) {
            return 6;
        }*/

/*        int sum = a + b;
        if (sum >= 10) {
            if (sum <= 20) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }*/

/*        if ((a + b >= 10) && (a + b <= 20)) {
            return true;
        } else {
            return false;
        }*/

        return (a + b >= 10) && (a + b <= 20);

    }

    private static void printPositiveOrNegativeNum(int num) {
        String strPattern = "Number " + num + " ";

/*        if (num >= 0) {
            strPattern += "positive";
        } else {
            strPattern += "negative";
        }*/

        // (условие) ? (true) : (false) тернарный оператор
        strPattern += (num >= 0) ? "positive" : "negative";

        System.out.println(strPattern);
    }

    private static boolean isNumberPositive(int num) {
        return num >= 0;
    }

    private static void printStringCycle(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    static void printLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.print(year + " is leap year\n");
        } else {
            System.out.print(year + " is not leap year\n");
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;

//        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
