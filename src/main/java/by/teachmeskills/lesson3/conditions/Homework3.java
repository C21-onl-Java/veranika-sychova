package by.teachmeskills.lesson3.conditions;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int a = number % 2;
        if (a == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }

}

