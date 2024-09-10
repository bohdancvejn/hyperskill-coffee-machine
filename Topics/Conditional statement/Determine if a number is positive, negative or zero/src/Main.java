import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new Scanner object for reading the input
        Scanner scanner = new Scanner(System.in);

        // Read the number N
        int n = scanner.nextInt();

        // Your code goes here
        System.out.println(n > 0 ? "Positive" : n == 0 ? "Zero" : "Negative");

        // Important: Remember to close the scanner!
        scanner.close();
    }
}