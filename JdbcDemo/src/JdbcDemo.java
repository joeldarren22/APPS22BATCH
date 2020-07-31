import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	// Load The Driver

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
// Connection to database
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcbatch2","root","admin");
		if(c==null)
		{
			System.out.println("Connection Failed");
		}
		else if(c!=null)
		{
			System.out.println("Connection Established");
		}
		Statement st=c.createStatement();
		
		/*st.executeUpdate("insert into employee values(101,'Mohammed')");
		st.executeUpdate("insert into employee values(102,'Manjula')");
		st.executeUpdate("insert into employee values(103,'Tejasvini')");
		st.executeUpdate("insert into employee values(104,'Balaji')");
		st.executeUpdate("insert into employee values(105,'Lakshmi')");
		//st.executeUpdate("update employee set eid=201 where eid=100");
		
		
		System.out.println("Added record succefully");
		*/
		
		ResultSet res=st.executeQuery("select * from employee");
		
		/*res.next();// true if a row exists
		int x=res.getInt(1);
		String str=res.getString("ename");
		
		System.out.println(x   +   " " +str);
		*/
		
		
		while(res.next())
		{
		System.out.println(res.getInt(1) + "    " +res.getString("ename"));
		}
		
		
		
		
		
		
		
		
		
	st.close();
	c.close();
		
		
		
		
		

	}

}
