package lab2.pkg1;

import java.util.Scanner;

public class Lab21 {

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        return score;
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        String score = sc.next();
        return score;
    }

    public static void main(String[] args) {

        System.out.print("Enter Id:");
        int id = inputInt();
        System.out.print("Enter Name:");
        String name = inputString();
        System.out.print("Enter Age:");
        int age = inputInt();
        System.out.print("Enter GPA:");
        int gpa = inputInt();

        System.out.println("Student ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("GPA:" + gpa);
    }

}
