/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author bhattaraib58
 */
public class ReverseArrayOfIntegerValues
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] intArray={1,23,5465,465,6,6,5,5,5,654,65,46,54,65,465,};
        int i=0,j=intArray.length;
        int newArray[]=new int[j],remainder,sum;
        System.out.println("The array is: ");
        for(i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
        System.out.println("For the reverse of array values order:");
        for(i=0;i<intArray.length;i++)
        {
            newArray[j-1]=intArray[i];
            j--;
        }
        intArray=newArray;
        System.out.println("The new array is: ");
        for(i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
        System.out.println("Reversing every digit of array: ");
        for(i=0;i<intArray.length;i++)
        {
            sum=0;
            while(intArray[i]>0)
            {
                remainder=intArray[i]%10;
                sum=(sum*10)+remainder;
                intArray[i]=intArray[i]/10;
            }
            intArray[i]=sum;
        }
        System.out.println("The new reverse array with reverse value is: ");
        for(i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
    }
    
}
