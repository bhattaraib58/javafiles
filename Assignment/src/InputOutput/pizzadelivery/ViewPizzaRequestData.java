/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput.pizzadelivery;
//
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.DefaultCellEditor;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.RowSorter;
//import javax.swing.SortOrder;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import javax.swing.*;
import java.awt.*;

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
    JButton printTableData;
    
    ViewPizzaRequestData(String [][]pizzaRowData)
    {
            jframe=new JFrame("Pizza Request Data");
            jframe.setSize(1200, 500);
            jframe.setLocationRelativeTo(null);
//            for (int i = 0; i < 4; i++)
//        {
//                System.out.println("");
//                System.out.println("Customer No::"+pizzaRowData[i][0]);
//                System.out.println("Name Of Customer is::" +pizzaRowData[i][1]);
//                System.out.println("Phone No Of Customer is::" +pizzaRowData[i][2]);
//                System.out.println("Type Of Pizza is::" +pizzaRowData[i][3]);
//                System.out.println("Size Of Pizza is::" +pizzaRowData[i][4]);
//                System.out.println("Selected Toppings are::"+pizzaRowData[i][5]);
//        }
            initComponents(pizzaRowData);
            jframe.setVisible(true);
    }
    void initComponents(String [][]pizzaRowData)
    {
        //creating jtable data and adding to jtable
        String[] columnData={"ID","User Name","Phone No","Pizza Type","Pizza Size","Toppings"};
        jtable=new JTable(pizzaRowData,columnData);
        
        //creating upper jpanel for adding jpanel
        JPanel jpane=new JPanel(new BorderLayout());
        jpane.add(new JScrollPane(jtable));
        
        //calling method to fix ascending and descending order
        arrange();
        
        //adding a new panel to add below for print
        JPanel buttonsBelowTable = new JPanel();
        
        printTableData=new JButton("Print");
        printTableData.setBounds(70,500,50,30);
        buttonsBelowTable.add(printTableData);
        printTableData.setActionCommand("Print");
        printTableData.addActionListener(this);
        
        // Add the pane object to the frame
        jframe.add(jpane, BorderLayout.CENTER);

        // And finally add the below object to the frame
        jframe.add(buttonsBelowTable, BorderLayout.SOUTH);
        
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
    }
}