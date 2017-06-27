import java.sql.*;

public class ConnectDb4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db", "root", "paras");
			PreparedStatement stmt = con
					.prepareStatement("select * from customer");
			ResultSet rs = stmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			}
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
			System.out.println("Column Name of 2nd column: "+rsmd.getColumnName(2));  
			System.out.println("Column Type Name of 2nd column: "+rsmd.getColumnTypeName(2));
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}