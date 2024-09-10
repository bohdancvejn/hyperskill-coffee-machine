import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int butterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            System.out.println(butterCups >= 15 && butterCups <= 25);
        } else {
            System.out.println(butterCups >= 10 && butterCups <= 20);
        }

        scanner.close();
    }
}