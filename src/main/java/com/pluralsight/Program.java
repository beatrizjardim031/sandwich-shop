package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome to Talon's Sandwiches! %n%n");
//  Prompt a sandwich size

        System.out.println("Choose your sandwich size: ");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("Number: ");
        int size = input.nextInt();
        System.out.println(" ");

/*  1: Regular: base price $5.45
    2: Large: base price $8.95 */

        double regular = 5.45;
        double large = 8.95;

//  if size is more or size is less than 1, print invalid and run scanner again
        if (size > 2 || size < 1) {
            System.out.println("Invalid option, you can only choose between 1 or 2");
            System.out.println("Choose your sandwich size: ");
            System.out.print("Number: ");
            size = input.nextInt();

        }

//  I added the part 2 of the exercise by adding if user wants loaded or not
        System.out.println("Would you like your sandwich loaded? Type yes or no: ");

        input.nextLine(); // "eat" the leftover CRLF
        String isLoaded = input.nextLine();
        isLoaded =  isLoaded.toLowerCase(); // converts the string to lower case so the user will have flexibility
        if (isLoaded.equals("yes")){
            regular += 1.0;
            large += 1.75;
        }

        System.out.printf("%nTell us how old are you: ");
        int age = input.nextInt();

        if (age <= 17 && size == 1){
            System.out.println("Nice! You have 10% discount!");
            System.out.printf("Your total is: $%.2f", (regular * .9 ));

        } else if (age <= 17 && size == 2) {
            System.out.println("Nice! You have 10% discount!");
            System.out.printf("Your total is: $%.2f", (large * .9 ));

        } else if (age >= 65 && size == 1) {
            System.out.println("Nice! You have 20% discount!");
            System.out.printf("Your total is: $%.2f", (regular * .8 ));

        } else if (age >= 65 && size == 2) {
            System.out.println("Nice! You have 20% discount!");
            System.out.printf("Your total is: $%.2f", (large * .8 ));

        } else if (age >= 18 && age < 65 && size == 1){
            System.out.println("No discount today :(");
            System.out.printf("Your total is: $%.2f", regular);

        } else {
            System.out.println("No discount today :(");
            System.out.printf("Your total is: $%.2f", large);
        }

    }
}
