/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question3;

/**
 *
 * @author bhattaraib58
 */
public class Undergrad extends Student
{
    Undergrad(int id,int g,int a,String add)
            {
                super(id,g,a,add);
            }
    @Override
    boolean isPassed(double grade)
    {
        if(grade>70)
            return true;
        else
            return false;
    }
}
