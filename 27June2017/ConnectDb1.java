import java.sql.*;

public class ConnectDb1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db", "root", "paras");
			PreparedStatement stmt = con
					.prepareStatement("Insert into customer values(?,?)");
			stmt.setInt(1, 101);
			stmt.setString(2, "Paras");
			int i = stmt.executeUpdate();
			System.out.println(i);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
