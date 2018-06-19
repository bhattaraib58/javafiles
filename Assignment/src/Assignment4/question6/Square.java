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
public class Square  extends Rectangle
{
    //as it is square it has length and width equal
    Square()
    {
        
    }
    Square(double side)
    {
        super(side,side);
    }
    Square(double side,String color,boolean filled)
    {
         super( side, side, color, filled);
    }
  
    double getSide()
    {
        return width; //or length
    }
    void setSide(double side)
    {
        this.width=side;
        this.length=side;
    }
    void setWidth(double width)
    {
        this.width=width;    
    }
    void setLength(double length)
    {
        this.length=length;
    }
    @Override
    public String toString()
    {
        return "The color of Square is ::"+color;
    }
    
}
