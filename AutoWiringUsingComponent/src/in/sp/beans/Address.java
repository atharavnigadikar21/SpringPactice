package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // ✅ Register Address as a Spring Bean
public class Address {
    private int houseNo;
    private String city;
    private int pinCode;

    public Address(@Value("123321") int houseNo, 
                   @Value("Latur") String city, 
                   @Value("413512") int pinCode) {
        this.houseNo = houseNo;
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address [houseNo=" + houseNo + ", city=" + city + ", pinCode=" + pinCode + "]";
    }
}
