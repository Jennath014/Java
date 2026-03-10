import java.util.Scanner;

class Person
{
    String name;
    String gender;
    String address;
    int age;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person
{
    int empid;
    String company_name;
    String qualification;
    int salary;

    void display()
    {
        super.display();
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}

class Teacher extends Employee
{
    String subject;
    String department;
    int teacher_id;

    void display()
    {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacher_id);
    }
}

class PersonDemo
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = s.nextInt();
        s.nextLine(); // ✅ FIX

        Teacher[] t = new Teacher[n];

        for(int i = 0; i < n; i++)
        {
            t[i] = new Teacher();

            System.out.print("Enter name: ");
            t[i].name = s.nextLine();

            System.out.print("Enter gender: ");
            t[i].gender = s.nextLine();

            System.out.print("Enter address: ");
            t[i].address = s.nextLine();

            System.out.print("Enter age: ");
            t[i].age = s.nextInt();

            System.out.print("Enter employee ID: ");
            t[i].empid = s.nextInt();
            s.nextLine();

            System.out.print("Enter company name: ");
            t[i].company_name = s.nextLine();

            System.out.print("Enter qualification: ");
            t[i].qualification = s.nextLine();

            System.out.print("Enter salary: ");
            t[i].salary = s.nextInt();
            s.nextLine();

            System.out.print("Enter subject: ");
            t[i].subject = s.nextLine();

            System.out.print("Enter department: ");
            t[i].department = s.nextLine();

            System.out.print("Enter teacher ID: ");
            t[i].teacher_id = s.nextInt();
            s.nextLine();

            
        }
        for(int i = 0; i < n; i++)
        {
        System.out.println("\nTeacher Details:");
            t[i].display();
        }
        s.close();
    }
}
