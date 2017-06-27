import java.sql.*;

class Batch {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/db", "root", "paras");
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.addBatch("insert into emp values(208,'Ricky')");
		stmt.addBatch("insert into emp values(209,'John')");

		stmt.executeBatch();

		con.commit();
		con.close();
	}
}