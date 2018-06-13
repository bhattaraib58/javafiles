/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question2;

/**
 *
 * @author bhattaraib58
 */
public abstract class Figure
{
         double length;
         double breadth;
        
        Figure(double l, double b)
        {
            length=l;
            breadth=b;
        }
        abstract void area();
        
}
