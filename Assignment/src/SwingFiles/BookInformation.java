/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import java.awt.Color;
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
        JLabel wrongId,wrongName,wrongOS,wrongProgram,wrongGender;
                
    BookInformation()
    {
        jframe=new JFrame("Book Information");
        jframe.setSize(400,420);
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
        idInput.setBounds(100,10,250,25);
        jpanel.add(idInput);
        
        wrongId=new JLabel("Please Enter 4 numbers containing 0-9 Only");
        wrongId.setBounds(40,40,300,25);
        wrongId.setForeground(Color.red);
        wrongId.setVisible(false);
        jpanel.add(wrongId);
        
        JLabel name=new JLabel("Name:");
        name.setBounds(10,70,50,25);
        jpanel.add(name);
        
        nameInput=new JTextField(100);
        nameInput.setBounds(100,70,250,25);
        jpanel.add(nameInput);
        
        wrongName=new JLabel("Please Enter atleast 4 Characters From A-Z Only");
        wrongName.setBounds(50,100,300,25);
        wrongName.setForeground(Color.red);
        wrongName.setVisible(false);
        jpanel.add(wrongName);
        
        JLabel genderlabel=new JLabel("Gender:");
        genderlabel.setBounds(10,130,50,25);
        jpanel.add(genderlabel);
        
        JRadioButton male=new JRadioButton("Male");
        male.setBounds(100,130,70,25);
        
        JRadioButton female=new JRadioButton("Female");
        female.setBounds(170,130,70,25);
        
        JRadioButton others=new JRadioButton("Others");
        others.setBounds(240,130,70,25);
        
        wrongGender=new JLabel("Please Select At Least One Gender");
        wrongGender.setBounds(50,160,300,25);
        wrongGender.setForeground(Color.red);
        wrongGender.setVisible(false);
        jpanel.add(wrongGender);
        
        gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);
        gender.add(others);

        jpanel.add(male);
        jpanel.add(female);
        jpanel.add(others);
        
        JLabel programLabel=new JLabel("Program:");
        programLabel.setBounds(10,190,60,25);
        jpanel.add(programLabel);
        
        String[] program={"[Select Program]","BIT","BCA","BSC-CSIT","BIM","BE-IT"};
        programCombo=new JComboBox(program);
        programCombo.setBounds(100, 190, 200, 30);
        jpanel.add(programCombo);
        
        wrongProgram=new JLabel("Please Select Your Faculty Program");
        wrongProgram.setBounds(50,220,300,25);
        wrongProgram.setForeground(Color.red);
        wrongProgram.setVisible(false);
        jpanel.add(wrongProgram);
        
        JLabel osLabel=new JLabel("OS you use:");
        osLabel.setBounds(10,250,100,25);
        jpanel.add(osLabel);
        
        windows=new JCheckBox("Windows");
        windows.setBounds(100,250,80,25);
        jpanel.add(windows);
        
        linux=new JCheckBox("Linux");
        linux.setBounds(190,250,70,25);
        jpanel.add(linux);
        
        macos=new JCheckBox("Mac Os");
        macos.setBounds(260,250,70,25);
        jpanel.add(macos);
        
        wrongOS=new JLabel("Please Select At Least One OS");
        wrongOS.setBounds(50,280,300,25);
        wrongOS.setForeground(Color.red);
        wrongOS.setVisible(false);
        jpanel.add(wrongOS);
        
        JButton saveButton=new JButton("Save");
        saveButton.setBounds(70,310,70,40);
        jpanel.add(saveButton);
        saveButton.setActionCommand("Save");
        saveButton.addActionListener(this);  
        
        JButton clearButton=new JButton("Clear");
        clearButton.setBounds(220,310,70,40);
        jpanel.add(clearButton);      
        clearButton.setActionCommand("Clear");
        clearButton.addActionListener(this);  
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
            if(CheckInputValue())
            {
                JOptionPane.showMessageDialog(null, "Your Info has Been Saved", "Info Saved", JOptionPane.INFORMATION_MESSAGE);
//                ClearInfo();
            }
        }
        else 
        {
            System.out.println("command not recognized");
        }
    }
    
    boolean CheckInputValue()
    {
        int errorBIT=0;
        String inputData;
        inputData=idInput.getText();
        if(!inputData.matches("\\d{4}"))
        {
            wrongId.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongId.setVisible(false);
        }
        inputData=nameInput.getText();
        if(!inputData.matches("[a-z A-Z]{4,}"))
        {
            wrongName.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongName.setVisible(false);
        }
        
        if(gender.getSelection()==null)
        {
            wrongGender.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongGender.setVisible(false);
        }
        
         if(programCombo.getSelectedIndex()==0)
        {
            wrongProgram.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongProgram.setVisible(false);
        }
        
        if(windows.isSelected()||linux.isSelected()||macos.isSelected())
        {
            wrongOS.setVisible(false);
        }
        else
        {
            wrongOS.setVisible(true);
            errorBIT=1;
        }
        if(errorBIT==1)
            return false;
        else
            return true;
    }
    
    void ClearInfo()
    {
            nameInput.setText(null);
            idInput.setText(null);
            gender.clearSelection();
            programCombo.setSelectedIndex(0);
            windows.setSelected(false);
            linux.setSelected(false);
            macos.setSelected(false);
            wrongId.setVisible(false);
            wrongName.setVisible(false);
            wrongOS.setVisible(false);
            wrongProgram.setVisible(false);
            wrongGender.setVisible(false);
    }
    public static void main(String[] args)
    {
        new BookInformation();
    }
}
