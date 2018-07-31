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
    private String name;
    private long phoneno;
    private String type;
    private String size;
    private boolean topping_Extracheese=false;
    private boolean topping_salami=false;
    private boolean topping_sausage=false;
    private boolean topping_pepproni=false;
    
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
    
    public boolean getToppingExtracheese()
    {
        return this.topping_Extracheese;
    }
    
    public boolean getToppingSalami()
    {
        return this.topping_salami;
    }
    
    public boolean getToppingSausage()
    {
        return this.topping_sausage;
    }
    
    public boolean getToppingPepproni()
    {
        return this.topping_pepproni;
    }
    
    public void setName(String name)
    {
        this.name=name;
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
    
    public void setToppingExtracheese(Boolean ec)
    {
        this.topping_Extracheese=ec;
    }
    
    
    public void setToppingSalami(Boolean sl)
    {
        this.topping_salami=sl;
    }
    
    public void setToppingSausage(Boolean su)
    {
        this.topping_sausage=su;
    }
    public void setToppingPepproni(Boolean pp)
    {
        this.topping_pepproni=pp;
    }
}
