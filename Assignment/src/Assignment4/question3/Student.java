/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4.question3;

/**
 *3.	Create a superclass, Student, and two subclasses, Undergrad and Grad. 
 * The superclass Student should have the following data members: name, ID, grade, age, and address. 
 * The superclass, Student should have at least one method: boolean isPassed (double grade). 
 * The purpose of the isPassed method is to take one parameter, grade (value between 0 and 100) and check whether the grade 
 * has passed the requirement for passing a course. In the Student class this method should be empty as an abstract method. 
 * The two subclasses, Grad and Undergrad, will inherit all data members of the Student class and override the method isPassed. 
 * For the UnderGrad class, if the grade is above 70.0, then isPassed returns true, otherwise it returns false. 
 * For the Grad class, if the grade is above 80.0, then isPassed returns true, otherwise returns false.
 * 
 * @author bhattaraib58
 */
public abstract class Student
{
    private int ID;
    private int grade;
    private int age;
    private String address=new String();
    
    Student(int id,int g,int a,String add)
    {
        ID=id;
        grade=g;
        age=a;
        address=add;
    }
    
    
    abstract boolean isPassed(double grade);
}
