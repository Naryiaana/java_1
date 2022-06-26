package lesson7.oop;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Джордж",0,50);
        cats[1] = new Cat("Дрим",0,50);
        cats[2] = new Cat("Юля",0,50);
        cats[3] = new Cat("Нарыйаана",0,50);
        cats[4] = new Cat("Лана",0,50);

        Plate plate = new Plate(50);

        plate.printInfo();

        System.out.println("Начинаем кормить котиков");

        for (Cat value : cats) {
            while (plate.getFoodCount() > 0 && value.getAppetite() != 0) {
                value.eat(plate);
                plate.printInfo();
                Thread.sleep(50);

            }
        }
        for (Cat cat : cats) {
            cat.printAppetiteInfo();

        }
    }
}
