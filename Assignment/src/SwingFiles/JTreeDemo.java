/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import javax.swing.JFrame;
import javax.swing.JTree;

/**
 *question gow did value came on jtree
 * @author bhattaraib58
 */
public class JTreeDemo
{
    JTreeDemo()
    {
        JFrame jframe=new JFrame("JTree");
        jframe.setSize(500,500);
        JTree jtree=new JTree();
        jframe.add(jtree);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
    public static void main(String[] args)
    {
        new JTreeDemo();
    }
}
