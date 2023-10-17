package LAB8_5;

public class Main {
    public static int sumOfDigits(int N) {
        if (N < 10) {
            return N;
        }

        int lastDigit = N % 10;
        int remainingDigits = N / 10;

        int sum = sumOfDigits(remainingDigits) + lastDigit;
        return sum;
    }
    public static void main(String[] args) {
        int N = 12345;
        int result = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + result);
    }
}
