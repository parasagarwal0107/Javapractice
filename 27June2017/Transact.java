import java.sql.*;

public class Transact {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/db", "root", "paras");
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into customer values(3,'Rohit')");
		stmt.executeUpdate("insert into customer values(4,'Sonal')");

		con.rollback();
		con.close();
	}
}