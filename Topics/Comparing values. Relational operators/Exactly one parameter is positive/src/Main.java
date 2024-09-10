import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFirstPositive = Math.signum((double) scanner.nextInt()) == 1;
        boolean isSecondPositive = Math.signum((double) scanner.nextInt()) == 1;
        boolean isThirdPositive = Math.signum((double) scanner.nextInt()) == 1;

        System.out.println((isFirstPositive && !isSecondPositive && !isThirdPositive) ||
                (!isFirstPositive && isSecondPositive && !isThirdPositive) ||
                (!isFirstPositive && !isSecondPositive && isThirdPositive)
        );

        scanner.close();
    }
}
