/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question6;

/**
 *
 * @author bhattaraib58
 */
public class Circle extends Shape
{
    double radius=1.0;
    Circle()
    {
        
    }
    Circle(double radius,String color, boolean filled)
    {
        super(color,filled);
        this.filled=filled;
    }
    double getRadius()
    {
        return radius;
    }
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    double getArea()
    {
        double area=Math.PI*radius*radius;
        return area;
    }
    double getPerimeter()
    {
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }
    @Override
    public String toString()
    {
        return "The radius of Circle is ::"+radius;
    }
}
