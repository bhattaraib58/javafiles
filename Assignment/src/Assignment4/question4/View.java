/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question4;

/**
 *
 * @author bhattaraib58
 */
public class View
{
    public static void main(String args[])
    {
        Triangle t=new Triangle(10,20);
        System.out.println("The area of triangle is: "+t.getArea());
        System.out.println(t.toString());
        
        Rectangle r=new Rectangle(88,66);
        System.out.println("The area of rectangle is: "+r.getArea());
        System.out.println(r.toString());
    }
}
