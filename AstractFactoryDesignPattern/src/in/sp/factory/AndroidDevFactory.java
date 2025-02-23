package in.sp.factory;

import in.sp.interfaces.Employee;
import in.sp.interfaces.EmployeeFactory;

//Step 4: Concrete Factories for Employee Creation

//Factory for Android Developers
class AndroidDevFactory implements EmployeeFactory {
 public Employee createEmployee() {
     return new AndroidDev();
 }
}

//Factory for Web Developers
class WebDevFactory implements EmployeeFactory {
 public Employee createEmployee() {
     return new WebDev();
 }
}
