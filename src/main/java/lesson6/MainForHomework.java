package lesson6;


public class MainForHomework {
    public static void main(String[] args) {
        Animal dog = new Dog("Джек");
        Animal cat = new Cat("Джордж");


        dog.run(dog.getMaxRunDistance());
        dog.swim(dog.getMaxSwimDistance());
        cat.run(cat.getMaxRunDistance());
        cat.swim(cat.getMaxSwimDistance());

        Animal.printAnimalsCountInfo();
    }
}
