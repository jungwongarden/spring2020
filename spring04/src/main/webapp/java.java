package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBConnect {

	public void delete(String id) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. mySQL connector 연결 성공!!! ");
				
				//2. DB연결(winter, 3308)
				String url = "jdbc:mysql://localhost:3308/winter";
				String user = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. db연결 성공..!!");

				String sql = "delete from member where id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);
				
				System.out.println("3. sql문 객체로 만들어 줌 ok...객체화!!");
				
				ps.executeUpdate();
				System.out.println("4. sql문 db로 전송 ok....!!");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	public void insert(String id, String pw, String name, String tel) {
//	public static void main(String[] args) {
		//1. 커넥터 설정 해야함.
//		String name = JOptionPane.showInputDialog("이름 입력");
//		System.out.println("당신의 이름은 " + name);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. mySQL connector 연결 성공!!! ");
			
			//2. DB연결(winter, 3308)
			String url = "jdbc:mysql://localhost:3308/winter";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공..!!");

			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			
			System.out.println("3. sql문 객체로 만들어 줌 ok...객체화!!");
			
			ps.executeUpdate();
			System.out.println("4. sql문 db로 전송 ok....!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
