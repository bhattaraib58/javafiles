/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author bhattaraib58
 */
public class JTreeDemo2Implement
{
    JTreeDemo2Implement()
    {
        JFrame jframe=new JFrame("JTree");
        jframe.setSize(500,500);
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Root");  
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("Color");  
        DefaultMutableTreeNode vegetables=new DefaultMutableTreeNode("Vegetables");  
        DefaultMutableTreeNode fruits=new DefaultMutableTreeNode("Fruits");
        
        root.add(color);
        root.add(vegetables);
        root.add(fruits);
        
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
        color.add(red); color.add(blue);
        color.add(black); 
        color.add(green);      
        
        JTree jtree=new JTree(root);
        jframe.add(jtree);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
    public static void main(String[] args)
    {
        new JTreeDemo2Implement();
    }
}
