package lesson3;

public class TestMethods {

    public static void main(String[] args) {
        multiply(3, 4);
        multiply(3.5, 4.3);
        multiply(34);
        // Это все перегрузка метода
        System.out.println(isTrue(5));
    }

    private static boolean isTrue(int a) {
        return a >= 0; //вот так еще можно сделать возврат
    }

    static void multiply(int a, int b) {
        int multiply = a * b;
        System.out.printf("Произведение %d и %d равно %d%n", a, b, multiply);
    }

    private static void multiply(double a, double b) {
        double multiply = a * b;
        System.out.printf("Произведение %.2f и %.2f равно %.2f%n", a, b, multiply);

    }

    public static void multiply(int a) {
        int multiply = a * a;
        System.out.printf("Квадрат числа %d равен %d%n", a, multiply);
    }
}
