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
public class Question1StringLiteralAndObject
{
    public static void main(String[] args)
    {
        String str1="Hello Biplap";  //makes pool storage
        String str2;        //same as str1
        str2="Hello Biplap";//refrence to same storage pool
        String str3=new String("Hello Biplap");     //makes heap storage
        String str4=new String();       //same as str3
        str4="Hello Biplap";
        boolean ifPoolTrue=str1==str2;
        boolean ifHeapTrue=str3==str4;
        System.out.println("Str1 and Str2 are same: "+ifPoolTrue);
        System.out.println("Str3 and Str4 are same: "+ifHeapTrue);
        //no need to write below this for assignment only for knowledge
        
        
        //as above first will give true and second will give false
        //but they are string they should be equal
        boolean checkStr=str3.equals(str4);
        
        System.out.println("(Equals ) Str3 and Str4 are same: "+checkStr);
        
        //also pool and heap are different so str1&str2!=str3 and str4
        boolean sheckStr13=str1==str3;
        System.out.println("Str1 and Str3 are same(= method): "+sheckStr13);
        boolean sheckStr13Equals=str1.equals(str3);
        System.out.println("Str1 and Str3 are same(equals): "+sheckStr13Equals);
        
        
    }
}
