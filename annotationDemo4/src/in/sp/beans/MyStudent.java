
package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component ("stdObj")
public class MyStudent {
	@Value ("atharav")
	private String name;
	@Value("123")
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void stdDisplay() {
		System.out.println(name);
		System.out.println(rollNo);
	}
}
