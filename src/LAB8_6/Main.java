package LAB8_6;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }

        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter your value: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("NO");
        } else if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

