/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;
/**
 *1.	Create a superclass, Figure which have its two instance variables length and breadth and a method area.
 * Create a parametirized constructor to initialize instance variables. Create a subclass Triangle which inherits Figure. 
 * Here also create a method area which will calculate and display area of triangle. 
 * Create another subclass Rectangle which also inherits Figure. 
 * Here also create a method area which will calculate and display area of Triangle. 
 * Create appropiate objects to demostrate above inheritance. 
 * 
 * @author bhattaraib58
 */
class Figure
{
     private float length;
        private float breadth;
        public Figure(float length,float breadth)
        {
            this.length=length;
            this.breadth=breadth;
        }
        float area()
        {
            return length*breadth;
        }  
}
class Triangle extends Figure
{
    private float height;
    public Triangle(float length,float breadth, float height)
    {
        super(length,breadth);
        this.height=height;
    }
    float area()
    {
        float area=super.area()*height;
        return area;
    }
    
}
class Rectangle extends Figure
{
    public Rectangle(float length,float breadth)
    {
        super(length,breadth);
    }
}
public class FigureInheretenceAndDemonstrateInstances
{
    public static void main(String args[])
    {
        Triangle triangleObject= new Triangle(28.8f,2.0f,5.0f);     
        System.out.println("The area of triangle is:"+ triangleObject.area());
        
        Rectangle rectangleObject=new Rectangle(6f,8f);
        System.out.println("The area of triangle is:"+ rectangleObject.area());
    }
}
