package lesson7.oop;

import java.util.Scanner;

public class Plate {
    private int foodCount;
    private int lastAmount;
    private final Scanner in = new Scanner(System.in);

    public int getLastAmount() {
        return lastAmount;
    }

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
        if (foodCount > catEatFoodCount) {
            foodCount -= catEatFoodCount;
        } else {
            lastAmount = foodCount;
            foodCount -= foodCount;
        }

    }

    public void addFood() {
        System.out.println("Еда в миске закончилась, восполнить запас корма? да\\нет");
         switch (in.next()) {
            case "y", "yes", "да", "+", "д" -> addingFood();
            default -> end();
        }
    }

    private void addingFood() {
      foodCount += 50;
    }


    public void end() {
        in.close();
        System.out.println("Вы решили не наполнять миску");
    }

}
