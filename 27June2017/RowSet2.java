import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSet2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:mysql://localhost:3306/db");
		rowSet.setUsername("root");
		rowSet.setPassword("paras");

		rowSet.setCommand("select * from emp");
		rowSet.execute();
		rowSet.addRowSetListener(new MyListener());

		while (rowSet.next()) {

			System.out.println("Id: " + rowSet.getInt(1));
			System.out.println("Name: " + rowSet.getString(2));
		}

	}
}
class MyListener implements RowSetListener {
	public void cursorMoved(RowSetEvent event) {
		System.out.println("Cursor Moved");
	}

	public void rowChanged(RowSetEvent event) {
		System.out.println("Row Changed");
	}

	public void rowSetChanged(RowSetEvent event) {
		System.out.println("RowSet Changed");
	}
}
