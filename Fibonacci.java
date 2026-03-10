import java.util.Scanner;

public class Fibonacci {
    public static void fibo(int n) {
        int a = 0, b = 1, c = 0;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n? :");
        int n = s.nextInt();
        fibo(n);
        s.close();
    }
}
