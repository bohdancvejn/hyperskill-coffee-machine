import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isZero = false;

        while (!isZero) {
            int input = scanner.nextInt();
            if (input != 0) {
                sum += input;
            } else {
                isZero = true;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}