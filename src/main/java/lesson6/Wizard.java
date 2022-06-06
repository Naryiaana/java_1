package lesson6;

public class Wizard extends Player{
    public Wizard(String nickname, int point) {
        super(nickname, point, "Волшебница");
    }


    @Override
    public void doAction() {
        System.out.printf("%s %s кастует заклинание%n", getRussianProfessionTitle(), getNickname());
    }
}
