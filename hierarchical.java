// LCA-2 Java Programming: Sarthak Deodhar TY-CSEA (27, Batch B)
import java.util.Scanner;
class Person
 {
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    void showPerson() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person 
{
    int roll;
    String course;

    Student(String name, int age, int roll, String course) 
    {
        super(name, age);
        this.roll = roll;
        this.course = course;
    }

    void showStudent()
     {
        System.out.println("Details Of Student:");
        showPerson();
        System.out.println("Roll No: " + roll);
        System.out.println("Course: " + course);
    }
}

class Employee extends Person 
{
    int empId;
    String dept;

    Employee(String name, int age, int empId, String dept)
     {
        super(name, age);
        this.empId = empId;
        this.dept = dept;
    }

    void showEmployee()
     {
        System.out.println("Details Of Employee");
        showPerson();
        System.out.println("Emp ID: " + empId);
        System.out.println("Dept: " + dept);
    }
}

public class hierarchical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name: ");
        String n = sc.nextLine();
        System.out.println("Enter Student Age: ");
        int a = sc.nextInt();
        System.out.println("Enter Student RollNo: ");
        int r = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Student Course: ");
        String c = sc.nextLine();

        Student s = new Student(n, a, r, c);

        System.out.println("Enter Employee Name: ");
        String n1 = sc.nextLine();
        System.out.println("Enter Employee Age:");
        int a1 = sc.nextInt();
        System.out.println("Enter Employee Id: ");
        int id1 = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Employee Department: ");
        String d1 = sc.nextLine();

        Employee e = new Employee(n1, a1, id1, d1);
        s.showStudent();
        System.out.println();
        e.showEmployee();
        
        sc.close();
    }
}