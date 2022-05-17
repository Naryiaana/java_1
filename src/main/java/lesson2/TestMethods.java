package lesson2;

public class TestMethods {

    static int a = 1; //переменная с которой можно работать из любого метода
    static final int TAX_RUSSIA = 13; //это константа, чтобы сделать ее таковой мы финализируем ее final (Таким образом ее значение не будет меняться, а если поставить еще static, то она станет доступна везде (в любыз статических методах ниже

    public static void main(String[] args) {
        rewardEmployee("Олег", -5); //это аргмуенты
        rewardEmployee("Виталий", 600);
        rewardEmployee("Тимофей", 100);
//        rewardEmployee1();
    }

    private static void rewardEmployee(String name, int premium) {
        if (premium < 0) {
            System.out.println("Неправильное значение премии для сотрудника " + name);
            System.out.println();
            return;
        }
        // int premium = 500; компилятор ругается потому что мы уже создали переменную в скобках
        int premiumWithoutTax = getPremiumWithoutTax(premium);
//        int premiumWithoutTax = (int)(premium * (100 - TAX_RUSSIA) / 100); здесь могло бы быть и так, можем на очень мног растянуть, но на одно действие лучше один метод
        System.out.println("Готовим бумаги для премирования " + name);
        System.out.println("Выделяем бюджет для " + name + " на сумму " + premiumWithoutTax);
        System.out.println("Зачисляем на карточку средства для " + name + " на сумму " + premiumWithoutTax);
        System.out.println("Процесс завершен");
        System.out.println();
    }

    private static int getPremiumWithoutTax(int premium) {
       /* int premiumWithoutTax = (int)(premium * 0.87);
        return premiumWithoutTax; все избыточно можно просто написать внизу*/
//        return (int)(premium * 0.87); это без константы
        return (int)(premium * (100 - TAX_RUSSIA) / 100); //вот так работаем с константой
    }

    /*private static void rewardEmployee1() {
        int premium = 200;
        System.out.println("Готовим будмаги для премирования " + "Timofei");
        System.out.println("Выделяем бюджет для " + "Timofei" + " на сумму " + premium);
        System.out.println("Зачисляем на карточку средства для " + "Timofei" + " на сумму " + premium);
        System.out.println("Процесс завершен");
    }*/
}
