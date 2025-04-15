//Read the data from the table.
import java.sql.*;
public class ReadData {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ReadData()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
            System.out.println("Connection Established");
            ps = con.prepareStatement("select * from accounts");
            rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new ReadData();

    }

}