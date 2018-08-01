/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author bhattaraib58
 */
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class PizzaDeliveryDatabase
{
    Connection conn=null;
    PreparedStatement smt=null;
    boolean openDatabaseConnection()
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/pizza";
            String username="root";
            String password="";
            if(conn==null)
            {
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection(url,username,password);
            }
            if(conn!=null)
            {
                System.out.println("Connection Created !!!");
            }
        } 
        catch (ClassNotFoundException ex)
        {
               System.out.println(ex);
               return false;
        } 
        catch (SQLException ex)
        {
               System.out.println(ex);
               return false;
        }
        return true;
    }
    boolean addPizzaToDatabase(Pizza pizza)
    {
        if(openDatabaseConnection())
        {
            String query="INSERT INTO `pizza_orders`(`UserName`, `Phoneno`, `pizza_type`, `pizza_size`, `toppings`) VALUES (?,?,?,?,?);";
            try
            {
                smt=conn.prepareStatement(query);
                smt.setString(1, pizza.getName());
                smt.setLong(2, pizza.getPhoneno());
                smt.setString(3, pizza.getType());
                smt.setString(4, pizza.getSize());
                String t = "";
                for(String s:pizza.getToppings())
                {
                    if(s!=null)
                    {
                        t=t.concat(s);
                        t.concat(", ");
                    }
                }
                smt.setString(5,t);
                int result=smt.executeUpdate();
                if(result==1)
                {
                    System.out.println("Data Added Sucessfully");
                }
                else
                {
                    System.out.println("Error Occured While Adding Data");
                }
            } 
            catch(MySQLIntegrityConstraintViolationException ex)
            {
                String s=ex.toString();
                if(s.contains("Duplicate entry"))
                {
                      JOptionPane.showMessageDialog(null, "The Data with username has been added !! Enter Other username", "Error", JOptionPane.ERROR_MESSAGE);
                }
                return false;
            }
            catch (SQLException ex)
            {
                System.out.println(ex);
                return false;
            }
            finally
            {
                    try
                    { 
                        if(conn!=null)
                       {
                            conn.close();  
//                            System.out.println("conn::"+conn);
                        }
                        if(smt!=null)
                        { 
                            smt.close();
//                            System.out.println("SMT::"+smt);
                        }
                    } 
                    catch (SQLException ex)
                    {
                        
                     }
            }
        }
        else
        {
            System.out.println("Error Occured While creating Connection !!");
        }
        return true;
    }
    
    boolean viewPizzaDatabase()
    {
        if(openDatabaseConnection())
        {
            int i=1,j=0;
            String [][]pizzaRowData=new String[15][6];
            String query="SELECT `UserName`, `Phoneno`, `pizza_type`, `pizza_size`, `toppings` FROM `pizza_orders`; ";
            try
            {
                Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery(query);
                rs.first();
                do
                {
                    pizzaRowData[j][0]=Integer.toString(i);
                    pizzaRowData[j][1]=rs.getString(1);
                    pizzaRowData[j][2]=rs.getString(2);
                    pizzaRowData[j][3]=rs.getString(3);
                    pizzaRowData[j][4]=rs.getString(4);
                    pizzaRowData[j][5]=rs.getString(5);
                    j++;
                    i++;
                }while(rs.next());
            }
            catch(Exception ex)
            {
                System.out.println(ex);
                return false;
            }
            if(pizzaRowData!=null)
            {
                ViewPizzaRequestData viewData=new ViewPizzaRequestData(pizzaRowData);
            }
        } 
        return true;
    }
    boolean registerUser(UserDetails ud)
    {
        if(openDatabaseConnection())
        {
            String query="INSERT INTO `userdetails`(`username`, `password`, `firstName`, `lastName`, `Gender`, `phoneNo`) VALUES (?,?,?,?,?,?);";
            try
            {
                smt=conn.prepareStatement(query);
                smt.setString(1, ud.getUsername());
                smt.setString(2, ud.getPassword());
                smt.setString(3, ud.firstName);
                smt.setString(4, ud.lastName);
                smt.setString(5,ud.Gender);
                smt.setLong(6, ud.phoneNo);
                int result=smt.executeUpdate();
                if(result==1)
                {
                    System.out.println("User Registered Sucessfully");
                }
                else
                {
                    System.out.println("Error Occured While Adding Data");
                }
            } 
            catch(MySQLIntegrityConstraintViolationException ex)
            {
                String s=ex.toString();
                if(s.contains("Duplicate entry"))
                {
                      JOptionPane.showMessageDialog(null, "The username has already been Taken !! Enter Other username !!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                return false;
            }
            catch (SQLException ex)
            {
                System.out.println(ex);
                return false;
            }
            finally
            {
                    try
                    { 
                        if(conn!=null)
                       {
                            conn.close();  
                        }
                        if(smt!=null)
                        { 
                            smt.close();
                        }
                    } 
                    catch (SQLException ex)
                    {
                        
                     }
            }
        }
        else
        {
            System.out.println("Error Occured While creating Connection !!");
        }
        return true;
    }
    
    boolean checkUserRegistration(String username,String password)
    {
        String fullName="";
        if(openDatabaseConnection())
        {
            String query="SELECT `firstName`, `lastName` FROM `userdetails` WHERE username=? && password=?;";// &password='?'
            try
            {
                smt=conn.prepareStatement(query);
                smt.setString(1, username);
                UserDetails ud=new UserDetails();
                System.out.println("username::"+username);
                System.out.println("password::"+ud.hashString(password));
                smt.setString(2, ud.hashString(password));
                ResultSet rs=smt.executeQuery();
                rs.first();
                do
                {
                    fullName=fullName.concat(rs.getString(1));
                    fullName=fullName.concat(" ");
                    fullName=fullName.concat(rs.getString(2));
                    System.out.println(fullName);
                    return true;
                }while(rs.next());
            }
            catch(Exception ex)
            {
                System.out.println(ex);
                return false;
            }
//            if(fullName!="")
//            {
//                return true;
//            }
        } 
        return false;
    }
}
