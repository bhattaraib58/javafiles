/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author bhattaraib58
 */
public class NotepadPractice implements ActionListener
{
    JFrame jframe;
    JMenuItem cut,copy,paste,selectAll,textwrap;  
    JMenuItem save,saveAs,close,open,newFile,print;  
    JMenuItem helpMe,about;  
    JTextArea textarea;
    JScrollPane scrollPane;
    int selectedBefore=1;
    NotepadPractice()
    {
        jframe=new JFrame("Notepad");
        jframe.setSize(500,500);
        initOperations();
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
    public void initOperations()
    {
        JMenu file,edit,help;
        file=new JMenu("File");
        edit=new JMenu("Edit");
        help=new JMenu("Help");
        
        
        about=new JMenuItem("About");
        about.setActionCommand("About");
        about.addActionListener(this);    
        help.add(about);
        
        cut=new JMenuItem("Cut");    
        copy=new JMenuItem("Copy");    
        paste=new JMenuItem("Paste");    
        selectAll=new JMenuItem("Select All");  
        textwrap=new JMenuItem("Text Wrap");    
        cut.setActionCommand("Cut");
        cut.addActionListener(this);    
        copy.setActionCommand("Copy");
        copy.addActionListener(this);    
        paste.setActionCommand("Paste");
        paste.addActionListener(this);    
        selectAll.setActionCommand("SelectAll");
        selectAll.addActionListener(this);    
        textwrap.setActionCommand("textwrap");
        textwrap.addActionListener(this);    
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);  
        edit.add(textwrap);  
        
        newFile=new JMenuItem("New File");    
        open=new JMenuItem("Open File");    
        close=new JMenuItem("Close");    
        saveAs=new JMenuItem("Save As");    
        save=new JMenuItem("Save");   
        print=new JMenuItem("Print");  
        
        newFile.setActionCommand("newFile");
        newFile.addActionListener(this);    
        open.addActionListener(this);   
        close.setActionCommand("close"); 
        close.addActionListener(this);    
        saveAs.addActionListener(this);    
        save.addActionListener(this);    
        print.setActionCommand("print"); 
        print.addActionListener(this);    
        
        file.add(newFile);
        file.add(open); 
        file.add(save);  
        file.add(saveAs);     
        file.add(print);   
        file.add(close);
        
        
        JMenuBar  notepadMenu=new JMenuBar ();
        notepadMenu.add(file);
        notepadMenu.add(edit);
        notepadMenu.add(about);
        jframe.setJMenuBar(notepadMenu);
        
        textarea=new JTextArea();
        textarea.setWrapStyleWord(true);
        textarea.setLineWrap(true);
        scrollPane =  new JScrollPane(textarea,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jframe.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("About"))
        {
            JOptionPane.showMessageDialog(null, "Notepad is Properiatory Software"
                    + "Microsoft Corporation. "
                    + "(C) 2018 All Rights Reserved", "About", JOptionPane.INFORMATION_MESSAGE);
         }
        if(e.getActionCommand().equals("Copy"))
        {
            textarea.copy();
         }
        if(e.getActionCommand().equals("Cut"))
        {
            textarea.cut();
         }
        if(e.getActionCommand().equals("Paste"))
        {
            textarea.paste();
         }
        if(e.getActionCommand().equals("SelectAll"))
        {
            textarea.selectAll();
         }
        if(e.getActionCommand().equals("print"))
        {
//            textarea.print();
            try 
                {
                     if (!textarea.print())
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
        if(e.getActionCommand().equals("close"))
        {
            System.exit(0);
         }
        if(e.getActionCommand().equals("newFile"))
        {
         }
        if(e.getActionCommand().equals("textwrap"))
        {
            if(selectedBefore==1)
            {
                textarea.setWrapStyleWord(false);
                textarea.setLineWrap(false);
                scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                textwrap.setForeground(Color.DARK_GRAY);
                selectedBefore=0;
            }
            else
            {
                textarea.setWrapStyleWord(true);
                textarea.setLineWrap(true);
                scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                textwrap.setForeground(Color.GRAY);
                selectedBefore=1;
            }
         }
        else
        {
            System.out.println(e);
            System.out.println("Command Not Recognized");
        }
    }
    
    public static void main(String[] args)
    {
        new NotepadPractice();
    }
}
