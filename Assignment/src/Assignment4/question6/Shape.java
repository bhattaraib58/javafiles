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
public class Shape
{
    String color="red";
    boolean filled=true;
    Shape()
    {
        
    }
    Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    String getColor()
    {
        return color;
    }
    void setColor(String color)
    {
        this.color=color;
    }
    boolean isFilled()
    {
        return filled;
    }
    void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    @Override
    public String toString()
    {
        return "The color of Shape is ::"+color;
    }
}
