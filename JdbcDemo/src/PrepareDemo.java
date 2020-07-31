import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
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
	
		
		/*PreparedStatement ps=c.prepareStatement("insert into employee values(?,?)");
		ps.setInt(1,401);
		ps.setString(2,"Sreenath");
		ps.executeUpdate();
		
		ps.setInt(1,501);
		ps.setString(2,"Yesuratnam");
		ps.executeUpdate();
		*/
		
		PreparedStatement ps=c.prepareStatement("update employee set eid=? where eid=?");
		ps.setInt(1,402);
		ps.setInt(2,501);
		ps.executeUpdate();
		System.out.println("Added");
		
		
		
		
		
		
		
	
	
	
	
	
	}

}
