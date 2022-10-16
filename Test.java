import java.util.Scanner;

import Employee.Professor;

import java.util.ArrayList;

public class Test {
	
	static Professor profArray[];
	static FacAdmin facArray[];
	static Administrator adminArray[];
	static Scanner scanner = new Scanner(System.in);	
	
	
	public static void main(String[] args) {
		
	boolean noQuit = true;

	while(noQuit) {
		System.out.println("---Main Menu---");
		System.out.println("Manage Employee by type." + "\n" + "1. Professor" + "\n" + "2. Faculty Admin" + "\n" +  "3. Administrator" + "\n" + "Q. Quit");            
		
		String input = scanner.nextLine();
		if (input.compareTo("Q") == 0) {
			System.out.println("Goodbye Mr. Bond.");
			break;
		}else if(input.compareTo("1") == 0) {
			handleProfessor();
		} else if (input.compareTo("2") == 0) {
			handleFacAdmin();
		} else if (input.compareTo("3") == 0) {
			handleAdmin();
		}
    else {
        System.out.println("bad input. Try again");
    }
	}
	}
	public static void handleProfessor() {
		    
			if (profArray.length == 0) {
		        System.out.println("You have no Professors employed. Enter Professor First Name, Last Name, Email, Phone Number, Salary, Bonus, Extra Pay, and Office Location.");
		        String input = scanner.nextLine();
		        
		    } else {
		        System.out.println("Professors on the payroll. Choose a professor to modify, or press C to create");
		        	for (int i = 0; i < profArray.length; i++) { 
		        		System.out.println(String(i) + profArray[i].firstName);
		        	}
		        // Scanner - take in input as int 
		        System.out.println(" Choose what to do with this professor" + "\n" + "1. Modify" + "\n" + "2. Delete" + "\n" + "Q. Quit");
		    }
		}
	
    private static int String(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void handleAdmin() {

    }
    public static void handleFacAdmin() {

    }
    public static void updateProf() {

    }
    public static void updateFac() {

    }
    public static void updateAdmin() {

    }
    public static void createProf() {

    }
    public static void createFac() {

    }
    public static void createAdmin() {

    }

}


//System.out.println("Create Employee by type." + "\n" + "1. Professor" + "\n" + "2. Faculty Admin" + "\n" +  "3. Administrator" + "\n" + "Q. Quit");