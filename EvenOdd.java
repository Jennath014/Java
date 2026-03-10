import java.util.Scanner;

public class EvenOdd {
    public static void evenOrOdd(int a) {
        if (a % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = s.nextInt();
        evenOrOdd(n);
        s.close();
    }
}
