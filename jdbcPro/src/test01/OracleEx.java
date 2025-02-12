package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로드 성공");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			
			Connection conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB연결 성공");
			
		}catch(ClassNotFoundException ex) {
			System.out.println("드라이버 로드 실패");
			ex.printStackTrace();
			
		}catch(SQLException ex) {
			System.out.println("DB연결 오류");
			ex.printStackTrace();
		}
	}

}
