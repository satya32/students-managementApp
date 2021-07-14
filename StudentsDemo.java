package studentsmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentsDemo {

	public static boolean insertStudentToDb(Students st) {
		boolean flag=false;
		
		try {
			// jdbc code.....
			Connection con=ConnectionProvider.connetionDatabase();//create connection using class and objects.
			String q="insert into students(firstName,lastName,phone ,city) value(?,?,?,?)";
			//prepared statement...
			PreparedStatement pmt= con.prepareStatement(q);
			pmt.setString(1, st.getFirstName());
			pmt.setString(2, st.getLastName());
			pmt.setString(3, st.getPhone());
			pmt.setString(4, st.getCity());
			//execute query..
			pmt.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static boolean deleteStudent(int userId) {
		
           boolean flag=false;
		
		try {
			// jdbc code.....
			Connection con=ConnectionProvider.connetionDatabase();//create connection using class and objects.
			String q="delete from students where studentId=?";
			//prepared statement...
			PreparedStatement pmt= con.prepareStatement(q);
			//set the value of parameter..
			pmt.setInt(1, userId);
		
			//execute query..
			pmt.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void showData() {
		 //boolean flag=false;
			
			try {
				// jdbc code.....
				Connection con=ConnectionProvider.connetionDatabase();//create connection using class and objects.
				String q="select * from students;";
				//prepared statement...
				Statement st=con.createStatement();
				//set the value of parameter..
				ResultSet set=st.executeQuery(q);
				while(set.next()) {
					int userId=set.getInt(1);
					String firstName=set.getString(2);
					String lastName=set.getString(3);
					String phone=set.getString(4);
					String city=set.getString("city");
					System.out.println("studentId " +  userId);
					System.out.println("firstNmae " +  firstName);
					System.out.println("lastNmae " +  lastName);
					System.out.println("student phone " +  phone);
					System.out.println("city " +  city);
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		
	}

	public static boolean updateData(Students st) {
		
          boolean flag=false;
		
		try {
			// jdbc code.....
			Connection con=ConnectionProvider.connetionDatabase();//create connection using class and objects.
			String q="UPDATE students SET firstName=?,lastName=?,phone=?,city=? WHERE studentId=? ";
			//prepared statement...
			PreparedStatement pmt= con.prepareStatement(q);
			
			pmt.setString(1, st.getFirstName());
			pmt.setString(2, st.getLastName());
			pmt.setString(3, st.getPhone());
			pmt.setString(4, st.getCity());
			pmt.setInt(5, st.getStudentId());
			//execute qu
			pmt.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
		
		
	}
}
