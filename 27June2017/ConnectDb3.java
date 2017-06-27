import java.sql.*;

public class ConnectDb3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db", "root", "paras");
			PreparedStatement stmt = con
					.prepareStatement("update customer set id=? where Name=?");
			stmt.setInt(1, 103);
			stmt.setString(2, "Paras");
			int i = stmt.executeUpdate();
			System.out.println(i);
			ResultSet rs = stmt.executeQuery("select * from customer");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}