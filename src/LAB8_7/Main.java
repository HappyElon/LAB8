package LAB8_7;

import java.util.Scanner;

public class Main {
    public static void primeFactors(int n, int divisor) {
        if (n <= 1) {
            return;
        }

        while (n % divisor == 0) {
            System.out.print(divisor + " ");
            n /= divisor;
        }

        primeFactors(n, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter your value: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("Число должно быть больше 1.");
        } else {
            System.out.print("Простые множители " + n + ": ");
            primeFactors(n, 2);
        }
    }
}

