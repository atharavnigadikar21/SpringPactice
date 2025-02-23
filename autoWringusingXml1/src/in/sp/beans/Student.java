package in.sp.beans;

public class Student {

	private String name;
	private int rollNo;
	private Address address;

	public Student (String name,int rollNo,Address address) {
		this.address=address;
		this.name=name;
		this.rollNo=rollNo;
	}
	public void display() {
		System.out.println("name :" + name);
		System.out.println("rollNo :" + rollNo);
		System.out.println("Address :" + address );
		}
}
