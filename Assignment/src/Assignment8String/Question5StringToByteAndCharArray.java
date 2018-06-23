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
public class Question5StringToByteAndCharArray
{
    public static void main(String[] args)
    {
        String myString=new String();
        myString="Hello World";
        System.out.println("The string is ::"+myString);
        byte[] mybyte=myString.getBytes();
        System.out.println("The string in byte form ::"+mybyte);
        System.out.println("The byte in ascii code");
        for(byte data:mybyte)
            System.out.print(data+" ");
        System.out.println("The string in char ::");
        char[] mychar=myString.toCharArray();
        System.out.println(mychar);
    }
}
