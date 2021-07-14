package studentsmanagement;

import java.sql.DriverManager;

import java.sql.Connection;
// class for connection with data base
public class ConnectionProvider {
	 static Connection con;
	 // method for connection with database.
	public static Connection connetionDatabase() {
		
		try {
			//1.  load driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.create connection....
			String user="root";
			String password="satya1395";
			String url="jdbc:mysql://localhost:3306/student_management";
			con=(Connection) DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
