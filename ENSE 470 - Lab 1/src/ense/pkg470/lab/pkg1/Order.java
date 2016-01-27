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
        this.orderNumber = generateOrderNumber();
        this.totalCost = 0.0;
    }
    Order(Boolean inIsPrepaid, List<OrderLine> inOrderItems, int inCreditRating)
    {
        this.dateReceived = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.isPrepaid = inIsPrepaid;
        this.orderNumber = generateOrderNumber();
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
    
    /*
    Purpose: getter for date received 
    Input: none
    Output: String - date received 
    */
    public String getDateReceived()
    {
        return this.dateReceived;
    }
    
    /*
    Purpose: getter for order number
    Input: none
    Output: Int - order number
    */
    public int getOrderNumber()
    {
        return this.orderNumber;
    }
    
    /*
    Purpose: getter for total cost of the order
    Input: none
    Output: double - total cost of the order
    */
    public double getTotalCost()
    {
        reevaluateTotalCost();
        return this.totalCost;
    }
    
    /*
    Purpose: add Orderline item to the orderline
    Input: Orderline - line that you want to add to the order
    Output: none
    */
    public void addOrderLine(OrderLine inOrderLine)
    {
        // check for if there is the same product in the orderLine already, if so increment the quantity of the orderline variable
        for (int i = 0; i < this.orderItems.size(); i++)
        {
            if (inOrderLine.getProductName() == this.orderItems.get(i).getProductName())
            {
                // increment the quantity for the number of items the user has requested
                for (int j = 0; j < inOrderLine.getQuantity(); j++)
                {
                    this.orderItems.get(i).incrementQuantity();
                }
                reevaluateTotalCost();
                return;
            }
        }
        // otherwise just add it to the orderline
        this.orderItems.add(inOrderLine);
        reevaluateTotalCost();
    }
    
    /*
    Purpose: placeholder for sending message to the mailingroom to send off a package
    Input: 
    Output:
    */
    public void dispatch()
    {
        // send picker to go grab items
    }
    
    /*
    Purpose: Evaluate the user's credit rating and determine if they are suiting to have the order added to credit
    Input: the user's creditRating
    Output: true or false if the credit rating is enough for post paid system
    */
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
    
    /*
    Purpose: placeholder for closing the order once it has been shipped out. It would need to report to the database and state that it is done. 
    Input: 
    Output:
    */
    public void close()
    {
        // delete the order?
    }
    
    /*
    Purpose: print the order in a pretty format
    Input: String - user's name
    Output: Order that is printed to the command line
    */
    public void printOrder(String userName)
    {
        int PAGE_WIDTH = 30;
        String orderLineAligner = "%-15s:%7s:%3s\n";
        String bottomOfPageArea = "%" + PAGE_WIDTH + "s\n";
                
        printPrettyDivider(PAGE_WIDTH + 5);
        System.out.println("Cart ");
        System.out.println("User: " + userName);
        System.out.println("Date Received: " + this.dateReceived);
        System.out.println("Order number: " + this.orderNumber);
        printPrettyDivider(PAGE_WIDTH);
        
        System.out.format(orderLineAligner, "Product Name", "Cost", "Quantity");
        for(int i = 0; i < orderItems.size(); i++)
        {
            orderItems.get(i).printOrderLine(orderLineAligner);
            printPrettyDivider(PAGE_WIDTH);
        }
        System.out.format(bottomOfPageArea, "Order Total: $" + this.totalCost);
        if (this.isPrepaid == true)
        {
            System.out.format(bottomOfPageArea, "This must be a prepaid order");
        }
        else
        {
            System.out.format(bottomOfPageArea, "This can be a postpaid order");
        }
        printPrettyDivider(PAGE_WIDTH + 5);
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
    
    /*
    Purpose: reset the total cost of the cart and then recheck it
    Input: none
    Output: none - totalCost is reset
    */
    private void reevaluateTotalCost()
    {
        this.totalCost = 0.0;
        for (int i = 0; i < orderItems.size(); i++)
        {
            this.totalCost += orderItems.get(i).getTotalCost();
        }
    }
    
    /*
    Purpose: print a divider for the order based on the given length
    Input: int - length of divider
    Output: command line printout
    */
    private void printPrettyDivider(int length)
    {
        for(int i = 0; i < length; i++)
        {
            System.out.print("-");
        }  
        System.out.print('\n');
    }
}
