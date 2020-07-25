/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.task;

import java.util.ArrayList;

/**
 *
 * @author Azfar
 */
public class Inventory {
    
    ArrayList <Item>  inv = new ArrayList();
    ArrayList <Order> ord = new ArrayList();
    
    
    public void addInventory(Item i)
    {
        inv.add(i);
        
    }
    
   
    
    public String getinventory()
    {
        return "Inventory: "+this.inv;
        
        
    }
    
    public void addOrder(Order o)
    {
        ord.add(o);
        
    }
    
    public String getOrder()
    {
        return "Your Order: "+this.ord;
    }
    
    @Override
    public String toString()
    {
        return "Total Inventory: "+this.inv+"\nTotal Order: "+this.ord;
    }
    
}
