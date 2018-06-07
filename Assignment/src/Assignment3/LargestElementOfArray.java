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
public class LargestElementOfArray
{
    public static void main(String[] args)
    {
        int [] arrayElements={464,4545,4566,456,46,4,564,6,48974,64,6,465,4,894,65,132,1,68,4,654,6,13,2,54};
        int i=0,maxValue=0;
        System.out.println("The Array is: ");
        for(i=0;i<arrayElements.length;i++)
        {
            System.out.println(arrayElements[i]);
            if(arrayElements[i]>maxValue)
            {
                maxValue=arrayElements[i];
            }
        }
        System.out.println("The Max Value is: "+maxValue);
        
    }
}
