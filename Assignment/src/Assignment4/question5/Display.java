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
public class Display
{
    public static void main(String[] args)
    {
        Circle c=new Circle(10);
        System.out.println("The  Radius is ::"+c.getRadius());
        System.out.println("The  color is ::"+c.getColor());
        System.out.println("Acessing toString ::"+c.toString());
        System.out.println("The area of Cirlce is ::"+c.getArea());
        c.setRadius(25);
        c.setColor("Blue");
        System.out.println("The new Radius is ::"+c.getRadius());
        System.out.println("The new color is ::"+c.getColor());
        
        
        Cylinder cy=new Cylinder(10,10,"Purple");
        System.out.println("Acessing toString of Cylinder::"+cy.toString());
        System.out.println("The volume of Cylinder is ::"+cy.getVolume());
        
                
    }
}
