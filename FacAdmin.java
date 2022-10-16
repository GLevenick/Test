

public class FacAdmin extends Employee {
	private String adviseStudent;
	private String signupStudent;
	private String fireEmployee;
	private String officeLocation;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private int empSalary;
	private int empBonus;
	private int empPay;
	private String offLoc;
	
	public FacAdmin(String adviseStudent_param, String signupStudent_param, String fireEmployee_param) {
		this.adviseStudent = adviseStudent_param;
		this.signupStudent = signupStudent_param;
		this.fireEmployee = fireEmployee_param;
	}
	/*
	public void firstName(String firstName) {System.out.println(firstName);}
	public void lastName(String lastName) {System.out.println(lastName);}
	public void email(String email) {System.out.println(email);}
	public void phoneNumber(String phoneNumber) {System.out.println(phoneNumber);}
	
	
	public void setStudentAdvice(String advice) {this.adviseStudent = advice;}
	public void setSignup(String signUP) {this.signupStudent = signUP;}
	public void setFire(String setFire) {this.fireEmployee = setFire;}
	public void officeLocation(String officeLocation) {this.officeLocation = officeLocation;}
	
	*/
	public void setFirst(String firstName) {this.firstName = firstName;}
	public void setLast(String lastName) {this.lastName = lastName;}
	public void setEmail(String email) {this.email = email;}
	public void setphone(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public void setSalary(int empSalary) {this.empSalary = empSalary;}
	public void setBonus(int empBonus) {this.empBonus = empBonus;}
	public void setPay(int empPay) {this.empPay = empPay;}
	public void setOfficeLocation(String offLoc) {this.offLoc = offLoc;}
	
	public String getfirst() {return this.firstName;}
	public String getlast() {return this.lastName;}
	public String getemail() {return this.email;}
	public String getPhone() {return this.phoneNumber;}
	public int getSalary() {return this.empSalary;}
	public int getBonus() {return this.empBonus;}
	public int getPay() {return this.empPay;}
	public String getOfficeLocation() {return this.offLoc;}
	public static int calcSalary(int baseSalary) {return baseSalary;}
	
	public void printInfo() {
		System.out.println(adviseStudent + "\n" + signupStudent + "\n" + fireEmployee + "\n");
	}
	public int getEmpBonus() {
		return empBonus;
	}
	public void setEmpBonus(int empBonus) {
		this.empBonus = empBonus;
	}
}
