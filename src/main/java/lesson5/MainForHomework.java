package lesson5;

import java.util.Arrays;

public class MainForHomework {
    public static void main(String[] args) {
    Employee[] persArray = new Employee[5];
    persArray[0] = new Employee("George Davidson", "Java developer", "georgenotfound@gmail.com", 89679222555L,300000, 25);
    persArray[1] = new Employee("Clay Smith", "Streamer", "dream@gmail.com", 89679117755L,200000, 23);
    persArray[2] = new Employee("Nariana Ponomareva", "Engineer", "naryyaana@mail.ru", 89679112505L,300000, 25);
    persArray[3] = new Employee("Sargylana Ponomareva", "Senior Developer", "sargy@gmail.com", 89142997755L,500000, 61);
    persArray[4] = new Employee("Julia Danilova", "Teacher", "danilobaj@gmail.com", 89142567890L,30000, 22);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].printInfo();
            }
        }
    }
}
