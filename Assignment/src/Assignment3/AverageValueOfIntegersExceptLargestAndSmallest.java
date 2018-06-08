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
public class AverageValueOfIntegersExceptLargestAndSmallest
{
    public static void main(String args[])
    {
         int[] newArray=new int[10];
        for(int i=0;i<10;i++)
        {
            newArray[i]=i+1;
        }
        
        int sum=0;
        int largest=newArray[0],smallest=newArray[0];
        for(int i=0;i<10;i++)
        {
            if(newArray[i]>largest)
            {
                largest=newArray[i];
            }
            if(newArray[i]<smallest)
            {
                smallest=newArray[i];
            }
        }
        for(int i=0;i<10;i++)
        {
            if(!(newArray[i]==largest|newArray[i]==smallest))
            {
                sum+=newArray[i];
            }
            
        }
        System.out.println("The Largest Value is: "+largest);
        System.out.println("The Smallest Value is: "+smallest);
        System.out.println("The sum of array without Largest and Smallest Value is: "+sum);
    }
}
