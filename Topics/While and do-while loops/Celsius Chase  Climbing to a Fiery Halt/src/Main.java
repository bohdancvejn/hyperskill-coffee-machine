import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed
        int inputNumber = scanner.nextInt();

        while (inputNumber < 100) {
            if (maxTemperature <= inputNumber) {
                maxTemperature = inputNumber;
                inputNumber = scanner.nextInt();
            } else {
                inputNumber = scanner.nextInt();
            }
        }

        System.out.println(maxTemperature);
        scanner.close(); // Close the scanner
    }
}