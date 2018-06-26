/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8String;

/**
 *14.	Define String array of size 10 and store 10 words. 
●	Display only those words which have a character ‘t’.
●	Display only those words which starts with character ‘k’ and ends with ‘r’.
●	Display only the even index strings by converting it to uppercase. 
●	Display by concatenating all the Strings in a single string. Use all the ways to concat. 
●	Substring all the Strings from 3rd position and display it.
●	Substring all the Strings from 3rd to 7th position.

 * @author bhattaraib58
 */
public class Question14
{
    public static void main(String[] args)
    {
        String[] newString=new String[10];
        System.out.println("The Array size is ::"+newString.length);
        newString[1]="meat";
        newString[2]="boxer";
        newString[3]="kracker";
        newString[4]="kracken";
        newString[5]="aension";
        newString[6]="assigmnet";
        newString[7]="wednesday";
        newString[8]="world";
        newString[9]="hello";
        newString[0]="sonu";
        for(String s:newString)
            System.out.println(s);
        System.out.println("Displaying String with characters 't'::");
        for(String s:newString)
        {
            if(s.indexOf('t')>=0)
            System.out.println(s);
        }
        System.out.println("String which starts with k and end with r::");
        for(String s:newString)
        {
            if(s.startsWith("k") &&s.endsWith("r"))  //it works but faking char with like string
                System.out.println(s);
        }
        //other method
         System.out.println("String which starts with k and end with r using other method::");
         int size=0;
        for(String s:newString)
        {
           size=s.length();
           if(s.charAt(0)=='k'&&s.charAt(size-1)=='r')
           {
               System.out.println(s);
           }
        }   
        System.out.println("Converting and showing string with even no of characters::");
        
        for(String s:newString)
        {
           size=s.length();
           if(size%2==0)
           {
               System.out.println(s.toUpperCase());
           }
        }
        String oneFullString=new String();
        String secondFullString=new String();
        System.out.println("Concating all strings into one::");
        for(String s:newString)
        {
           oneFullString=oneFullString+s;       //one method to conact
           secondFullString=secondFullString.concat(s); //2nd method to concat
        }
        System.out.println(oneFullString);
        System.out.println(secondFullString);
        
        String[] otherString1=new String[10];
        String[] otherString2=new String[10];
        System.out.println("Substring all the Strings from 3rd position and display it::");
        for (int i = 0; i < 10; i++)
        {
            otherString1[i]=newString[i].substring(3);
            System.out.println(otherString1[i]);
        }
        System.out.println("Substring all the Strings from 3rd to 7th position::");
        for (int i = 0; i < 10; i++)
        {
            ///had to use try catch cause some string were starting from 3rd and ending in 4th string so compiler giving error
            try
            {
                otherString2[i]=newString[i].substring(3, 7);
                System.out.println(otherString2[i]);
            }
            catch(Exception e)
            {
                
            }
        }
               
    }
    
}
