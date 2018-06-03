package Assignment2;


/**
 *
 * @author bhattaraib58
 */

import java.util.Scanner;  
public class UserInputOperations
{
    public static double additionMethod(double firstNumber, double secondNumber)
    {
        return (firstNumber+secondNumber);
    }
    public static double subtractionMethod(double firstNumber, double secondNumber)
    {
        return (firstNumber-secondNumber);
    }
    public static double multiplyMethod(double firstNumber, double secondNumber)
    {
        return (firstNumber*secondNumber);
    }
    public static double divisionMethod(double firstNumber, double secondNumber)
    {
        return (firstNumber/secondNumber);
    }
    public static void main(String args[])
    {
            Scanner scan=new Scanner(System.in);  
            System.out.print("Enter First Number: ");  
            double firstNumber=scan.nextDouble();  
            System.out.print("Enter Second Number: ");  
            double secondNumber=scan.nextDouble(); 
            UserInputOperations call=new UserInputOperations();
            System.out.println("Addition of two Numbers is: "+call.additionMethod(firstNumber,secondNumber)); 
            System.out.println("Subtraction of two Numbers is: "+call.subtractionMethod(firstNumber,secondNumber)); 
            System.out.println("Multiply of two Numbers is: "+call.multiplyMethod(firstNumber,secondNumber)); 
            System.out.println("Division of two Numbers is: "+call.divisionMethod(firstNumber,secondNumber)); 
            scan.close();    
    }
}   