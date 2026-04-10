package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Talon's Sandwiches!");

        System.out.println("Choose your sandwich size: ");
        int size = input.nextInt();

/*  1: Regular: base price $5.45
    2: Large: base price $8.95 */
        System.out.println("Tell us how old are you: ");
        int age = input.nextInt();

    }
}
