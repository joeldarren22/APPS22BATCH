package assignment;

public class MainEmpApp {
	
public static void main(String[] args) {
	
ManagerClass mac = new ManagerClass();
 
	mac.addEmployee(new Employee(100,"shivansh","clerk",25000.00));
	mac.addEmployee(new Employee(101,"kapil","manager",45000.00));
	mac.addEmployee(new Employee(102,"joel","manager",55000.00));
	mac.addEmployee(new Employee(103,"tejaswini","officer",55000.00));
	
	
	System.out.println("===========================================================");
  mac.empByDesg("manager");
  System.out.println("===========================================================");
  mac.empBySalary(45000.00d);
  System.out.println("===========================================================");
  mac.employeeDetail("shivansh");
  System.out.println("===========================================================");
  mac.clculateHRA("clerk", 25000.00d);
  System.out.println("===========================================================");
  mac.employeeDetail("joel");
}
}
