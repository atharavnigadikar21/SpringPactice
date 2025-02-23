package in.sp.factory;

import in.sp.interfaces.EmployeeFactory;

//Step 5: Abstract Factory to Return the Right Employee Factory
class AbstractEmployeeFactory {
 public static EmployeeFactory getEmployeeFactory(String type) {
     if (type.equalsIgnoreCase("Android")) {
         return new AndroidDevFactory();
     } else if (type.equalsIgnoreCase("Web")) {
         return new WebDevFactory();
     }
     return null;
 }
}

