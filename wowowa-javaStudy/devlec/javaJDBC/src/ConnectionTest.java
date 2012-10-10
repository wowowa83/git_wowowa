import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionTest {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = 
				DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl",
					"scott", "1111");
			
			System.out.println("연결 성공");
		}
		catch(ClassNotFoundException err){
			System.out.println("드라이버를 찾을 수 없습니다 : " + err);
		}
		catch(SQLException err){
			System.out.println("일반 예외 : " + err);
		}
	}
}
