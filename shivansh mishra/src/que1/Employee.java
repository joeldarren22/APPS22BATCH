package assignment;

public class Employee {
	
private int empID;
private String empName;
private String desg;
private double basic;
private double HRA;

public Employee(int empID, String empName, String desg, double basic) {
	super();
	this.empID = empID;
	this.empName = empName;
	this.desg = desg;
	this.basic = basic;
//HRA = hRA;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public double getBasic() {
	return basic;
}
public void setBasic(double basic) {
	this.basic = basic;
}
/*public double getHRA() {
	return HRA;
}*/
/*public void setHRA(double hRA) {
	HRA = hRA;
}*/


@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ID : "+getEmpID()+",name : "+getEmpName()+",designation : "+getDesg()+",basic: "+getBasic()+/*"HRA : "+getHRA()+*/"]";
	}

}
