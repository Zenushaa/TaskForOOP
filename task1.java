import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Write a Java program to input your full name and print a greeting message.
        System.out.println("Please enter your full name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Java programming world.");
    }
}