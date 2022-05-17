package lesson2;

public class Incrementing {
    public static void main(String[] args) {
//        test0();
//        test1();
//        test2();
        test3();

    }

    private static void test0() {
        int a = 1, b = 3;
        int result = ++a + b; // 2 + 3 = 5
        System.out.println(++a); // 3
        System.out.println(result); // 5
        int c = 2, d = 8;
        int sum = c++ + d; //10, c = 3
        System.out.println(c++); // сначала выводим 3, а потом c = 4
        System.out.println(sum); // 10
        System.out.println(c);
    }

    private static void test1() {
        int c = 0;
        System.out.println(c++); //sout(0), ++, c = 1
        System.out.println(++c); //++, sout(2), c = 2
        System.out.println(c--); //sout(2), --, c = 1
        System.out.println(--c); //--, sout(0), c = 0
        System.out.println(c + 1);//sout(c + 1), c = 0
        System.out.println(c); //sout 0
    }

    private static void test2() {
        int a = 5;
        int b = 5;

        int resultOne = 2 * ++a; //a = 6, результат 12
        int resultTwo = 2 * b++; //10, после этой строчки b = 6

        System.out.println(resultOne); // 12
        System.out.println(resultTwo); // 10
        System.out.println(a + " " + b);
    }

    private static void test3() { //это пример очень плохого кода как и предыдущие
        int c = 1;
        System.out.println(c++ + c); //1 + 2, sout(3), c = 2
        System.out.println(++c + c); //3 + 3, c = 3, sout(6)
        System.out.println(c + c++); //3 + 3, sout(6), c = 4;
        c += ++c + c; // 4 += 5 + 5, c = 14
        System.out.println(c); //14
    }
}
