


public class Employee {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;


	public Employee(String firstName_param, String lastName_param, String email_param, String phoneNumber_param) {
		this.firstName = firstName_param;
		this.lastName = lastName_param;
		this.email = email_param;
		this.phoneNumber = phoneNumber_param;

	}
	
	public Employee() {
		this.firstName = "Gary";
		this.lastName = "Oldman";
		this.email = "GOldman@email.edu";
		this.phoneNumber = "6082225687";
	}
	
	


	public void setfirst(String firstName) {this.firstName = firstName;}
	public void setlast(String lastName) {this.lastName = lastName;}
	public void setemail(String email) {this.email = email;}
	public void setphone(String phoneNumber) {this.phoneNumber = phoneNumber;}
	
	public String getfirst() {return this.firstName;}
	public String getlast() {return this.lastName;}
	public String getemail() {return this.email;}
	public String getphone() {return this.phoneNumber;}
	
	
	public String toString() {
		return( firstName + "\n" + lastName + "\n" + email + "\n" + phoneNumber + "\n");
	}
}

