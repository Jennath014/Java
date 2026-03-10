import java.util.Scanner;

public class Table
{
    void multiple(int n)
    {
        System.out.println("Multiplication of "+n);
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+n+"="+i*n);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Num:");
        int n=s.nextInt();
        Table t = new Table();
        t.multiple(n);
        s.close();
    }
}