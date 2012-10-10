import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBCon {
	static Connection con;
	private DBCon(){}
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl",
				"scott", "1111");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){	
		return con;
	}
}
