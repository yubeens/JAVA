package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;


public class DAO { //객체변수는 null 값을 넣는거랑 똑같음.(null 생략 가능)
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	private void getConnect() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String id = "yubeen";
		String pw = "1234";
		
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB연결 성공");
			
		}catch(Exception ex) {
			System.out.println("DB연결 오류");
			ex.printStackTrace();
		}
	}
	private void closeDB() {
		try {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();                                   
			if(conn!=null)conn.close();
		}catch(Exception ex) {}
	}
	
	
//<CRUD EX>
	
	//1.입력
	public void insert(String title, String content, String writer) {
		String sql = "insert into board(title, content, writer) values(?,?,?)"; 
		//결과(입력)값이 많으면 ? 처리 후 prepareStatement로 나중에 넣어줘도 됨																		
		try {
			getConnect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			
			int n = ps.executeUpdate(); 
			System.out.println(n+"개의 데이터가 추가되었습니다.");
			
		}catch(Exception ex) {
			System.out.println("데이터 처리오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}

	
	//2.출력
	public void selectAll() {
		String sql = "select * from board";
		
		try {
			getConnect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); //읽어오는것(select)에만 executeQuery로 확인
			
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Timestamp postdate = rs.getTimestamp("postdate");
				
				System.out.printf("%d %s %s %s ", bno, title, content, writer);
				System.out.println(postdate);
			}
		}catch(Exception ex) {
			System.out.println("데이터 처리오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
	
	
	//3.수정
	public void update(String title, String content, int bno) {
		String sql = "update board set title=?, content=? where bno=?"; 
																				
		try {
			getConnect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, title); //숫자는 물음표 자리 숫자
			ps.setString(2, content);
			ps.setInt(3, bno);
			
			int n = ps.executeUpdate(); 
			System.out.println(n+"개의 데이터가 수정되었습니다.");
			
		}catch(Exception ex) {
			System.out.println("데이터 처리오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
	
	
	//4.삭제
	public void delete(int bno) {
        String sql = "delete from board where bno = ?";
        try {
            getConnect();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, bno);
            
            int n = ps.executeUpdate();
            System.out.println(n + "개의 데이터(행)가 삭제되었습니다.");
            
        } catch (Exception ex) {
        	System.out.println("데이터 삭제 오류");
            ex.printStackTrace();
        } finally {
            closeDB();
        }
	}
	
	//bno에 해당되는 레코드 1개를 가져오는 법
	public void selectOne(int bno) {
		String sql = "select * from board where bno = ?";
        try {
            getConnect();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, bno);
            rs = ps.executeQuery();
            
            if(rs.next()) {
            	int dbbno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Timestamp postdate = rs.getTimestamp("postdate");
				
				System.out.printf("%d %s %s %s ", dbbno, title, content, writer);
				System.out.println(postdate);
            }
           
        } catch (Exception ex) {
        	System.out.println("데이터 삭제 오류");
            ex.printStackTrace();
        } finally {
            closeDB();
        }	
    }
	
	
}
	
