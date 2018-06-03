/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import java.util.Scanner;
/**
 *
7.	WAP to input roll number, your college name and your name and display it. 

 * @author bhattaraib58
 */
public class MyDetailsDisplay
{
    public static void main(String args[])
    {
        System.out.println("Please Enter Values Without Spaces: ");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String myName=scan.next();
        System.out.print("Enter Your Roll Number: ");
        int rollNo=scan.nextInt();
        System.out.print("Enter Your College Name: ");
        String collegeName=scan.next();
        System.out.println("Hello "+myName+"! Your Roll Number is: "+rollNo+". You study in "+collegeName);
        scan.close();
    }
}
