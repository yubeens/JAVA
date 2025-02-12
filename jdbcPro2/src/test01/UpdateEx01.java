package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String id = "yubeen";
		String pw = "1234";
		
		Connection conn = null;
		Statement st = null;
		
		//수정
		String sql = "update board set title ='수정제목', content = '수정내용' where bno = 1";
				
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url,id,pw);
			st = conn.createStatement();
			
			int n = st.executeUpdate(sql);
			System.out.println(n+"개의 데이터가 추가되었습니다.");

			
		}catch(Exception ex) {
			System.out.println("DB오류");
			//오류 이유
			ex.printStackTrace();
		}finally {
			try {
				st.close();
				conn.close();
			}catch(Exception ex) {}
		}
	}

}
