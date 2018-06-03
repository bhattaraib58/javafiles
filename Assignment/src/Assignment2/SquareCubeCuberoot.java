/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Scanner;

/**
13.	WAP to find square, cube and square root of given number. 

 *
 * @author bhattaraib58
 */
public class SquareCubeCuberoot
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        double userNumber=scan.nextDouble();
        double square;
        square = Math.pow(userNumber, 2);
        double cube;
        cube = Math.pow(userNumber, 3);
        double squareRoot;
        squareRoot = Math.sqrt(userNumber);
        System.out.println("Square of  "+userNumber+" is : "+square);
        System.out.println("Cube of  "+userNumber+" is : "+cube);
        System.out.println("Square root of  "+userNumber+" is : "+squareRoot);
        scan.close();
    }
    
}
