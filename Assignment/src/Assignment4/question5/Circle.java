/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question5;

/**
 *
 * @author bhattaraib58
 */
public class Circle
{
    private   double radius=1.0;
    private  String color="red";
    
    Circle()
    {
        
    }
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle(double radius, String color)
    {
        this.radius=radius;
        this.color=color;
    }
    double getRadius()
    {
        return radius;
    }
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    String getColor( )
    {
        return color;
    }
    void setColor(String color)
    {
        this.color=color;
    }
    @Override
    public String toString()
    {
        return "The color of Circle is ::"+color;
    }
    double getArea()
    {
        double area=Math.PI*radius*radius;
        return area;
    }
}
