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
public class Cylinder extends Circle
{
    private double height=1.0;
    Cylinder()
    {
        
    }
    Cylinder(double height)
    {
        this.height=height;
    }
    Cylinder(double height,double radius)
    {
        super(radius);
        this.height=height;
    }
    Cylinder(double height, double radius,String color)
    {
        super(radius,color);
        this.height=height;
    }
    double getHeight()
    {
        return height;
    }
    void setHeight(double height)
    {
        this.height=height;
    }
    @Override
    public String toString( )
    {
        return "The height of Cylinder is : :"+height;
        
    }
    double getVolume()
    {
        double volume=Math.PI*getRadius()*getRadius()*height;
        return volume;
    }
}
