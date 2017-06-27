import java.sql.*;

public class ConnectDb {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db", "root", "paras");
			// here db is database name, root is username and paras is the
			// password
			Statement stmt = con
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from emp");
			rs.last();
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			rs.first();
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			rs.absolute(3);
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
