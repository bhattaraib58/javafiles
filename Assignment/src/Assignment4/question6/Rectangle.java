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
public class Rectangle extends Shape
{
    double width=1.0;
    double length=1.0;
    
    Rectangle()
    {
        
    }
    Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    Rectangle(double width,double length,String color,boolean filled)
    {
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    double getWidth()
    {
        return width;
    }
    void setWidth(double width)
    {
        this.width=width;
        
    }
     double getLength()
    {
        return length;
    }
    void setLength(double length)
    {
        this.length=length;
    }
    double getArea()
    {
        return length*width;
    }
    double getPerimeter()
    {
        double perimeter=2*(length+width);
        return perimeter;
    }
    @Override
    public String toString()
    {
        return "The color of Rectangle is ::"+color;
    }
    
}
