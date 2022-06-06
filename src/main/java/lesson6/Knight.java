package lesson6;

public class Knight extends Player{
    private String swordTitle;
    public Knight(String nickname, int point, String swordTitle) {
        super(nickname, point, "Рыцарь");
        this.swordTitle = swordTitle;
    }

    @Override
    public void doAction() {
        System.out.printf("%s %s машет мечом %s%n", getRussianProfessionTitle(), getNickname(), getSwordTitle());
    }

    @Override
    public String toString() {
        return super.toString() + " и меч " + swordTitle;
    }

    public String getSwordTitle() {
        return swordTitle;
    }

    public void setSwordTitle(String swordTitle) {
        this.swordTitle = swordTitle;
    }
}
