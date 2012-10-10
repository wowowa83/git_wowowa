import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertTest {
	private Connection con;
	//private Statement stmt;
	private PreparedStatement pstmt;
	
	public InsertTest(int empno, String ename, double sal){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl",
					"scott", "1111");
			
			//String sql = "insert into emp(empno, ename, sal) values(" +
			//	empno + ",'" + ename + "'," + sal + ")";
			
			String sql = "insert into emp(empno, ename, sal) values(?,?,?)"; 
			
			//stmt = con.createStatement();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setDouble(3, sal);
			
			//int i = stmt.executeUpdate(sql);
			int i = pstmt.executeUpdate();
			
			System.out.println("처리된 레코드의 갯수 : " + i);
			
			//stmt.close();
			pstmt.close();
			
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
		new InsertTest(1, "Tom", 100);
	}
}
