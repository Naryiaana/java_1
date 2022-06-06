package lesson5;

public class Player {
        private String nickname;
        private int point;
        private int level;
        private int money;
        private static int playersCount;

        public static int getPlayersCount() {
                return playersCount;
        }

        public static void printPlayersCountInfo() {
                System.out.println("Всего игроков: " + getPlayersCount());
        }

        /*public static void setPlayersCount(int playersCount) {
                Player.playersCount = playersCount;
        }*/

        public Player(String nickname, int point, int level, int money) {
                this.nickname = nickname.toUpperCase();
                setPoint(point); //удобная реализация одна, если вдруг придет с минусом например
                this.level = level;
                this.money = money;
                System.out.printf("%s: I was born%n", nickname);
               // setPlayersCount(getPlayersCount() + 1);
                playersCount++;
        }

        public Player(String nickname) {
                this(nickname, 0,1,100);
        }

        public Player(double point, double money) {
                this.point = (int)point;
                this.money = (int)money;
        }

        void printInfo() {
//                System.out.printf("Игрок %s(lvl. %d) имеет %d очков и %d монет%n", nickname, level, point, money);
                System.out.println(this/*.toString()*/);
        }

        void jump() {
                System.out.println(nickname + " совершает прыжок");
        }

        @Override
        public String toString() {
                return String.format("Игрок %s(lvl. %d) имеет %d очков и %d монет%n", nickname, level, point, money);
        }

        public int getPoint() {
                return point;
        }

        public void setPoint(int point) {
                this.point = Math.abs(point);
        }

        public String getNickname() {
                return nickname;
        }

        public int getLevel() {
                return level;
        }

        public int getMoney() {
                return money;
        }
}
