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
    List<Order> Orders =  new ArrayList<Order>();
    
    
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public int getCreditRating()
    {
        return this.creditRating;
    }
    public List<Order> getOrderList()
    {
        return this.Orders;
    }
    public void addOrder(Order inOrder)
    {
        Orders.add(inOrder);
    }
}
