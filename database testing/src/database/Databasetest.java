package database;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Databasetest {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root",
					"root");
		/*	Statement Stmp = (Statement) con.createStatement();
			ResultSet rs = (ResultSet) Stmp.executeQuery("select * from student");

			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " ");*/
			
			
			String query = " Insert into student (s_id, s_name , s_subject) values(?,?,?)";
			
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
			preparedStmt.setString(1, "123");
			preparedStmt.setString(2, "lenovo");
			preparedStmt.setString(3, "ds");
			
			// execute the preparedstatement
			preparedStmt.execute();
			System.out.println("Data inserted successfully");
			con.close();

		} catch (Exception e) {
			System.out.println(e);

			// TODO: handle exception
		}
	}

}
