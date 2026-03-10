import java.util.Scanner;

public class Prime {
    void primeOrNot(int n) {
        if (n <= 1) {
            System.out.println("Not prime");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }

        System.out.println("Prime");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Num:");
        int n = s.nextInt();

        Prime t = new Prime();   // object creation
        t.primeOrNot(n);

        s.close();
    }
}
