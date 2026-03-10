import java.util.Scanner;

class Student
{
    int rollno;
    String name;
    int mark;
    static int count=0;

    Student()
    {
        rollno=0;
        name="unknown";
        mark=0;
        count++;
    }
    Student(int rno,String n,int m)
    {
        rollno=rno;
        name=n;
        mark=m;
        count++;
    }
    Student(Student s)
    {
        rollno=s.rollno;
        name =s.name;
        mark=s.mark;
        count++;
    }
    void show()
    {
        System.out.println(rollno+":"+name+":"+mark);
    }
    static void compare(Student s1,Student s2)
    {
        if(s1.mark>s2.mark)
        {
            System.out.println(s1.name+"has highest mark than"+s2.name);
        }
        else if(s1.mark<s2.mark)
        {
            System.out.println(s2.name+"has highest mark than"+s1.name);
        }
        else{
            System.out.println(s1.name+"and"+s2.name+"have equal mark");
        }
    }
}

public class RankList
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entries:");
        int n= sc.nextInt();
        Student[] s= new  Student[n];
        for(int i=0;i<n;i++)
        {
            s[i]=new Student();
            System.out.println("rollno:");
            s[i].rollno=sc.nextInt();
            System.out.println("name:");
            s[i].name=sc.next();
            System.out.println("mark:");
            s[i].mark=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(s[i].mark>s[j].mark)
                {
                    Student temp =s[i];
                    s[i]=s[j];
                    s[j]=temp;

                }
            }

        }

        System.out.println("Student details:");
        System.out.println("RollNO : Name: Mark");
        for(int i=0;i<n;i++)
        {
            s[i].show();
        }

        if(n>=2)
        {
            Student.compare(s[0],s[1]);
        }
        sc.close();    
    }
}