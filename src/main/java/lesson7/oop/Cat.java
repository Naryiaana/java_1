package lesson7.oop;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private final String name;
    private int satiety;
    private int appetite;
    public Cat(String name, int satiety, int appetite) {

        this.name = name;
        this.satiety = satiety;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        int catEatFoodCount = ThreadLocalRandom.current().nextInt(0, appetite) + 1;
        plate.decreaseFood(catEatFoodCount);

        if (plate.getFoodCount() > 0) {
            System.out.println("Котик " + name + " съел " + catEatFoodCount + " корма");
            increaseSatiety(catEatFoodCount);
        } else {
            System.out.println("Котик " + name + " съел последние оставшиеся " + plate.getLastAmount() + " корма");
            lastIncreaseSatiety(plate.getLastAmount(), catEatFoodCount);
            plate.addFood();
        }


    }

    private void increaseSatiety(int catEatFoodCount) {
        satiety += catEatFoodCount;
        System.out.println("Насыщение котика повысилось, сейчас оно составляет: " + satiety + " у.е.");
        appetite -= catEatFoodCount;
        System.out.println("А аппетит понизился, сейчас он составляет: " + appetite + " у.е.");
    }

    private void lastIncreaseSatiety(int lastAmount, int catEatFoodCount) {
        satiety += lastAmount;
        System.out.println("Насыщение котика повысилось, сейчас оно составляет: " + satiety + " у.е.");
        appetite -= catEatFoodCount;
        System.out.println("А аппетит понизился, сейчас он составляет: " + appetite + " у.е.");
    }

    public void printAppetiteInfo() {
        if (appetite <= 0) {
            System.out.println("Кот " + name + " наелся и спит");
        } else {
            System.out.println("Котику " + name + " не хватило корма");
        }
    }
}
