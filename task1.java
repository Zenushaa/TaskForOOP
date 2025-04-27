import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Write a Java program to input your full name and print a greeting message.
        // System.out.println("Please enter your full name:");
        // String name = scanner.nextLine();
        // System.out.println("Hello, " + name + "! Welcome to the Java programming world.");

        // Take two numbers as input and print their sum, difference, product, and quotient.
        // System.out.println("Please enter two numbers:");
        // double num1 = scanner.nextDouble();
        // double num2 = scanner.nextDouble();
        // System.out.println("Sum: " + (num1 + num2));
        // System.out.println("Difference: " + (num1 - num2));
        // System.out.println("Product: " + (num1 * num2));
        // System.out.println("Quotient: " + (num1 / num2));

        // Write a program to check whether a given number is positive, negative, or zero using if-else.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // if (number > 0) {
        //     System.out.println("The number is positive.");
        // } else if (number < 0) {
        //     System.out.println("The number is negative.");
        // } else {
        //     System.out.println("The number is zero.");
        // }

        // Write a program that takes a number and checks if it is divisible by both 5 and 11.
        // System.out.println("Please enter a number:");
        // int num = scanner.nextInt();
        // if (num % 5 == 0 && num % 11 == 0) {
        //     System.out.println("The number is divisible by both 5 and 11.");
        // } else {
        //     System.out.println("The number is not divisible by both 5 and 11.");
        // }

        // Input three numbers and print the largest using if-else.
        // System.out.println("Please enter three numbers:");
        // int num1 = scanner.nextInt();
        // int num2 = scanner.nextInt();
        // int num3 = scanner.nextInt();
        // if (num1 >= num2 && num1 >= num3) {
        //     System.out.println("The largest number is: " + num1);
        // } else if (num2 >= num1 && num2 >= num3) {
        //     System.out.println("The largest number is: " + num2);
        // } else {
        //     System.out.println("The largest number is: " + num3);
        // }

        // Take a number from the user and print whether it is even or odd.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // if (number % 2 == 0) {
        //     System.out.println("The number is even.");
        // } else {
        //     System.out.println("The number is odd.");
        // }
        
        // Input the age of a person and check if they are eligible to vote (18 or older).
        // System.out.println("Please enter your age:");
        // int age = scanner.nextInt();
        // if (age >= 18) {
        //     System.out.println("You are eligible to vote.");
        // } else {
        //     System.out.println("You are not eligible to vote.");
        // }
        
        // Write a program to input a character and check if it is a vowel or a consonant using if-else.
        // System.out.println("Please enter a character:");
        // char ch = scanner.next().charAt(0);
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        //     System.out.println(ch + " is a vowel.");
        // } else {
        //     System.out.println(ch + " is a consonant.");
        // }

        // Take marks of five subjects and calculate the total, percentage, and grade using if-else.
        // System.out.println("Please enter marks for five subjects:");
        // double subject1 = scanner.nextDouble();
        // double subject2 = scanner.nextDouble();
        // double subject3 = scanner.nextDouble();
        // double subject4 = scanner.nextDouble();
        // double subject5 = scanner.nextDouble();
        // double total = subject1 + subject2 + subject3 + subject4 + subject5;
        // double percentage = (total / 500) * 100;
        // String grade;
        // if (percentage >= 90) {
        //     grade = "A+";
        // } else if (percentage >= 80) {
        //     grade = "A";
        // } else if (percentage >= 70) {
        //     grade = "B+";
        // } else if (percentage >= 60) {
        //     grade = "B";
        // } else if (percentage >= 50) {
        //     grade = "C";
        // } else if (percentage >= 40) {
        //     grade = "D";
        // } else {
        //     grade = "F";
        // }
        // System.out.println("Total Marks: " + total);
        // System.out.println("Percentage: " + percentage + "%");

        // Write a program to take a number from the user and print whether it is a leap year or not.
        // System.out.println("Please enter a year:");
        // int year = scanner.nextInt();
        // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //     System.out.println(year + " is a leap year.");
        // } else {
        //     System.out.println(year + " is not a leap year.");
        // }

        // Input a number from the user and display whether it is a prime number using a loop.
        // System.out.println("Please enter a number:");
        // int num = scanner.nextInt();
        // boolean isPrime = true;
        // if (num <= 1) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i <= Math.sqrt(num); i++) {
        //         if (num % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }
        // if (isPrime) {
        //     System.out.println(num + " is a prime number.");
        // } else {
        //     System.out.println(num + " is not a prime number.");
        // }

        // Write a program to print the multiplication table of a given number using loop.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // System.out.println("Multiplication Table of " + number + ":");
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(number + " x " + i + " = " + (number * i));
        // }
        
        // Take a number n and print the sum of first n natural numbers using a loop.
        // System.out.println("Please enter a number:");
        // int n = scanner.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum += i;
        // }
        // System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        // Write a program that prints all even numbers from 1 to 100 using  loop.
        // System.out.println("Even numbers from 1 to 100:");
        // for (int i = 1; i <= 100; i++) {
        //     if (i % 2 == 0) {
        //         System.out.print(i + " ");
        //     }
        // }

        // Input a number and display the factorial of that number using a  loop.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // int factorial = 1;
        // for (int i = 1; i <= number; i++) {
        //     factorial *= i;
        // }
        // System.out.println("The factorial of " + number + " is: " + factorial);

        // Take two numbers and an operator (+, -, *, /) and perform the operation using switch.
        // System.out.println("Please enter two numbers and an operator (+, -, *, /):");
        // double num1 = scanner.nextDouble();
        // double num2 = scanner.nextDouble();
        // char operator = scanner.next().charAt(0);
        // double result;
        // switch (operator) {
        //     case '+':
        //         result = num1 + num2;
        //         System.out.println("Result: " + result);
        //         break;
        //     case '-':
        //         result = num1 - num2;    
        //         System.out.println("Result: " + result);
        //         break;
        //     case '*':
        //         result = num1 * num2;
        //         System.out.println("Result: " + result);
        //         break;
        //     case '/':
        //         if (num2 != 0) {
        //             result = num1 / num2;
        //             System.out.println("Result: " + result);
        //         } else {
        //             System.out.println("Error: Division by zero is not allowed.");
        //         }
        //         break;
        //     default:
        //         System.out.println("Error: Invalid operator.");
        //         break;
        // }

        // Write a program to input a number from 1 to 7 and display the day of the week using switch.
        // System.out.println("Please enter a number (1-7):");
        // int day = scanner.nextInt();
        // String dayName;
        // switch (day) {
        //     case 1:
        //         dayName = "Monday";
        //         break;
        //     case 2:
        //         dayName = "Tuesday";
        //         break;
        //     case 3:
        //         dayName = "Wednesday";
        //         break;
        //     case 4:
        //         dayName = "Thursday";
        //         break;
        //     case 5:
        //         dayName = "Friday";
        //         break;
        //     case 6:
        //         dayName = "Saturday";
        //         break;
        //     case 7:
        //         dayName = "Sunday";
        //         break;
        //     default:
        //         dayName = "Invalid input! Please enter a number between 1 and 7.";
        // }
        // System.out.println("The day is: " + dayName);
        
        // Input a month number (1–12) and print the number of days in that month using switch.
        // System.out.println("Please enter a month number (1-12):");
        // int month = scanner.nextInt();
        // int days;
        // switch (month) {
        //     case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        //         days = 31;
        //         break;
        //     case 4: case 6: case 9: case 11:
        //         days = 30;
        //         break;
        //     case 2:
        //         days = 28; // Assuming it's not a leap year
        //         break;
        //     default:
        //         days = -1; // Invalid month
        // }
        // if (days == -1) {
        //     System.out.println("Invalid month number! Please enter a number between 1 and 12.");
        // } else {
        //     System.out.println("Number of days in month " + month + ": " + days);
        // }

        // Take a character input and use switch to display if it is a vowel (a, e, i, o, u).
        // System.out.println("Please enter a character:");
        // char character = scanner.next().charAt(0);
        // String result;
        // switch (character) {
        //     case 'a': case 'e': case 'i': case 'o': case 'u':
        //     case 'A': case 'E': case 'I': case 'O': case 'U':
        //         result = character + " is a vowel.";
        //         break;
        //     default:
        //         result = character + " is not a vowel.";
        // }
        // System.out.println(result);
        
        // Input a number and check if it is a perfect square using loop.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // boolean isPerfectSquare = false;
        // for (int i = 0; i <= number / 2; i++) {
        //     if (i * i == number) {
        //         isPerfectSquare = true;
        //         break;
        //     }
        // }
        // if (isPerfectSquare) {
        //     System.out.println(number + " is a perfect square.");
        // } else {
        //     System.out.println(number + " is not a perfect square.");
        // }

        // Write a program to find the sum of digits of a number using a loop.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // int sum = 0;
        // while (number != 0) {
        //     sum += number % 10;
        //     number /= 10;
        // }
        // System.out.println("The sum of digits is: " + sum);

        // Input a number and reverse it using loop.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // int reversedNumber = 0;
        // while (number != 0) {
        //     reversedNumber = reversedNumber * 10 + number % 10;
        //     number /= 10;
        // }
        // System.out.println("The reversed number is: " + reversedNumber);

        // Take a number and check whether it is a palindrome or not using if-else and loop.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // int originalNumber = number;
        // int reversedNumber = 0;
        // while (number != 0) {
        //     reversedNumber = reversedNumber * 10 + number % 10;
        //     number /= 10;
        // }
        // if (originalNumber == reversedNumber) {
        //     System.out.println(originalNumber + " is a palindrome.");
        // } else {
        //     System.out.println(originalNumber + " is not a palindrome.");
        // }

        // Input n and print the first n terms of the Fibonacci series.
        // System.out.println("Please enter a number:");
        // int n = scanner.nextInt();
        // int a = 0, b = 1, c;
        // System.out.print("Fibonacci series: " + a + " " + b);
        // for (int i = 2; i < n; i++) {
        //     c = a + b;
        //     System.out.print(" " + c);
        //     a = b;
        //     b = c;
        // }

        // Write a program to count how many digits are in a given number using a loop.
        // System.out.println("Please enter a number:");
        // int number = scanner.nextInt();
        // int count = 0;
        // while (number != 0) {
        //     number /= 10;
        //     count++;
        // }
        // System.out.println("The number of digits is: " + count);

        scanner.close();
    }
}