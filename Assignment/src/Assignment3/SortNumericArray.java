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
public class SortNumericArray
{

    public static void main(String[] args)
    {
        int numericArray[] =
        {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 0
        };
        int firstLoop = 0, secondLoop = 0, temp;
        for (firstLoop = 0; firstLoop < 10; firstLoop++)
        {
            System.out.println("The array is: " + numericArray[firstLoop]);
        }

        for (firstLoop = 0; firstLoop < 10; firstLoop++)
        {
            for (secondLoop = (firstLoop+1); secondLoop < 10; secondLoop++)
            {
                if (numericArray[firstLoop] > numericArray[secondLoop])
                {
                    temp = numericArray[secondLoop];
                    numericArray[secondLoop] = numericArray[firstLoop];
                    numericArray[firstLoop] = temp;
                }
            }
        }
        for (firstLoop = 0; firstLoop < 10; firstLoop++)
        {
            System.out.println("The sorted array is: " + numericArray[firstLoop]);
        }
    }
}
