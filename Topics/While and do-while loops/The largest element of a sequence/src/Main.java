import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue = 0;
        int inputNumber = scanner.nextInt();

        while (inputNumber != 0) {
            inputNumber = maxValue < inputNumber ? maxValue = inputNumber : scanner.nextInt();
        }

        System.out.println(maxValue);
        scanner.close();
    }
}