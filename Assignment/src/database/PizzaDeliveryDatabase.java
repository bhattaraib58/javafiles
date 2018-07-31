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
            String query="INSERT INTO `pizza_orders`(`UserName`, `Phoneno`, `pizza_type`, `pizza_size`, `topping_Extracheese`, "
                    + "`topping_salami`, `topping_sausage`, `topping_pepproni`) VALUES (?,?,?,?,?,?,?,?);";
            try
            {
                smt=conn.prepareStatement(query);
                smt.setString(1, pizza.getName());
                smt.setLong(2, pizza.getPhoneno());
                smt.setString(3, pizza.getType());
                smt.setString(4, pizza.getSize());
                smt.setBoolean(5,pizza.getToppingExtracheese());
                smt.setBoolean(6, pizza.getToppingSalami());
                smt.setBoolean(7, pizza.getToppingSausage());
                smt.setBoolean(8, pizza.getToppingPepproni());
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
            String [][]pizzaRowData=new String[15][9];
            String query="SELECT `UserName`, `Phoneno`, `pizza_type`, `pizza_size`, "
                    + "`topping_Extracheese`, `topping_salami`, `topping_sausage`, `topping_pepproni` FROM `pizza_orders`; ";
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
                    pizzaRowData[j][5]=Boolean.toString(rs.getBoolean(5));
                    pizzaRowData[j][6]=Boolean.toString(rs.getBoolean(6));
                    pizzaRowData[j][7]=Boolean.toString(rs.getBoolean(7));
                    pizzaRowData[j][8]=Boolean.toString(rs.getBoolean(8));
                    j++;
                    i++;
                }while(rs.next());
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
            if(pizzaRowData!=null)
            {
                ViewPizzaRequestData viewData=new ViewPizzaRequestData(pizzaRowData);
            }
        } 
        return true;
    }
}
