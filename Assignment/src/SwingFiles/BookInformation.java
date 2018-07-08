/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author bhattaraib58
 */
public class BookInformation implements ActionListener
{
        JFrame jframe;
        JTextField nameInput,idInput;
        ButtonGroup gender;
        JComboBox programCombo;
        JCheckBox windows,linux,macos;
        
    BookInformation()
    {
        jframe=new JFrame("Book Information");
        jframe.setSize(400,300);
        initComponents();
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    void initComponents()
    {
        JPanel jpanel=new JPanel();
        jpanel.setLayout(null);
        jframe.add(jpanel);
        
        JLabel id=new JLabel("ID:");
        id.setBounds(10,10,25,25);
        jpanel.add(id);
        
        idInput=new JTextField(100);
        idInput.setBounds(100,10,200,25);
        jpanel.add(idInput);
        
        JLabel name=new JLabel("Name:");
        name.setBounds(10,40,50,25);
        jpanel.add(name);
        
        nameInput=new JTextField(100);
        nameInput.setBounds(100,40,200,25);
        jpanel.add(nameInput);
        
        JLabel genderlabel=new JLabel("Gender:");
        genderlabel.setBounds(10,70,50,25);
        jpanel.add(genderlabel);
        
        JRadioButton male=new JRadioButton("Male");
        male.setBounds(100,70,70,25);
        
        JRadioButton female=new JRadioButton("Female");
        female.setBounds(170,70,70,25);
        
        JRadioButton others=new JRadioButton("Others");
        others.setBounds(240,70,70,25);
        
        gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);
        gender.add(others);

        jpanel.add(male);
        jpanel.add(female);
        jpanel.add(others);
        
        JLabel programLabel=new JLabel("Program:");
        programLabel.setBounds(10,110,50,25);
        jpanel.add(programLabel);
        
        String[] program={"[Select Program]","BIT","BCA","BSC-CSIT","BIM","BE-IT"};
        programCombo=new JComboBox(program);
        programCombo.setBounds(100, 110, 200, 30);
        jpanel.add(programCombo);
        
        JLabel osLabel=new JLabel("OS you use:");
        osLabel.setBounds(10,150,100,25);
        jpanel.add(osLabel);
        
        windows=new JCheckBox("Windows");
        windows.setBounds(100,150,80,25);
        jpanel.add(windows);
        
        linux=new JCheckBox("Linux");
        linux.setBounds(190,150,70,25);
        jpanel.add(linux);
        
        macos=new JCheckBox("Mac Os");
        macos.setBounds(260,150,70,25);
        jpanel.add(macos);
        
        JButton clearButton=new JButton("Clear");
        clearButton.setBounds(50,190,70,40);
        jpanel.add(clearButton);      
        clearButton.setActionCommand("Clear");
        clearButton.addActionListener(this);  
        
        JButton saveButton=new JButton("Save");
        saveButton.setBounds(150,190,70,40);
        jpanel.add(saveButton);
        saveButton.setActionCommand("Save");
        saveButton.addActionListener(this);  
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {        
        if(e.getActionCommand().equals("Clear")) 
        {
            ClearInfo();
        }
        else if(e.getActionCommand().equalsIgnoreCase("Save")) 
        {
            JOptionPane.showMessageDialog(null, "Your Info has Been Saved", "Info Saved", JOptionPane.INFORMATION_MESSAGE);
            ClearInfo();
        }
        else 
        {
            System.out.println("command not recognized");
        }
    }
    void ClearInfo()
    {
        
            nameInput.setText(null);
            idInput.setText(null);

            gender.clearSelection();
            //combo.removeAllItems();
            programCombo.setSelectedIndex(0);
            windows.setSelected(false);
            linux.setSelected(false);
            macos.setSelected(false);
    }
    public static void main(String[] args)
    {
        new BookInformation();
    }
}
