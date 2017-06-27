import java.sql.*;
import java.io.*;

public class ConnectDb8 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db", "root", "paras");
			PreparedStatement ps = con.prepareStatement("Select * from image");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Blob b = rs.getBlob(2);
				byte[] barr = b.getBytes(1, (int) b.length());
				FileOutputStream fout = new FileOutputStream(
						"/home/optimus-78//image.png");
				fout.write(barr);
				fout.close();
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
