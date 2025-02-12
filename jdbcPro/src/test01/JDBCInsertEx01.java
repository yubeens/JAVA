package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsertEx01 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/testdb"; 
        String user = "yubeen";  
        String pw = "1234";
        String driverName = "com.mysql.cj.jdbc.Driver";
        String sql = "INSERT INTO member(name, id, pw) VALUES ('조유빈', 'yubeens', '1234')"; 

        Connection conn = null;
        Statement st = null;

        try {
            // JDBC 드라이버 로드
            Class.forName(driverName);

            // 데이터베이스 연결
            conn = DriverManager.getConnection(url, user, pw);
            st = conn.createStatement();

            // SQL 실행
            int n = st.executeUpdate(sql);
            System.out.println(n + "개의 데이터를 추가하였습니다.");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC 드라이버 로드 실패!");
            e.printStackTrace();
        } catch (Exception ex) {
            System.out.println("데이터 처리 오류");
            ex.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}