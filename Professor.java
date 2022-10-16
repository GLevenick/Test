


class Professor extends Employee
{
	
	private boolean isAdjunct;
	private String teachClass;
	private String sendAnnouncement;
	private String officeHours;
	private String officeLocation;
	private int empBonus;
	private int empSalary;
	private String email;
	private String lastName;
	public String firstName;
	private int empPay;
	private String offLoc;
	private String phoneNumber;
	
	
	public Professor(String teachClass_param, String sendAnnouncement_param, String officeHours_param, boolean isAdjunct_param) {
		this.teachClass = teachClass_param;
		this.sendAnnouncement = sendAnnouncement_param;
		this.officeHours = officeHours_param;
		this.isAdjunct = isAdjunct_param;
		
	}
	
	public Professor() {
		this.isAdjunct = false;
		this.teachClass = "Lesson plan";
		this.sendAnnouncement = "Announcement";
		this.officeHours = "9AM to 3PM";
	}
	public void setFirst(String firstName) {this.firstName = firstName;}
	public void setLast(String lastName) {this.lastName = lastName;}
	public void setEmail(String email) {this.email = email;}
	public void setphone(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public void setSalary(int empSalary) {this.empSalary = empSalary;}
	public void setBonus(int empBonus) {this.empBonus = empBonus;}
	public void setPay(int empPay) {this.empPay = empPay;}
	public void setOfficeLocation(String offLoc) {this.offLoc = offLoc;}
	
	public String getFirst() {return this.firstName;}
	public String getLast() {return this.lastName;}
	public String getEmail() {return this.email;}
	public String getPhone() {return this.phoneNumber;}
	public int getSalary() {return this.empSalary;}
	public int getBonus() {return this.empBonus;}
	public int getPay() {return this.empPay;}
	public String getOfficeLocation() {return this.offLoc;}
	/*
	public void firstName(String firstName) {System.out.println(firstName);}
	public void lastName(String lastName) {System.out.println(lastName);}
	public void email(String email) {System.out.println(email);}
	public void phoneNumber(String phoneNumber) {System.out.println(phoneNumber);}

	public static int calcSalary(int baseSalary, int bonus, int extraPay) {return baseSalary + bonus + extraPay;}
	
	
	public void teachClass(String teachClass) {this.teachClass = teachClass;}
	public void sendAnnouncement(String sendAnnouncement) {this.sendAnnouncement = sendAnnouncement;}
	public void officeHours(String officeHours) {this.officeHours = officeHours;}
	public String getAdjunctStatus() {
		if(this.isAdjunct == false) {return "Professor";}else {return "Adjunct Professor";}
	}
	public void officeLocation(String officeLocation) {this.officeLocation = officeLocation;}
*/
	void printInfo() {
		System.out.println(teachClass + "\n" + sendAnnouncement + "\n" + officeHours + "\n" + getAdjunctStatus() + "\n");
	}
	
}


	
	
	
	
	
	
	
}