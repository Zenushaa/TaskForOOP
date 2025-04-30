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

    public static void main(String[] args) {
        week5task2 obj = new week5task2();
        // obj.odd(20);

        
    }
}
