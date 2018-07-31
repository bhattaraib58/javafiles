/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bhattaraib58
 */
public class JdbcPractice
{
    public static void main(String[] args) throws SQLException
    {
        /**
         * 3306 is the default port for MySQL in XAMPP. 
         * Note both the 
         * MySQL server and Apache must be running. 
         */
        String url = "jdbc:mysql://localhost:3306/test";

        /**
         * The MySQL user.
         */
        String user = "root";

        /**
         * Password for the above MySQL user. If no password has been 
         * set (as is the default for the root user in XAMPP's MySQL),
         * an empty string can be used.
         */
        String password = "";
        
        Connection conn=null;
        Statement st = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, password);
            if(conn!=null)
            {
                System.out.println("Connection has been Established !!");
            }
            st = conn.createStatement();

            /**
             * Create and select a database for use. 
             */
           if(st.execute("CREATE DATABASE IF NOT EXISTS test"))
           {
               System.out.println("Database has been Created");
           }
//           PizzaDeliveryDatabase
           else
           {
               System.out.println("Database Already Created !!");
           }
           ResultSet rs=null;
           rs=st.executeQuery("Select * from test_table;");
           if(rs!=null)
           {
//               rs.first();
               while(rs.next())
               {
                     int id=rs.getInt("id");
                     System.out.println(id);
                }
           }
        } 
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        } 
        catch (SQLException ex)
        {
                System.out.println(ex);
        }
        finally
        {
            if(conn!=null)
            {
                conn.close();
            }
            if(st!=null)
            {
                st.close();
            }
        }
        
    }
}
