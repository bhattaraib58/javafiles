/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author bhattaraib58
 */
public class ViewPizzaRequestData implements ActionListener
{
    //noOFClicks for checking the click count if one click then ascending then if again click then descending
    int noOfClicks = 1;
    JFrame jframe;
    JTable jtable;
    JButton printTableData,editTableData;
    
    ViewPizzaRequestData(String [][]pizzaRowData)
    {
            jframe=new JFrame("Pizza Request Data");
            jframe.setSize(1200, 500);
            jframe.setLocationRelativeTo(null);
            initComponents(pizzaRowData);
            jframe.setVisible(true);
    }
    void initComponents(String [][]pizzaRowData)
    {
        //creating jtable data and adding to jtable
        String[] columnData={"ID","User Name","Phone No","Pizza Type","Pizza Size","Topping"};

        jtable=new JTable(pizzaRowData,columnData); 
        //creating upper jpanel for adding jpanel
        JPanel jpane=new JPanel(new BorderLayout());
        jpane.add(new JScrollPane(jtable));
        
        //calling method to fix ascending and descending order
        arrange();
        
        //adding a new panel to add below for print
        JPanel buttonsBelowTable = new JPanel();
        
        printTableData=new JButton("Print");
        printTableData.setBounds(10,50,50,30);
        buttonsBelowTable.add(printTableData);
        printTableData.setActionCommand("Print");
        printTableData.addActionListener(this);
        
        editTableData=new JButton("Edit");
        editTableData.setBounds(10,300,50,30);
        buttonsBelowTable.add(editTableData);
        editTableData.setActionCommand("Edit");
        editTableData.addActionListener(this);
        
        // Add the pane object to the frame
        jframe.add(jpane, BorderLayout.CENTER);

        // And finally add the below object to the frame
       jframe.add(buttonsBelowTable, BorderLayout.SOUTH);
       
       //hiding the order id column
//        jtable.removeColumn(jtable.getColumnModel().getColumn(0));
    }
    
    public void arrange()
    {
           TableRowSorter<TableModel> sorter = new TableRowSorter<>(jtable.getModel());
            jtable.setRowSorter(sorter);
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            int columnIndexToSort = 0;

            if (noOfClicks%2==0)
            { 
                //firstClick
                sortKeys.add(new RowSorter.SortKey(columnIndexToSort,   SortOrder.ASCENDING));
            }
            else
            {
                sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.DESCENDING));
            }
            ++noOfClicks;
            sorter.setSortKeys(sortKeys);
            sorter.sort();    
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Print"))
        {
                try 
                {
                     if (!jtable.print(JTable.PrintMode.FIT_WIDTH, null, null))
//                    if (! jtable.print())
                     {
                         System.err.println("User cancelled printing"); 
                     } 
                 } 
                catch (java.awt.print.PrinterException ex) 
                {
                     System.err.format("Cannot print %s%n", ex.getMessage()); 
                 } 
        }
        else if(e.getActionCommand().equals("Edit"))
        {         
            try
            {   
                // get the selected row index
               int selectedRowIndex = jtable.getSelectedRow();
               String orderid=jtable.getValueAt(selectedRowIndex,0).toString();
               String name=jtable.getValueAt(selectedRowIndex, 1).toString();
               String phoneno=jtable.getValueAt(selectedRowIndex, 2).toString();
               String type=jtable.getValueAt(selectedRowIndex, 3).toString();
               String size=jtable.getValueAt(selectedRowIndex, 4).toString();
               String toppings=jtable.getValueAt(selectedRowIndex, 5).toString();
               
               PizzaDeliveryEdit pd=new PizzaDeliveryEdit();
               pd.orderid.setText(orderid);
               pd.nameInput.setText(name);
               pd.phonenoInput.setText(phoneno);
               pd.pizzaTypeCombo.setSelectedItem(type);
               if(size.equalsIgnoreCase("Small"))
               {
                   pd.small.setSelected(true);
               }
               else if(size.equalsIgnoreCase("Medium"))
               {
                   pd.medium.setSelected(true);
               }
               else
               {                   
                   pd.large.setSelected(true);
               }
               
               if(toppings!=null|toppings!="")
               {
                    // splitting String by comma, it will return array
                    String[] toppingArray = toppings.split(",");
                    for(String s:toppingArray)
                    {
                        s=s.trim();
                        if(s!=null)
                        {
                            if(s.equalsIgnoreCase("Extra Cheese"))
                            {
                                    pd.extraCheese.setSelected(true);
                            }
                            else if(s.equalsIgnoreCase("Salami"))
                            {
                                    pd.salami.setSelected(true);
                            }
                            else if(s.equalsIgnoreCase("Sausage"))
                            {
                                    pd.sausage.setSelected(true);
                            }
                            else if(s.equalsIgnoreCase("Pepproni"))
                            {
                                    pd.pepproni.setSelected(true);
                            }
                            else
                            {
                            }     
                        }
                    }
               }
            }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                    JOptionPane.showMessageDialog(null, "Please Select The Row in Table To be Edited !!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
        else
        {
            System.out.println("Commaned Not Recognized");
        }
    }
}