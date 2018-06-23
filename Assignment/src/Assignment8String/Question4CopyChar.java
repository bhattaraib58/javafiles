/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8String;

/**
 *
 * @author bhattaraib58
 */
public class Question4CopyChar
{
    public static void main(String[] args)
    {
        String newString=new String("Welcome to Java Programming");
        char[] getChar=new char[50];
        newString.getChars(11, 27, getChar,0);
        System.out.println(getChar);
    }
}
