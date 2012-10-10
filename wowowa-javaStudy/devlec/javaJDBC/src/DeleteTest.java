import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteTest {
	private Connection con;
	private Statement stmt;
	
	public DeleteTest(int empno){
		try{
			con = DBCon.getConnection();
			
			String sql = "delete from emp where empno=" + empno;
			
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			
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
		new DeleteTest(1);
	}
}
