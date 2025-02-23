package in.sp.beans;

public class Address {

	private String city;
	private String zipCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "city " + city + "zipCode" + zipCode ;
	}
	
}
