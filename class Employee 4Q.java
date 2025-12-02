class Employee {
    double calculateSalary() {
        return 0;
    }
}
class Intern extends Employee {
    double calculateSalary() {
        return 5000;
    }
}
class FullTime extends Employee {
    double calculateSalary() {
        return 40000;
    }
}
class PartTime extends Employee {
    double calculateSalary() {
        return 20000;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Intern();
        Employee e2 = new FullTime();
        Employee e3 = new PartTime();

        System.out.println("Intern Salary: " + e1.calculateSalary());
        System.out.println("FullTime Salary: " + e2.calculateSalary());
        System.out.println("PartTime Salary: " + e3.calculateSalary());
    }
}

OUTPUT:
Intern Salary: 5000.0
FullTime Salary: 40000.0
PartTime Salary: 20000.0
