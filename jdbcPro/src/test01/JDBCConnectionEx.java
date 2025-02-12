package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class JDBCConnectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//드라이버 로드
			String driverName="com.mysql.cj.jdbc.Driver";
			Class.forName(driverName);
			System.out.println("드라이버 로드 성공");
			
			String url="jdbc:mysql://localhost:3306/sampledb";
			String id="yubeen";
			String pw="1234";
			
			//DB주소를 통한 DB연결
			Connection conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB연결 성공");
			
			//쿼리문 작성을 위한 Statement 생성
			Statement stmt=conn.createStatement();
			String sql="select * from board";
			
			//쿼리결과를 보기 위한 ResultSet 생성
			ResultSet rs = stmt.executeQuery(sql);  
			
			//ResultSet 출력
			while(rs.next()) {
				int bno=rs.getInt("bno");
				String title=rs.getString("title");
				String content=rs.getString("content");
				String writer=rs.getString("writer");
				Timestamp date=rs.getTimestamp("postdate");
				System.out.printf("%d %s %s %s ",bno,title,content,writer);
				System.out.println(date);
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}catch(SQLException ex) {
			System.out.println("DB연결 오류");
			ex.printStackTrace();
		}
			
		
	}

}
