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
public class Question12ReplaceCharacterInString
{
    public static void main(String[] args)
    {
        String tempString="Hello World !!";
        System.out.println("Replacing 3rd character of :"+tempString+" at '"+tempString.charAt(2)+"':");
        tempString=tempString.substring(0,2)+'x'+tempString.substring(3);
        System.out.println("The new String is  ::"+tempString);
        
//        no need to write below this for assignment only for knowledge
        //other method which is using stringbuilder
        StringBuilder myName = new StringBuilder("Hello World !!");
        myName.setCharAt(4, 'x');
        System.out.println(myName);
    }
    
}
