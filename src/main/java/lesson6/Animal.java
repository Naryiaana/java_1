package lesson6;

public abstract class Animal {
    private String name;
    private String animalType;
    private int maxRunDistance;
    private int maxSwimDistance;
    private static int animalsCount;

    public Animal(String name, String animalType, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.animalType = animalType;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalsCount++;
    }

    public Animal(String name, String animalType, int maxRunDistance) {
        this.name = name;
        this.animalType = animalType;
        this.maxRunDistance = maxRunDistance;
        animalsCount++;
    }

    public static void printAnimalsCountInfo() {
        System.out.println("Всего животинок: " + getAnimalsCount());
    }

    public abstract void run(int maxRunDistance);

    public abstract void swim(int maxSwimDistance);

    public String getName() {
        return name;
    }


    public int getMaxRunDistance() {
        return maxRunDistance;
    }


    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }


    public static int getAnimalsCount() {
        return animalsCount;
    }
}
