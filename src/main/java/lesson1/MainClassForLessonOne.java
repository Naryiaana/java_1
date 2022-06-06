package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class MainClassForLessonOne {

    public static void main(String[] args) {
//        System.out.println("Let's get it started!");

        MainClassForLessonOne test = new MainClassForLessonOne();
        test.printHello();
        test.printHello();
        test.printHello();
        test.printHello();
        test.printHello(); //нестатика вызывается только лишь у экземпляра

       /* testVars();
        System.out.println("Привет!");*/
       MainClassForLessonOne.checkAppraisal(); // а статика через класс
    }

    void printHello() {
        System.out.println("Hello!");
    }

    private static void testVars() {
        int varA = 9;
        int varB = 5;
        double result = 1.0 * varA / varB;
        System.out.println(result);

        double doubleVarA = 9.0;
        float floatVarB = (float) doubleVarA - 4;
        System.out.println(doubleVarA / floatVarB);

        varA = varA + 3;
        varA += 3;
        varA *= 3;
        /* varA++; varA += 1;одно и тоже делают практически*/

        boolean isRed = true;
        isRed = false; /*с boolean будем работать не в виде переменных а в виде результатов сравнения*/

        char chr1 = '♥';
        char chr2 = 1234;
        System.out.println(chr1);
        System.out.println(chr2);
        System.out.println(chr1 + chr2);
        System.out.println((char)(chr1 + chr2));

        String helloStr = "Hello";
        String worldStr = "World!";

        System.out.println(helloStr + ", " + worldStr + "!"); /*это у нас не сложение а конкатенация строк здесь их 4*/
        System.out.println(helloStr + 1 + 3); /*здесь как и с дробями результат всегда будет стринг, а с дробями и инт тоже будет дробь*/
        System.out.println(helloStr + (1 + 3)); /*если хотим сложить а потом сконкатенировать то так, приоритет операторов*/
    }

    private static void checkAppraisal() {
        int appraisal = ThreadLocalRandom.current().nextInt(8) - 2; /*простая рандомизация, здесь диапазон от -2 до 5*/
        System.out.println("Школьник принес оценку: " + appraisal);

        if (appraisal == 5) {
            System.out.println("Молодец! Так держать!");
        } else if (appraisal == 4) {
            System.out.println("Хорошо, но ты можешь лучше!");
        } else if (appraisal >= 1 && appraisal <= 3) {
            /*else if (appraisal == 3 || appraisal == 2 || appraisal ==1)*/
            System.out.println("Готовь уроки лучше!");
        } else {
            System.out.println("Не мухлюй! Говори правду!");
        }

        System.out.println("Проверка дневника окончена");
    }

}
