/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question1;

/**
 * *1.	Create a superclass, Figure which have its two instance variables length and breadth and a method area.
 * Create a parametirized constructor to initialize instance variables. Create a subclass Triangle which inherits Figure. 
 * Here also create a method area which will calculate and display area of triangle. 
 * Create another subclass Rectangle which also inherits Figure. 
 * Here also create a method area which will calculate and display area of Triangle. 
 * Create appropiate objects to demostrate above inheritance. 
 * @author bhattaraib58
 */
public class DisplayShapes
{
    public static void main(String[] args)
    {
           Triangle t=new Triangle(10,20,30);
           t.area();
           
           Rectangle r=new Rectangle(25,35);
           r.area();
    }     
}
