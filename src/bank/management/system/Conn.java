package bank.management.system;
//Java Database Connectivity (JDBC) has 5 steps
// 1.Register The Driver 2.Create Connection 3.Create Statements 4.Execute Query 5.Close Connection
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            //First of all we register driver
            //Class.forName(com.mysql.cj.jdbs.Driver);
            //Now Create Connection 
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Jayesh2811@");
            // Create statement
             s = c.createStatement();
            
            } catch (Exception e){
            System.out.println(e);
        }
    }
    
}
