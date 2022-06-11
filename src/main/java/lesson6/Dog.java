package lesson6;

import java.util.Random;

public class Dog extends Animal{
    public Dog(String name) {
        super(name, "Собака", 500,10);
    }

    @Override
    public void run(int maxRunDistance) {
        Random random = new Random();
        int distance = random.nextInt(getMaxRunDistance());
        if(distance > 0) {
            System.out.printf("Пёсель по имени %s пробежал %d метров! Вот это да, похвалите его!%n", getName(), distance);
        } else {
            System.out.printf("Пёсель по имени %s не может сейчас бегать! Он усталь!%n", getName());
        }
    }

    @Override
    public void swim(int maxSwimDistance) {
        Random random = new Random();
        int distance = random.nextInt(getMaxSwimDistance());
        if(distance > 0) {
            System.out.printf("Пёсель по имени %s проплыл %d метров! Вот это да, похвалите его!%n", getName(), distance);
        } else {
            System.out.printf("Пёсель по имени %s не может сейчас плыть! Он усталь!%n", getName());
        }
    }
}
