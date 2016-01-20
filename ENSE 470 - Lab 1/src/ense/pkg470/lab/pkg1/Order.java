/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.lab.pkg1;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    // private Customer customer = new Customer();
    
    Order()
    {
        
        this.dateReceived = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.isPrepaid = false;
        this.orderNumber = "";
        this.totalCost = 0.0;
    }
    Order( Boolean inIsPrepaid, String inOrderNumber, Double inMoney, List<OrderLine> inOrderItems)
    {
        this.dateReceived = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.isPrepaid = inIsPrepaid;
        this.orderNumber = inOrderNumber;
        this.orderItems.addAll(inOrderItems);
        // totalCost = sum of each orderItem's total cost
        for (int i = 0; i < orderItems.size(); i++)
        {
            this.totalCost += orderItems.get(i).getTotalCost();
        }
        if (checkCreditRating() == false && this.isPrepaid == false)
        {
            this.isPrepaid = true;
        }
    }
    void dispatch()
    {
        // send picker to go grab items
    }
    public boolean checkCreditRating(int inCreditRating)
    {
        // min credit rating should be determined by the total price of the order/ 10
        double minCreditRating = totalCost/10;
        if (inCreditRating >= minCreditRating)
        {
            return true;
        }
        else if (inCreditRating <= minCreditRating)
        {
            return false;
        }
    }
    void close()
    {
        // create a boolean orderClosed that 
        // this.orderClosed = true; 
    }
}
