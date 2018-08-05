/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author bhattaraib58
 */
public class UserDetails
{
    private String username;
    private String password;
    String firstName,lastName;
    String Gender;
    Long phoneNo;
    public void setUsername(String username)
    {
        this.username=username;
    }
    public void setPassword(String password)
    {
        String s=hashString(password);
        if(!s.equals(""))
        {
            this.password=s;
        }
    }
     public String getUsername()
    {
        return this.username;
    }
    public String getPassword()
    {
        return this.password;
    }
    public  String hashString(String message)
    {
        try
        {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hashedBytes = digest.digest(message.getBytes("UTF-8"));
            String myHash = DatatypeConverter.printHexBinary(hashedBytes).toUpperCase();
            return myHash;
        } 
        catch (NoSuchAlgorithmException | UnsupportedEncodingException ex)
        {
            System.out.println(ex);
        }
        JOptionPane.showMessageDialog(null, "Hash Conversion Error !!!", "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Error");
        return "";
    }
}
