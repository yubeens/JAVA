package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/sampledb";
		String id = "yubeen";
		String pw = "1234";
		String driverName = "com.mysql.cj.jdbc.Driver";
		String sql = "insert into board(title,content,writer)"
				+ "values('title10','추가할 내용입니다.','user00')";
		
		Connection conn = null;
		Statement st = null;
		//drive 로드
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url,id,pw);
			st = conn.createStatement();			
			//executeUpdate 쿼리를 업데이트
			int n = st.executeUpdate(sql);
			System.out.println(n+"개의 데이터를 추가했습니다.");
		//오류확인
		}catch(Exception ex) {
			System.out.println("데이터처리 오류");
			ex.printStackTrace();
		//close	
		}finally {
			try {
				st.close();
				conn.close();
			}catch(Exception ex) {}
		}
	}

}
