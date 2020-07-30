package assignment;

import java.util.ArrayList;

public class ManagerClass {

	static Employee emp;
	static ArrayList<Employee> al = new ArrayList<Employee>();
	
	void addEmployee(Employee emp) {

		al.add(emp);
		System.out.println("saved :: "+emp.getEmpID());
	}

	void printDET() {

		System.out.println(emp);
	}

	void clculateHRA(String desg, double basic) {
		if (desg.equalsIgnoreCase("manager")) {
			System.out.println("your HRA is = " + (basic*(.10)));
		} else if (desg.equalsIgnoreCase("officer")) {
			System.out.println("your HRA is = " + (basic*(.12)));
		} else if (desg.equalsIgnoreCase("clerk")) {
			System.out.println("your HRA is = " + (basic*(.15)));
		}
	}

	void employeeDetail(String eName) {
		for (Employee emp : al) {
			if (eName.equalsIgnoreCase(emp.getEmpName())) {
				System.out.println(emp);
			} else {
				System.out.println("no result");
			}
		}
	}
	
	void empBySalary(double sal){
		for (Employee emp : al) {
			if (sal == emp.getBasic()) {
				System.out.println(emp);
			} else {
				System.out.println("no result");
			}
	}
	}
	
	void empByDesg(String desg){
		for (Employee emp : al) {
			if (desg.equalsIgnoreCase(emp.getDesg())) {
				System.out.println(emp);
			} else {
				System.out.println("no result");
			}
	}	
	}

}
