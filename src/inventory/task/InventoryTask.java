/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.task;


import java.util.Scanner;

/**
 *
 * @author Azfar
 */
public class InventoryTask {

    
    public static void main(String[] args) 
    {
        Inventory inv = new Inventory();
        Order ord = new Order() ;
        int quanReq;
       
        
        int buttonPressed;
        Scanner input = new Scanner(System.in);
      
        
       System.out.println("This program is developed by Asfar Horani");
       System.out.println(" ");
        System.out.println("WELCOME TO EXPRESS BUCKET OUTLET.");
        System.out.println("==========================");
        do{
          
            System.out.println(" ");
        System.out.println("Please Select an action.");
        System.out.println("1. Add inventory");
        System.out.println("2. Add Order");
        System.out.println("3. Show inventory");
        System.out.println("4. Show orders");
        System.out.println("5. Show Complete Details");
        System.out.println("0. Exit\n");
        
        buttonPressed = input.nextInt();
        if(buttonPressed == 1)
        {
             System.out.println("Please select catogory: ");
              System.out.println("1. Clothes. \n2. Cosmetics. \n3. Electronics.\n");
              buttonPressed = input.nextInt();
               System.out.println(" ");
              if(buttonPressed ==1)
              {
                  
                  System.out.print("Item name: ");
                    String name = input.next();
                    System.out.print("Price: ");
                      double price = input.nextDouble();
                  System.out.print("Quantity: ");
                  int quantity = input.nextInt();
            
                    inv.addInventory(new Item(name,price,quantity));
              }
               else if(buttonPressed==2)
               {
                  
                   System.out.print("Item name: ");
                    String name = input.next();
                    System.out.print("Price: ");
                      double price = input.nextDouble();
                  System.out.print("Quantity: ");
                  int quantity = input.nextInt();
            
                    inv.addInventory(new Item(name,price,quantity));;
               }
               else if(buttonPressed == 3) 
              {
                  
                   System.out.print("Item name: ");
                    String name = input.next();
                    System.out.print("Price: ");
                      double price = input.nextDouble();
                  System.out.print("Quantity: ");
                  int quantity = input.nextInt();
            
                    inv.addInventory(new Item(name,price,quantity));
              }
       
        }
        else if(buttonPressed==2)
        {
            do{
            
               System.out.println(" ");
            System.out.println(inv.getinventory());
            System.out.println(" ");
            System.out.print("Please select Item from list to Order \n>:");
            String name = input.next();
            System.out.print("Quantity: ");
             quanReq = input.nextInt();
           
                     for(Item i : inv.inv) {
                          if(i.name.equals(name)) 
                          {
                 
                                  if(quanReq>i.getQuantity())
                             {
                                      System.out.println("Error: item is not available in required quantity"); 
                                  }
                             
                                  else{
                                ord.addItems(new Item(i.name,i.getPrice(),quanReq));
                                ord.orderTotal += quanReq * i.getPrice();
                                i.setQuantity(i.getQuantity()-quanReq);

                                 }
              
                                        }
                     }
               System.out.println(" ");
               System.out.println("Want to buy more items?");
               System.out.println("1. Yes \n2.Remove item \n3. No just place my order \n>:");
               buttonPressed=input.nextInt();
               System.out.println(" ");
              
               
            if(buttonPressed==2)
            {
               
                 System.out.print(inv.getOrder());
                 System.out.print("Enter name of item you want to remove: ");
                name = input.next();
                for(Item i : ord.orderItems) {
               if(i.name.equals(name)) {
                 i.setQuantity(quanReq + i.getQuantity());
                  ord.removeItem(i);
                 ord.orderTotal=ord.orderTotal-(i.getPrice()*i.getQuantity()); 
                 
                 System.out.println("Selected Item has been removed from list");
                 System.out.println(inv.getOrder());
               
              }
              
                } 
            }
            }while(buttonPressed!=3);
      
          System.out.print("Customer Name: ");
         ord.customerName= input.next();
   
         inv.addOrder(ord);
         System.out.println("\nYour Order has been placed");
           System.out.println("===========================");
         System.out.println(inv.getOrder());
         System.out.println(" ");
      
    
        
            }
        else if(buttonPressed==3)
        {
            System.out.println(inv.getinventory());
             
        }
        else if(buttonPressed==4)
        {
             System.out.println(inv.getOrder());
         
        }
        else if(buttonPressed==5)
        {
             System.out.println(inv.toString());
        }
        
        
        }while(buttonPressed!=0); 
       
    }
        
    
}