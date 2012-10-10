import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateTest {
	private Connection con;
	//private Statement stmt;
	private PreparedStatement stmt;
	
	public UpdateTest(int empno, String ename, double sal){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl",
					"scott", "1111");
			
			//String sql = "update emp set ename='" + ename + "', sal=" + sal +
			//	" where empno=" + empno;
			
			String sql = "update emp set ename=?, sal=? where empno=?";
			
			//stmt = con.createStatement();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, ename);
			stmt.setDouble(2, sal);
			stmt.setInt(3, empno);
			
			int i = stmt.executeUpdate();
			
			System.out.println("처리된 레코드의 갯수 : " + i);
			
			stmt.close();
			con.close();
		}
		catch(SQLException err){
			System.out.println("일반 예외 : " + err);
		}
		catch(Exception err){
			err.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UpdateTest(1, "Tommy", 500);
	}
}
