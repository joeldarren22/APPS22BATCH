class Employee
{
// attributes for Employee
private int eid;
public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
private String ename;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + "]";
}



}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee emp=new Employee(101,"Amresh");
	System.out.println(emp);

	
	}

}
