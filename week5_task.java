import java.util.Scanner;

public class week5_task {
    // 1. Make a method to check if a number is prime or not.
    void primeOrNot(int a){

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }
    }
    // 2. Make a method to check if a given number n is even or not.
    void evenOrNot(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }
    }
    // 3. Make a method to print the table of a given number n.
    void table(int n){
        int i = 1;
        for (i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    } 
    // 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.  
    int multiply3(int a, int b, int c) {
        return a * b * c;
    }
    // 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.
    void simpleInterest(int p, int r, int t) {
        float si = (p * r * t) / 100;
        System.out.println("Simple Interest is: " + si);
    }
    // 6. Write a program to calculate the area of a rectangle using a method of your choice.
    void areaOfRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        sc.close();
        int area = length * width;
        System.out.println("Area of the rectangle is: " + area);
    }
    // 7. Calculates the factorial of a given number using the Java method.
    void factorial(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + a + " is: " + fact);
    }
    // 8. Calculate the nth Fibonacci number using the method.
    void fibo(int a){
        int i;
        int first=0;
        int second=1;
        int next;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        for (i = 2; i < a; i++) {
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
    // 9. Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.
    void gcd (int a, int b) {
        int i;
        int s = 0;
        for (i=1; i<=a && i<=b; i++){
            if (a%i==0 && b%i==0){
                s=i;
            }
        }
        System.out.println("The GCD of " + a + " and " + b + " is: " + s);
    }
    // 10. Write a Java program to display all prime numbers less than a given number and count all the prime numbers less than that number using functions. 
    void prime_less_then_(int a){
        int i;
        int count=0;
        for (i=2; i<a; i++){
            for(int j=1; j<i;j++){
                if (i%j==0){
                    count++;
                    if (count>2){
                        count=0;
                    }
                    System.out.println("count "+count);
                    System.out.println("i "+i);
                }
            }
            if (count<=2){
                // System.out.println(i + " is a prime number.");
            }
        }
    }






    public static void main(String[] args) {
        week5_task obj = new week5_task();
        // obj.primeOrNot(7);
        // obj.evenOrNot(10);
        // obj.table(5);
        // System.out.println("The product is: " + obj.multiply3(2, 3, 4));
        // obj.simpleInterest(1000, 5, 2);   
        // obj.areaOfRectangle();
        // obj.factorial(5);
        // obj.fibo(5);
        // obj.gcd(12, 18);
        obj.prime_less_then_(10);
    }
}
