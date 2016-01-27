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
public class CorporateCustomer extends BusinessCustomer 
{ 
    private double currentBill;
    private String emailAddress;
    
    
    public CorporateCustomer()
    {
        this.name = "";
        this.address = "";
        this.creditRating = 0;
        this.order = null;
        this.currentBill = 0.0;
        emailAddress = "";
    }
    
    public CorporateCustomer(String inName, String inAddress, int inCreditRating, Order inOrder, double inBill)
    {
        this.name = inName;
        this.address = inAddress;
        this.creditRating = inCreditRating;
        this.order = inOrder;
        this.currentBill = inBill;
    }
    
    public CorporateCustomer(String inName, String inAddress, int inCreditRating, double inBill)
    {
        this.name = inName;
        this.address = inAddress;
        this.creditRating = inCreditRating;
        this.currentBill = inBill;
    }
    
    /*
    Purpose: Return the contact name of the customer
    Input: none
    Output: String - the name of the Corporate custoimer
    */
    public String getContactName()
    {
        return this.name;
    }
    
    /*
    Purpose: get the total cost of the items in the cart
    Input: none
    Output: double - the total cost of the cart 
    */
    public double getBill()
    {
        return this.currentBill;
    }
    
    /*
    Purpose: 
    Input: 
    Output:
    */
    public double billForMonth()
    {
        // I am assuming this will return the total bill that the corporate employee will receive at the end of the month
        return getBill();
    }
    
    /*
    Purpose: placeholder for emailing the customer using their built in email address
    Input: none
    Output: email sent
    */
    public void remind()
    {
        // email the individual with what their current bill for the month is.
    }
}
