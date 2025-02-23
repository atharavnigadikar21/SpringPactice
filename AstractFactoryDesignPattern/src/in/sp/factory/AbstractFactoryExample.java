package in.sp.factory;

import in.sp.interfaces.Employee;
import in.sp.interfaces.EmployeeFactory;

//Step 6: Client Code to Use Abstract Factory
public class AbstractFactoryExample {
 public static void main(String[] args) {
     // Choose Employee Type
     String employeeType = "Web";  // Change to "Web" to test Web Developer

     // Get the correct factory
     EmployeeFactory factory = AbstractEmployeeFactory.getEmployeeFactory(employeeType);

     // Create an Employee
     if (factory != null) {
         Employee employee = factory.createEmployee();
         employee.printName();
         employee.printSalary();
     } else {
         System.out.println("Invalid employee type.");
     }
 }
}
