package lesson6;

import java.util.Random;

public class Cat extends Animal{
    public Cat(String name) {
        super(name, "Кот", 200);
    }

    @Override
    public void run(int maxRunDistance) {
        Random random = new Random();
        int distance = random.nextInt(getMaxRunDistance());
        if(distance > 0) {
            System.out.printf("Котик по имени %s пробежал %d метров! Вот это да, похвалите его!%n", getName(), distance);
        } else {
            System.out.printf("Котик по имени %s не может сейчас бегать! Он усталь!%n", getName());
        }
    }

    @Override
    public void swim(int maxSwimDistance) {
        System.out.printf("Котик по имени %s не умеет плавать! А что вы хотели, это же котик :)%n", getName());
    }
}
