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
public class Display
{
        public static void main(String[] args)
        {
                Circle c=new Circle(10,"Green",true);
                System.out.println("The  Radius is ::"+c.getRadius());
                System.out.println("The  color is ::"+c.getColor());
                System.out.println("Acessing toString ::"+c.toString());
                System.out.println("The area of Cirlce is ::"+c.getArea());
                System.out.println("The perimeter of Cirlce is ::"+c.getPerimeter());
                System.out.println("");
                
                Rectangle rect=new Rectangle(10,12,"Yellow",false);
                System.out.println("The area of Cirlce is ::"+rect.getArea());
                System.out.println("The perimeter of Cirlce is ::"+rect.getPerimeter());
                System.out.println("Acessing toString of rectangle::"+rect.toString());
                System.out.println("");
                   
                Square sq=new Square(4,"Voilet",true);
                System.out.println("The area of Square is ::"+sq.getArea());
                System.out.println("The perimeter of Square is ::"+sq.getPerimeter());
                System.out.println("Acessing toString of Square::"+sq.toString());             
                
        }
}
