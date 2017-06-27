    import java.sql.*;  
    public class Proc {  
    public static void main(String[] args) throws Exception{  
      
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/db", "root", "paras");
      
    CallableStatement stmt=con.prepareCall("{call CalcIncome(?)}");  
    stmt.setInt(1,1011);
    stmt.execute();  
      
    System.out.println("success");  
    }  
    }  