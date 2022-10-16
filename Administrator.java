

class Administrator extends Employee
{
	private String repairWork;
	private String troubleShoot;
	private String workHours;
	private String officeLocation;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private int empSalary;
	private int empBonus;
	private int empPay;
	private String offLoc;
	
	

	public Administrator(String repairWork_param, String troubleShoot_param, String workHours_param) {
		this.repairWork = repairWork_param;
		this.troubleShoot = troubleShoot_param;
		this.workHours = workHours_param;
	}
	
	public Administrator() {
		this.troubleShoot = "Administrator troubleshoots the Network";
		this.repairWork = "Administrator fixes connectivity";
		this.workHours = "9AM to 5PM, on call on weekends.";
	}
	/*
	public void firstName(String firstName) {System.out.println(firstName);}
	public void lastName(String lastName) {System.out.println(lastName);}
	public void email(String email) {System.out.println(email);}
	public void phoneNumber(String phoneNumber) {System.out.println(phoneNumber);}
	public void officeLocation(String officeLocation) {System.out.println(officeLocation);}
	public static int calcSalary(int baseSalary, int bonus) {return baseSalary + bonus;}
	
	public void troubleShoot(String troubleShoot) {this.troubleShoot = troubleShoot;}
	public void repairWork(String repairWork) {this.repairWork = repairWork;}
	public void workHours(String workHours) {this.workHours = workHours;}
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
	
	void printInfo() {
		System.out.println(troubleShoot + "\n" + repairWork + "\n" + workHours + "\n");
	}
	
}