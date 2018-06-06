/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author Admin
 */
public class AverageValueOfFloatingTypeArray
{
        public static void main(String[] args)
        {
            // initializing float array
      float floatNewArray[] = new float[] {1.23f, 5f, 3f, 2f, 9f};
            float avg=0,sum=0;
        for(int i=0;i<floatNewArray.length;i++)
        {
            sum+=floatNewArray[i];
        }
        System.out.println("The Sum is: "+sum);
        avg=sum/floatNewArray.length;
        System.out.println("The Average is: "+avg);
            
        }
}
