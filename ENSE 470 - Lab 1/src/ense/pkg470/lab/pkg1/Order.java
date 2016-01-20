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
public class Order 
{
    private String dateReceived;
    private Boolean isPrepaid;
    private String orderNumber; 
    private Double totalCost;
    private List<OrderLine> orderItems = new ArrayList<OrderLine>();
    
    Order()
    {
        this.dateReceived = "";
        this.isPrepaid = false;
        this.orderNumber = "";
        this.totalCost = 0.0;
    }
    Order(String inDateReceived, Boolean inIsPrepaid, String inOrderNumber, Double inMoney, List<OrderLine> inOrderItems)
    {
        this.dateReceived = inDateReceived;
        this.isPrepaid = inIsPrepaid;
        this.orderNumber = inOrderNumber;
        this.orderItems.addAll(inOrderItems);
        // totalCost = sum of each orderItem's total cost
        for (int i = 0; i < orderItems.size(); i++)
        {
            this.totalCost += orderItems.get(i).getTotalCost();
        }
    }
    void dispatch()
    {
        // send picker to go grab items
    }
    void close()
    {
        // create a boolean orderClosed that 
        // this.orderClosed = true; 
    }
}
