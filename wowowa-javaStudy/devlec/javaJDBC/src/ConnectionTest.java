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
			
			System.out.println("���� ����");
		}
		catch(ClassNotFoundException err){
			System.out.println("����̹��� ã�� �� �����ϴ� : " + err);
		}
		catch(SQLException err){
			System.out.println("�Ϲ� ���� : " + err);
		}
	}
}
