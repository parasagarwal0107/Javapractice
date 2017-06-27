import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSet1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:mysql://localhost:3306/db");
		rowSet.setUsername("root");
		rowSet.setPassword("paras");

		rowSet.setCommand("select * from emp");
		rowSet.execute();

		while (rowSet.next()) {

			System.out.println("Id: " + rowSet.getInt(1));
			System.out.println("Name: " + rowSet.getString(2));
		}

	}
}