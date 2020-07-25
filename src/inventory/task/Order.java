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
public class Order {
    public String customerName;
    public double orderTotal;
   ArrayList <Item> orderItems= new ArrayList();
   
    
    public void addItems(Item i)
    {
        orderItems.add(i);
    }
    
    public void removeItem(Item i)
    {
        orderItems.remove(i);
    }
    

    
    @Override
    public String toString()
    {
        return "Customer Name: "+this.customerName +"  Order Total: "+ this.orderTotal +"  Order Items: "+this.orderItems;
    }
}

