import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero");

        scanner.close();
    }
}