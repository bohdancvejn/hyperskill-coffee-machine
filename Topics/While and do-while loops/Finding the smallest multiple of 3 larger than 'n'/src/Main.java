import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input number
        int n = sc.nextInt();
        if (n > 0) {
            if (n % 3 == 0) {
                System.out.println(n);
            } else {
                if ((n + 1) % 3 == 0) {
                    System.out.println(n + 1);
                } else {
                    System.out.println(n + 2);
                }
            }
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}