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
public class Rectangle implements Shape
{
    private int length;
    private int breadth;
    Rectangle (int l, int b)
    {
        length=l;
        breadth=b;
    }
    @Override
    public double getArea()
            {
                double area=(double)(length*breadth);
                return area;
            }

    @Override
    public String toString()
            {
                String full=new String();
                full="The color Rectangle is "+Shape.color;
                return full;
            }
}
