package in.sp.factory;
import in.sp.interfaces.Employee;

class AndroidDev implements Employee {
    public void printSalary() {
        System.out.println("Android Developer Salary: $60,000");
    }

    public void printName() {
        System.out.println("Employee Role: Android Developer");
    }
}

// Web Developer Class
class WebDev implements Employee {
    public void printSalary() {
        System.out.println("Web Developer Salary: $55,000");
    }

    public void printName() {
        System.out.println("Employee Role: Web Developer");
    }
}