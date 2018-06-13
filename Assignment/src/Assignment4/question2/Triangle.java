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
public class Triangle extends Figure
{
    private double height;
    Triangle(double l, double b, double h)
    {
        super(l,b);
        height=h;
    }
    @Override
    void area()
    {
            double area=length*breadth*height;
            System.out.println("The area is: "+area);
    }
    
}
