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
    public CorporateCustomer(String inName,String inAddress, int inCreditRating, Order inOrder, double inBill)
    {
        this.name = inName;
        this.address = inAddress;
        this.creditRating = inCreditRating;
        this.order = inOrder;
        this.currentBill = inBill;
    }
    public CorporateCustomer(String inName,String inAddress, int inCreditRating, double inBill)
    {
        this.name = inName;
        this.address = inAddress;
        this.creditRating = inCreditRating;
        this.currentBill = inBill;
    }
    public String getContactName()
    {
        return this.name;
    }
    public double getBill()
    {
        return this.currentBill;
    }
    public double BillForMonth()
    {
        // I am assuming this will return the total bill that the corporate employee will receive at the end of the month
        return getBill();
    }
    public void remind()
    {
        // email the individual with what their current bill for the month is.
    }
}
