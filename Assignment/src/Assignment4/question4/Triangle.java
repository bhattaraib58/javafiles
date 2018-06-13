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
public class Triangle implements Shape
{
    private int base;
    private int height;
    Triangle (int b, int h)
    {
        base=b;
        height=h;
    }
    @Override
    public double getArea()
    {
        double area;
        area = (base*height)*1/2;
        return area;
    }
    @Override
    public String toString()
            {
                String full=new String();
                full="The color Traingle is "+Shape.color;
                return full;
            }
    
}
