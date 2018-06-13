/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question2;

/**
2. Repeat question 1 example by making the method area of class Figure abstract. 
 * @author bhattaraib58
 */
public class Display
{
    public static void main(String[] args)
    {
        Triangle t=new Triangle(55,6,2);
        t.area();
        Rectangle r=new Rectangle(66,55);
        r.area();
//        Figure f=new Figure(10,20);
    }
}
