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
public class AddAndMultiplyMatrices
{
    public static void main(String args[])
    {
        int[][] firstMatrix={{1,2,0},{0,1,1},{2,0,1}},secondMatrix={{1,1,2},{2,1,1},{1,2,1}};
         int i=0,j=0,k=0,sum=0;
         
        System.out.println("First Matrix is: ");
        for(i=0;i<firstMatrix.length;i++)
        {
            for(j=0;j<firstMatrix[1].length;j++)
            {
                System.out.print(firstMatrix[i][j]+"   ");
            }
            System.out.println("");
        }
        
        System.out.println("Second Matrix is: ");
        for(i=0;i<firstMatrix.length;i++)
        {
            for(j=0;j<firstMatrix[1].length;j++)
            {
                System.out.print(secondMatrix[i][j]+"   ");
            }
            System.out.println("");
        }
       
        int sumMatrix[][]=new int [firstMatrix.length][firstMatrix[1].length];
        for(i=0;i<firstMatrix.length;i++)
        {
            for(j=0;j<firstMatrix[1].length;j++)
            {
                sumMatrix[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
//                This is for a 3 dimensional array.
//
//                int x[][][]=new int[5][8][10];
//                System.out.println(x.length+" "+x[1].length+" "+x[0][1].length);
//                OUTPUT : 5 8 10
        System.out.println("");
        System.out.println("The sum of matrices is: ");
         for(i=0;i<firstMatrix.length;i++)
        {
            for(j=0;j<firstMatrix[1].length;j++)
            {
                System.out.print(sumMatrix[i][j]+"   ");
            }
            System.out.println("");
        }
         
         System.out.println("");
        System.out.println("The Multiply of matrices is: ");
        
         int multiplyMatrix[][]=new int [firstMatrix.length][secondMatrix[1].length];
        for(i=0;i<firstMatrix.length;i++)
        {
            sum=0;
            for(j=0;j<secondMatrix[1].length;j++)
            {
                for(k=0;k<secondMatrix.length;k++)
                {
                        sum+=firstMatrix[i][k]*secondMatrix[k][j];
                }
                multiplyMatrix[i][j]=sum;
                sum=0;
            }
        }
        for(i=0;i<firstMatrix.length;i++)
        {
            for(j=0;j<secondMatrix[1].length;j++)
            {
                System.out.print(multiplyMatrix[i][j]+"   ");
            }
            System.out.println("");
        }
        
    }    
}
