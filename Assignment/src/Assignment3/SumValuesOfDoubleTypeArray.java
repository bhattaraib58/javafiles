/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author Admin
 */
public class SumValuesOfDoubleTypeArray
{
    public static void main(String[] args)
    {
        double[] doubleTypeArray={10.6,10.5,10.7,10.10,50.56565,4556.15646};
        double sum=0;
        for(int i=0;i<doubleTypeArray.length;i++)
        {
            sum+=doubleTypeArray[i];
        }
        System.out.println("The Sum is: "+sum);
    }
    
}
