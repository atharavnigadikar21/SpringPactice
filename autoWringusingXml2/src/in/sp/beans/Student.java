package in.sp.beans;

public class Student {

	private String name;
	private int rollNo;
	private Address address;
	private Subjects subjects;
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("name :" + name);
		System.out.println("rollNo :" + rollNo);
		System.out.println("Address :" + address );
		System.out.println("subjects :" + subjects );
		
		}
}
