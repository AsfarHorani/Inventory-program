/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.task;

/**
 *
 * @author Azfar
 */
public class Item {
    public String name;
     private double price; 
     private int quantity; 
   
    
    public Item() //constructor 1
    {
    }
   
    public Item(String n, double p, int q) //constructor 2
    {
        this.name = n;
        this.price = p;
        this.quantity = q;
    }
    
    public void setQuantity(int q) //setting quantity
    {
        this.quantity = q;
    }
    
    public int getQuantity()       //getting quantity
    {
       return this.quantity;
    }
    
    public void setPrice(double p)
    {
        this.price = p;
    }
    
    public double getPrice()
    {
    return this.price;
    }
    
    @Override
    public String toString()
    {
        return "Type: " + this.getClass().getSimpleName() +"."+" Name: "+ this.name +"."+" Quantity: "+this.quantity+"."+" Price: "+this.price;
    }
    
}


class Clothes extends Item
{
    public Clothes(String n, double p, int q) //constructor 2
    {
        super(n,p,q);
       
    }
    
    
}


class Cosmetics extends Item
{
     public Cosmetics(String n, double p, int q) //constructor 2
    {
        super(n,p,q);
       
    }
    
}


class Electronics extends Item
{
     public Electronics(String n, double p, int q) //constructor 2
    {
        super(n,p,q);
   
    }
}