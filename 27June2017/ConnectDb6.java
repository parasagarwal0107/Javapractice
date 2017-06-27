import java.sql.*;

public class ConnectDb6 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db", "root", "paras");
			DatabaseMetaData dbmd = con.getMetaData();
			String table[] = { "TABLE" };
			ResultSet rs = dbmd.getTables(null, null, null, table);
			while (rs.next()) {
				System.out.println(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
