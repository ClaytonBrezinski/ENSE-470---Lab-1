/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.lab.pkg1;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
/**
 *
 * @author Dolan
 */
public class Order 
{
    private String dateReceived;
    private Boolean isPrepaid;
    private int orderNumber; 
    private double totalCost;
    private List<OrderLine> orderItems = new ArrayList<OrderLine>();
    // private Customer customer = new Customer();
    
    Order()
    {
        this.dateReceived = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.isPrepaid = false;
        this.orderNumber = 0;
        this.totalCost = 0.0;
    }
    Order(Boolean inIsPrepaid, List<OrderLine> inOrderItems, int inCreditRating)
    {
        this.dateReceived = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.isPrepaid = inIsPrepaid;
        this.orderNumber = generateOrderNumber();  // WW We should assign this to the user
        this.orderItems.addAll(inOrderItems);
        // totalCost = sum of each orderItem's total cost
        for (int i = 0; i < orderItems.size(); i++)
        {
            this.totalCost += orderItems.get(i).getTotalCost();
        }
        if (checkCreditRating(inCreditRating) == false && this.isPrepaid == false)
        {
            this.isPrepaid = true;
        }
    }
    public String getDateReceived()
    {
        return this.dateReceived;
    }
    public int getOrderNumber()
    {
        return this.orderNumber;
    }
    public double getTotalCost()
    {
        reevaluateTotalCost();
        return this.totalCost;
    }
    public void addOrderLine(OrderLine inOrderLine)
    {
        this.orderItems.add(inOrderLine);
    }
    public void dispatch()
    {
        // send picker to go grab items
    }
    private boolean checkCreditRating(int inCreditRating)
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
        else 
        {
            return false; 
        }
    }
    public void close()
    {
        // delete the order?
    }
    public void printOrder()
    {
        int PAGE_WIDTH = 25;
        System.out.println("Date Received: " + this.dateReceived);
        System.out.println("Order numer: " + this.orderNumber);
        System.out.println("Cart ");
        for(int i = 0; i < PAGE_WIDTH; i++)
        {
            System.out.println("-");
        }
        for(int i = 0; i < orderItems.size(); i++)
        {
            orderItems.get(i).printOrderLine();
            for(int j = 0; j < PAGE_WIDTH; j++)
            {
                System.out.println("-");
            }
        }
        System.out.format("%-25s\n", this.totalCost);
        if (this.isPrepaid == true)
        {
            System.out.format("%-25s\n", "This must be a prepaid order");
        }
        else
        {
            System.out.format("%-25s\n", "This can be a postpaid order");
        }
    }
    /*
    Purpose: Generate random number with 6 digits, check that it isnt used by any other user, if not give the user the order number
    Input: none
    Output: Int - order number for user
    */
    private int generateOrderNumber()
    {
        int MIN = 100000;
        int MAX = 900000;
        // the code commented out here simulates that there is a database of orderNumbers that the 
        int orderNumber = 0;
        // while (duplicateInDatabase(ordeNumber) == true)
        //{
            Random rnd = new Random();
            orderNumber = MIN + rnd.nextInt(MAX);
        //}
        return orderNumber;
    }
    private void reevaluateTotalCost()
    {
        for (int i = 0; i < orderItems.size(); i++)
        {
            this.totalCost += orderItems.get(i).getTotalCost();
        }
    }
}
