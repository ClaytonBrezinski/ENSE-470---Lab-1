/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.lab.pkg1;
import java.util.*;
/**
 *
 * @author Dolan
 */
public class BusinessCustomer 
{
    String name;
    String address;
    int creditRating; 
    Order order= new Order();
    
    /*
    Purpose: getter for name
    Input: none
    Output: String - name
    */
    public String getName()
    {
        return this.name;
    }
    
    /*
    Purpose: getter for address
    Input: none
    Output: Sting address
    */
    public String getAddress()
    {
        return this.address;
    }
    
    /*
    Purpose: getter for credit rating
    Input: none
    Output: int - credit rating
    */
    public int getCreditRating()
    {
        return this.creditRating;
    }
    
    /*
    Purpose: getter for order
    Input: none
    Output: Order - Order
    */
    public Order getOrder()
    {
        return this.order;
    }
    
    /*
    Purpose: Add an orderline to the order's list
    Input: OrderLine - line you want to add to the orderr
    Output: none
    */
    public void addOrderLine(OrderLine inOrderLine)
    {
        this.order.addOrderLine(inOrderLine);
    }
    
    /*
    Purpose: return the total order cost
    Input: none
    Output: double - total cost of the order
    */
    public double getOrderTotalCost()
    {
        return this.order.getTotalCost();
    }
    
    /*
    Purpose: to print out the contents of the cart
    Input: none
    Output: prints to the command line, the contents of the cart
    */
    public void viewCart()
    {
        this.order.printOrder(this.name);
    }
}
