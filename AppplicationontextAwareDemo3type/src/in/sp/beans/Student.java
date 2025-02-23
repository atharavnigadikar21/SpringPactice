package in.sp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements ApplicationContextAware{
	 
	private String name;
	private int rollNo;
	
	private Address address;
	
	private ApplicationContext applicationContext;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	private BeanFactory beanFactory;
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
	
	public void display() {
		System.out.println("name " + name);
		System.out.println("name " + rollNo);
		
		Address add = (Address)applicationContext.getBean("addId");
		System.out.println("Adress" +address);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}
	
}
