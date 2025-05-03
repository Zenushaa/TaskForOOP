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

    public static void main(String[] args) {
        week5task2 obj = new week5task2();
        // obj.odd(20);
        // obj.convertDays(450);
        // obj.isHarshad(18);
        // obj.countWords("Hello, something is better than nothing.");
        // obj.compoundInterest(10000, 5, 2);
        // obj.isPalindromePrime(121);





        
    }
}
