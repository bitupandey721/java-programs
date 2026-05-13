/********************************************************************************
 create employee named abstract class. inside that name and id.
create a abstract methode calculate salary. 
Create a noraml methode
create a another class, full time employee -> class monthly salary, which prints 

a another class part time emploee. -> rate per hour . prints part time salary

means output should show name, id, salary.
 ********************************************************************************/
abstract class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + id);
    }
}

class FullTimeEmployee extends Employee {

    int monthlySalary;

    FullTimeEmployee(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Full Time Salary : " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {

    int ratePerHour;
    int hoursWorked;

    PartTimeEmployee(String name, int id, int ratePerHour, int hoursWorked) {
        super(name, id);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        int salary = ratePerHour * hoursWorked;
        System.out.println("Part Time Salary : " + salary);
    }
}

public class database {

    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee("Shashank", 101, 500);

        PartTimeEmployee p1 = new PartTimeEmployee("Bitu", 102, 500, 6);

        f1.displayDetails();
        f1.calculateSalary();

        System.out.println();

        p1.displayDetails();
        p1.calculateSalary();
    }
}