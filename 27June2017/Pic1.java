import java.sql.*;
import java.io.*;

public class Pic1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db", "root", "paras");
			PreparedStatement ps = con
					.prepareStatement("Insert into picture values(?,?)");
			ps.setString(1, "Mohit");
			FileInputStream fin = new FileInputStream(
					"/home/optimus-78//im.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
