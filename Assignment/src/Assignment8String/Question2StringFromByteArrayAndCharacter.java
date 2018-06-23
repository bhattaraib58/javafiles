/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8String;

import java.nio.charset.StandardCharsets;
/**
 *
 * @author bhattaraib58
 */
public class Question2StringFromByteArrayAndCharacter
{
    public static void main(String[] args)
    {
        //byte can only store from -127-127 0b and 0x
        byte[] byteString={'B','I','P','L','A','P'};  //as char only take 8bits so it take 1 byte
        
        System.out.println("Data of byte array in String form ::");
        String converted = new String(byteString, StandardCharsets.UTF_8);
        System.out.println("The string of byteString is ::"+converted);
        
        char[] str={'H','E','l','l','o','!'};
        System.out.println(str);
        String str3=String.valueOf(str);
        System.out.println(str3);
        
        
        /*
//        String str2=Character.toString(str[1]);
        //no need below this for assignment
        //other method
        //used mostly
        //it converts above converted to byte
        byte[] byteArray = converted.getBytes(StandardCharsets.UTF_8);
        //then again this will convert bytearray to converted
        converted = new String(byteArray, StandardCharsets.UTF_8);
        System.out.println("After once again reconverting to byte and converting to string ::"+converted);
        
                
        //data printing of array will display in ascii code 65-128 like
        System.out.println("Data in Byte array are ::");
        for(byte data:byteString)
                System.out.println(data);
        
        //printing byte valye in binary
        System.out.println("Data of byte array in binary form ::");
        String binary;
        for (int k = 0; k < byteString.length; k++) 
        {
            binary = Integer.toBinaryString(byteString[k]);
            System.out.println("Binary value: "+binary);
        }

*/
    }
}
