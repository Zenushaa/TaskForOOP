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


    public static void main(String[] args) {
        week5_task obj = new week5_task();
        // obj.primeOrNot(7);
        // obj.evenOrNot(10);
        // obj.table(5);
        // System.out.println("The product is: " + obj.multiply3(2, 3, 4));
        // obj.simpleInterest(1000, 5, 2);   
        // obj.areaOfRectangle();
        
    }
}
