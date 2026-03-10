import java.util.Scanner;

interface Figure
{
    double area();
    double perimeter();
}

class Circle implements Figure
{
    float r;

    Circle(float r)
    {
        this.r = r;
    }

    public double area()
    {
        return 3.14 * r * r;
    }

    public double perimeter()
    {
        return 2 * 3.14 * r;
    }
}

class Rectangle implements Figure
{
    float l, b;

    Rectangle(float l, float b)
    {
        this.l = l;
        this.b = b;
    }

    public double area()
    {
        return l * b;
    }

    public double perimeter()
    {
        return 2 * (l + b);
    }
}

class FigureDemo
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Figure f;
        int choice;

        do
        {
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    float r = s.nextFloat();
                    f = new Circle(r);
                    System.out.println("Area of Circle: " + f.area());
                    System.out.println("Perimeter of Circle: " + f.perimeter());
                    break;

                case 2:
                    System.out.print("Enter length and breadth of rectangle: ");
                    float l = s.nextFloat();
                    float b = s.nextFloat();
                    f = new Rectangle(l, b);
                    System.out.println("Area of Rectangle: " + f.area());
                    System.out.println("Perimeter of Rectangle: " + f.perimeter());
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 3);

        s.close();
    }
}
