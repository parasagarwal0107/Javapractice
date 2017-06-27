import java.sql.*;

class ConnectDb2 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db", "root", "paras");

			PreparedStatement stmt = con
					.prepareStatement("insert into customer values(?,?)");
			stmt.setInt(1, 101);// 1 specifies the first parameter in the query
			stmt.setString(2, "Ratan");
			stmt.setInt(1, 102);
			stmt.setString(2, "Paras");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}