interface Calculator {
    void add(int a, int b);
    void subtract(int a, int b);
    void multiply(int a, int b);
    void divide(int a, int b);
}

class MyCalculator implements Calculator {

    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    public void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}

public class ArithmeticOperations {
    public static void main(String[] args) {

        MyCalculator obj = new MyCalculator();

        obj.add(10, 20);
        obj.subtract(20, 10);
        obj.multiply(5, 4);
        obj.divide(20, 5);

    }
}