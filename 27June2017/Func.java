    import java.sql.*;  
      
    public class Func {  
    public static void main(String[] args) throws Exception{  
      
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/db", "root", "paras");
      
    CallableStatement stmt=con.prepareCall("{call CalcIncome(?)}");  
    stmt.setInt(1,1000);
    stmt.registerOutParameter(1,Types.INTEGER);  
    stmt.execute();  
      
    System.out.println(stmt.getInt(1));  
              
    }  
    }  