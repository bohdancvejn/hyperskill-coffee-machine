import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        System.out.println(isDivByThreeAndFive(num) ? "FizzBuzz" :
                isDivByFive(num) ? "Buzz" :
                        isDivByThree(num) ? "Fizz" : "None");
    }

    // function isDivByThree will be here
    public static boolean isDivByThree(int input) {
        return input % 3 == 0;
    }

    // function isDivByFive will be here
    public static boolean isDivByFive(int input) {
        return input % 5 == 0;
    }

    // function isDivByThreeAndFive will be here
    public static boolean isDivByThreeAndFive(int input) {
        return isDivByThree(input) && isDivByFive(input);
    }
}