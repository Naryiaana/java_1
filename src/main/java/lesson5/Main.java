package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Nariana", 10000, 80, 1050509);
        Player player2 = new Player("George", 20002, 90,222222);
        Player player3 = new Player("Dream");
        Player.printPlayersCountInfo();
        Player player4 = new Player(5.5, 6.7);

      /*  player1.point = 9999;
        player2.point = 1000;

        System.out.println(player1.point);
        System.out.println(player2.point);*/

//        System.out.println(player1.toString());

       /* player3.point = -1000;
        player3.money = -1000000;*/
      //  player1.setPoint(new Scanner(System.in).nextInt()); //player1.point = 1;

        player1.setPoint(1500); //player1.point = 1;
        System.out.println(player1.getPoint()/*player1.point*/);


        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        player4.printInfo();

        Player[] players = {player1, player2, player3, player4};
        for (Player player : players) {
            player.jump();
        }

        Player.printPlayersCountInfo();
    }
}
