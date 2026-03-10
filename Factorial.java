import java.util.Scanner;

public class Factorial
{
    public static int fact(int x)
    {
        if(x==1 || x==0)
        {
            return 1;
        }
        else if(x<0)
        {
            System.out.println("-ve no has no factorial");
            return -1;
        }
        else
        {
            return x*fact(x-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Num:");
        int a= s.nextInt();
        System.out.println("factorial of num: "+ fact(a));
        s.close();
    }
}