/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question3;

/**
 *
 * @author bhattaraib58
 */
public class Display
{
    public static void main(String[] args)
    {
        Grad g=new Grad(5,50,16,"Biplap");
        if(g.isPassed(81))
        {
            System.out.println("You Gradeuate student is passed");
        }
        else
        {
            System.out.println("Graduate statudent is failed");
        }
        
        Undergrad ug=new Undergrad(1497,60,22,"Sonu");
         if(ug.isPassed(70))
        {
            System.out.println("You Under Graduate student is passed");
        }
        else
        {
            System.out.println("Under Graduate statudent is failed");
        }
    }
}
