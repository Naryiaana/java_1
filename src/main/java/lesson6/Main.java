package lesson6;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Нарыйаана",251996);
        Knight knight = new Knight("Джордж", 1111996,"Экскалибур");
        /*Player player = new Player("Хеллоу", 32934,"Учитель");*/
        Player bard = new Bard("Лютик", 2);
      /*  bard.doAction();

        wizard.printInfo();
        knight.printInfo();

        wizard.doAction();
        knight.doAction();*/

        Player[] players = {wizard, bard, knight};

/*        for (Player player : players) {
            player.printInfo();

      *//*      if (player instanceof Bard) { //плохой код с instanseof
                Bard b = (Bard) player;
                b.sing();
            }*//*

            if (player instanceof Bard b) {
                b.sing();
            }
        }*/

        /*for (Player player : players) {
            test(player);
            //test(knight);
        }*/

        Object[] objects = {
                new Date(),
                new int[]{1,2,3,4,5,},
                knight,
                new Scanner(System.in),
                "Hello",
                Knight.class,
                5
        };

        for (Object object : objects) {
            System.out.println(object);
        }
    }

    private static void test(Player player) {
        player.doAction();
    }
}
