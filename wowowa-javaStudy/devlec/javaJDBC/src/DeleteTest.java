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
			
			System.out.println("ó���� ���ڵ��� ���� : " + i);
			
			stmt.close();
			con.close();
		}
		catch(SQLException err){
			System.out.println("�Ϲ� ���� : " + err);
		}
		catch(Exception err){
			err.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new DeleteTest(1);
	}
}
