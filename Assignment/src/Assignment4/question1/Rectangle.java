/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question1;

/**
 *
 * @author bhattaraib58
 */
public class Rectangle extends Figure
{
    Rectangle(double l,double b)
    {
        super(l,b);
    }
    void area()
    {
            double area=super.getlength()*super.getBreadth();
            System.out.println("The area of rectangle is: "+area);
    }
    
}
