/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;

/**
 *
 * @author Admin
 */

public class Pizza implements Serializable
{
    private String orderID;
    private String name;
    private long phoneno;
    private String type;
    private String size;
    private String[] toppings;
    
    public String getOrderID()
    {
        return this.orderID;
    }
    
    public String getName()
    {
        return this.name;
    }
    public long getPhoneno()
    {
        return this.phoneno;
    }
    public String getType()
    {
        return this.type;
    }
    public String getSize()
    {
        return this.size;
    }
    
    public String[] getToppings()
    {
        return this.toppings;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setOrderID(String orderID)
    {
        this.orderID=orderID;
    }
    public void setPhone(long phoneno )
    {
        this.phoneno=phoneno;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public void setSize(String size)
    {
        this.size=size;
    }
    public void setToppings(String[] toppings)
    {
        this.toppings=toppings;
    }
}