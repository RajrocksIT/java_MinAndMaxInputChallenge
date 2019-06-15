package com.rajeshchinni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//        -Before the user enters the number, print the message gEnter number:h
//        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//        Hint:
//        -Use an endless while loop.
//
//        Bonus:
//        -Create a project with the name MinAndMaxInputChallenge.

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstNumber = true;
         while (true){            // endless loop and it breaks if someone makes any mistake like entering alphabet or decimal

             System.out.println("Enter number:");
             boolean isAnInt = scanner.hasNextInt();

         if (isAnInt){
            int number = scanner.nextInt();

            if (firstNumber){         // this will only execute once when the user enters first number. with out if(first) condition, we would always see minimum value as 0.
                firstNumber = false;
                min = number;
                max = number;
            }

            if (number > max){
                max = number;
            }
             if (number < min){
                 min = number;
             }
         }else {
            break;   //breaks out of the loop if someone makes any mistake like entering alphabet or decimal
         }
         scanner.nextLine(); // handle end of line (enter key)
         }

        System.out.println("minimum number is " + min + " and maximum number is " + max);
         scanner.close();
    }
}

//    alternate way of doing
//    int min = 2147483647;
//    int max = -2147483648;
//         while (true){
//
//                 System.out.println("Enter number:");
//                 boolean isAnInt = scanner.hasNextInt();
//
//                 if (isAnInt){
//                 int number = scanner.nextInt();
//
//                 if (number > max){
//                 max = number;
//                 }
//                 if (number < min){
//        min = number;
//        }
//        }else {
//        break;
//        }
//        scanner.nextLine(); // handle end of line (enter key)
//        }
