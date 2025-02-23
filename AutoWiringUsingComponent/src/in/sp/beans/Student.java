package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int rollNo;
    private Address address;

    @Autowired  // ✅ Ensure Spring injects the Address bean
    public Student(@Value("Atharav") String name, 
                   @Value("121") int rollNo, 
                   Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
