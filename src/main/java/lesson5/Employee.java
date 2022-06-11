package lesson5;

import java.util.Arrays;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, long phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void printInfo() {
        System.out.println(this);
        }

    public String toString() {
        return String.format("Employee %s is a %s, their email: %s, their phone number: %d, their salary: %d, their age: %d%n", fullName, position, email, phoneNumber, salary, age);
    }

}

