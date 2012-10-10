import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public SelectTest(){
		try{
			con = DBCon.getConnection();
			
			String sql = "select empno, ename, sal from emp";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			//rs.next();
			while(rs.next()){
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) +
					", " + rs.getDouble(3));
			}
			
			rs.close();
			stmt.close();
			con.close();
		}
		catch(SQLException err){
			System.out.println("일반 예외 : " + err);
		}
		catch(Exception err){
			
		}
	}
	
	public static void main(String[] args) {
		new SelectTest();
	}
}
