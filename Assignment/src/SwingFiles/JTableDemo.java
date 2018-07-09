/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bhattaraib58
 * question 1 describe the arrange methods
 * question 2 adding button to grid layout 1
 */
public class JTableDemo implements ActionListener
{
    //noOFClicks for checking the click count if one click then ascending then if again click then descending
    int noOfClicks = 1;
    JFrame jframe;
    JTable jtable;
    JButton printTableData;
    
    JTableDemo()
    {
            jframe=new JFrame("JTable");
            jframe.setSize(500, 500);
            jframe.setLocationRelativeTo(null);
            initComponents();
            
            jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
            jframe.setVisible(true);
    }
    void initComponents()
    {
        //creating jtable data and adding to jtable
        String[] columnData={"ID","Student Name","Address","Faculty"};
        String[][] rowData={{"1487","Biplap Bhattarai","Kalanki, Syuchatar","BIT"},{"1495","Sonu Rai","KTM","BIT"},
            {"2000","Sujan Mahat","Chabhil","BIM"},{"1500","Soilesh Chaudahary","Maitighar","BBA"}};
        jtable=new JTable(rowData,columnData);
        
        //creating upper jpanel for adding jpanel
        JPanel jpane=new JPanel(new BorderLayout());
        jpane.add(new JScrollPane(jtable));
        
        //calling method to fix ascending and descending order
        arrange();
        
        //getting faculty column and editing that column to the combobox
        TableColumn columns= jtable.getColumnModel().getColumn(3);
        String[] comboItems={"BBA","BIM","BIT","BSC","BBS"};
        JComboBox comboBox=new JComboBox(comboItems);
        columns.setCellEditor(new DefaultCellEditor(comboBox));
        
        //adding a new panel to add below for print
        JPanel buttonsBelowTable = new JPanel(new GridLayout(0, 3));
        
        printTableData=new JButton("Print");
        printTableData.setBounds(70,400,50,30);
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
            int columnIndexToSort = 1;

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
    public static void main(String[] args)
    {
        new JTableDemo();
    }
}
