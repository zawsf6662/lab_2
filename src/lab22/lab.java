package lab22;

import java.util.Scanner;

public class lab {

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        return score;
    }

    public static void main(String[] args) {
        System.out.print("GPA:");
        int a = inputInt();

        if (a >= 80) {
            System.out.println("Grade:  A");
        } else if (a >= 70) {
            System.out.println("Grade:  B");
        } else if (a >= 60) {
            System.out.println("Grade:  C");
        } else if (a >= 50) {
            System.out.println("Grade:  D");
        } else if (a < 50) {
            System.out.println("Grade:  F");
        }
    }
}
