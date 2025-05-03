public class week5task2 {
    
    // Write a method to print all odd numbers from 1 to a given number n
    void odd(int n) {
        System.out.print("Odd numbers from 1 to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    // Create a method to convert a given number of days into years, months, and days
    void convertDays(int days) {
        int years = days / 365;
        int months = (days % 365) / 30;
        int remainingDays = (days % 365) % 30;
        System.out.println(days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.");
    }

    // Write a method to determine whether a number is a Harshad number or not
    void isHarshad(int number) {
        int sum = 0;
        int n = number;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }

    // Write a method to count the number of words in a given string
    void countWords(String text) {
        int count = 0;
        boolean isWord = false;
        int endOfLine = text.length() - 1;

        for (int i = 0; i < text.length(); i++) {
            // Check if the character is a letter
            if (Character.isLetter(text.charAt(i)) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(text.charAt(i)) && isWord) {
                count++;
                isWord = false;
            } else if (Character.isLetter(text.charAt(i)) && i == endOfLine) {
                count++;
            }
        }

        System.out.println("Number of words in the given string: " + count);
    }

    // Write a method to calculate the compound interest given principal, rate, and time
    void compoundInterest(double principal, double rate, int time) {
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;
        System.out.println("Compound Interest: " + compoundInterest);
    }

    // Create a method to check whether a given number is a palindrome prime
    void isPalindromePrime(int number) {
        int reversed = 0, original = number;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    // Write a method to swap two numbers using a temporary variable
    void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Create a method to find the sum of the first n natural numbers
    void sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }

    // Write a method to print all factors of a number
    void printFactors(int number) {
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Create a method to calculate the cube of a given number
    void cube(int number) {
        int cube = number * number * number;
        System.out.println("Cube of " + number + ": " + cube);
    }

    // Write a method to determine if a number is a Duck number
    void isDuckNumber(int number) {
        String str = String.valueOf(number);
        if (str.contains("0") && str.charAt(0) != '0') {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }
    }

    // Create a method to print the multiplication tables from 1 to 10
    void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication Table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    // Write a method that returns the sum of squares of digits of a number
    void sumOfSquares(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        System.out.println("Sum of squares of digits: " + sum);
    }

    // Create a method to count uppercase and lowercase characters in a string
    void countUpperLower(String str) {
        int upperCount = 0, lowerCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }
        System.out.println("Uppercase letters: " + upperCount + ", Lowercase letters: " + lowerCount);
    }

    // Write a method to check if a number is a Kaprekar number
    void isKaprekar(int number) {
        int square = number * number;
        String strSquare = String.valueOf(square);
        int len = strSquare.length();
        String leftPart = strSquare.substring(0, len / 2);
        String rightPart = strSquare.substring(len / 2);
        int leftNum = leftPart.isEmpty() ? 0 : Integer.parseInt(leftPart);
        int rightNum = Integer.parseInt(rightPart);
        if (leftNum + rightNum == number) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is not a Kaprekar number.");
        }
    }

    // Create a method to reverse an integer number without converting it to a string
    void reverseInteger(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // Write a method to generate the first n terms of the Fibonacci series
    void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Create a method that accepts a character and returns its ASCII value
    void charToAscii(char ch) {
        int asciiValue = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
    }


    public static void main(String[] args) {
        week5task2 obj = new week5task2();
        // obj.odd(20);
        // obj.convertDays(450);
        // obj.isHarshad(18);
        // obj.countWords("Hello, something is better than nothing.");
        // obj.compoundInterest(10000, 5, 2);
        // obj.isPalindromePrime(121);
        // obj.swap(5, 10);
        // obj.sumOfNaturalNumbers(10);
        // obj.printFactors(28);
        // obj.cube(3);
        // obj.isDuckNumber(1023);
        // obj.multiplicationTable();
        // obj.sumOfSquares(1234);
        // obj.countUpperLower("Hello World!");
        // obj.isKaprekar(45);
        // obj.reverseInteger(12345);
        // obj.fibonacciSeries(10);
        // obj.charToAscii('A');  
    }
}
