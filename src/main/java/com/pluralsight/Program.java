package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome to Talon's Sandwiches! %n%n");

        System.out.println("Choose your sandwich size: ");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("Number: ");
        int size = input.nextInt();
        System.out.printf("%n");
/*  1: Regular: base price $5.45
    2: Large: base price $8.95 */

        System.out.printf("Tell us how old are you: ");
        int age = input.nextInt();

    }
}
